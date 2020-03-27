package com.bridgelabz.moodanalyser;

public class MoodAnalyserException extends Throwable
{
public enum exceptionType { ENTERED_NULL, ENTERED_EMPTY, NO_SUCH_CLASS, NO_SUCH_METHOD, METHOD_INVOCATION_ISSUE,
    NO_ACCESS, OBJECT_CREATION_ISSUE, NO_SUCH_FIELD,FIELD_SETTING_ISSUE};
    exceptionType type;

public MoodAnalyserException(String message) {
        super(message);
        }

public MoodAnalyserException( exceptionType type, String message) {
        super(message);
        this.type = type;
        }
        }
