package com.bridgelabz.moodanalyser;


import com.bridgelabz.MoodAnalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory {
    public static MoodAnalyser createMoodAnalyserObject(String msg) throws MoodAnalyserException {
        try {
            Class<?> moodAnalyserClass = Class.forName("com.corejava.MoodAnalyser");
            Constructor<?> moodConstructor = moodAnalyserClass.getConstructor(String.class);
            return (MoodAnalyser) moodConstructor.newInstance(msg);
        }
        catch (ClassNotFoundException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.NO_SUCH_CLASS, "NO_SUCH_CLASS_ERROR");
        }
        catch (InstantiationException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.OBJECT_CREATION_ISSUE, "OBJECT_CREATION_ISSUE");
        }
        catch (InvocationTargetException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.METHOD_INVOCATION_ISSUE, "METHOD_INVOCATION_ISSUE");
        }
        catch (NoSuchMethodException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.NO_SUCH_METHOD, "NO_SUCH_METHOD_ERROR");
        }
        catch (IllegalAccessException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.NO_ACCESS, "NO_ACCESS");
        }
    }

    public static MoodAnalyser createMoodAnalyserObject() throws MoodAnalyserException {
        try {
            Class<?> moodAnalyserClass = Class.forName("com.corejava.MoodAnalyser");
            Constructor<?> moodConstructor = moodAnalyserClass.getConstructor(Integer.class);
            return (MoodAnalyser) moodConstructor.newInstance();
        }
        catch (ClassNotFoundException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.NO_SUCH_CLASS, "NO_SUCH_CLASS_ERROR");
        }
        catch (InstantiationException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.OBJECT_CREATION_ISSUE, "OBJECT_CREATION_ISSUE");
        }
        catch (InvocationTargetException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.METHOD_INVOCATION_ISSUE, "METHOD_INVOCATION_ISSUE");
        }
        catch (NoSuchMethodException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.NO_SUCH_METHOD, "NO_SUCH_METHOD_ERROR");
        }
        catch (IllegalAccessException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.NO_ACCESS, "NO_ACCESS");
        }
    }


}
