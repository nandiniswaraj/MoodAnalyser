package com.bridgelabz;

import com.bridgelabz.moodanalyser.MoodAnalyserException;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.length()<=0)
                throw new MoodAnalyserException(MoodAnalyserException.exceptionType.ENTERED_EMPTY,"ENTERED_EMPTY");
            if (message.contains("sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.exceptionType.ENTERED_NULL, "ENTERED_NULL");
        }
    }

    public boolean equals(Object another){
        if (this.message.equals(((MoodAnalyser)another).message))
            return true;
        return false;
    }

    public boolean equalsMethod_ForObject(Object another){
        if (this == another)
            return true;
        return false;
    }

}