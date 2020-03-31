package com.bridgelabz.moodanalyser;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import  com.bridgelabz.MoodAnalyser;

public class MoodAnalyserReflector {
    public static MoodAnalyser createMoodAnalyserObject(String msg) throws MoodAnalyserException, MoodAnalyserException {
        try {
            Class<?> moodAnalyserClass = Class.forName("com.bridgelabz.MoodAnalyser");
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
            Class<?> moodAnalyzerClass = Class.forName("com.corejava.MoodAnalyzer");
            Constructor<?> moodConstructor = moodAnalyzerClass.getConstructor(Integer.class);
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

    public static Object invokeMethod(Object moodAnalyseObject, String message) throws MoodAnalyserException {
        try {
            return moodAnalyseObject.getClass().getMethod(message).invoke(moodAnalyseObject);
        }
        catch (NoSuchMethodException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.NO_SUCH_METHOD, "NO_SUCH_METHOD_ERROR");
        }
        catch (IllegalAccessException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.NO_ACCESS, "NO_ACCESS");
        }
        catch (InvocationTargetException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.METHOD_INVOCATION_ISSUE, "METHOD_INVOCATION_ISSUE");
        }
    }

    }
