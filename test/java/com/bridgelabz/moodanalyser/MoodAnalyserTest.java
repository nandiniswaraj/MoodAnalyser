package com.bridgelabz.moodanalyser;

import com.bridgelabz.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {

    @Test
    public void WhenMood_IsSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void WhenIn_AnyMood_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void whenMood_IsNull_ShouldReturn_CustomException_WithExceptionType(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            String mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e ) {
            Assert.assertEquals("ENTERED_NULL",e.getMessage());
        }
    }
    @Test
    public void whenMood_IsEmpty_ShouldReturn_CustomException_WithExceptionType(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            String mood = moodAnalyser.analyseMood();
        }catch (MoodAnalyserException e ) {
            Assert.assertEquals("ENTERED_EMPTY",e.getMessage());
        }
    }
    @Test
    public void whenMood_IsEqual_ShouldReturn_CustomException_WithEqual(){
        MoodAnalyser moodAnalyser= new MoodAnalyser("Hello");
        boolean result=moodAnalyser.equals("Hello");
        Assert.assertEquals(true,result);
    }
    @Test
    public void whenMood_ClassIsNotAvailable_ShouldReturn_CustomException_WithNoSuchClass() {
        try {
            MoodAnalyser moodAnalyser= MoodAnalyserFactory.createMoodAnalyserObject("MoodAnalysers");
            Assert.assertEquals("MoodAnalysers", moodAnalyser);

        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void whenMood_MethodIsNotAvailable_ShouldReturn_CustomException_WithNoSuchMethod() {
        try {
            MoodAnalyser moodAnalyser = MoodAnalyserFactory.createMoodAnalyserObject("");
            Assert.assertEquals("MoodAnalysis", moodAnalyser);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }
        @Test
        public void whenMood_IsHappy_ShouldReturn_Happy() {
            try {
                MoodAnalyser obj= MoodAnalyserReflector.createMoodAnalyserObject("Happy Mood");
                MoodAnalyser mood= (MoodAnalyser) MoodAnalyserReflector.invokeMethod(obj, "analyseMoood");
                Assert.assertEquals("Happy", mood);
            } catch (MoodAnalyserException e) {
                e.printStackTrace();
            }
        }

    @Test
    private void _IsIncorrectMethod_ShouldReturn_NoSuchMethodError() {
        try {
            MoodAnalyser obj= MoodAnalyserReflector.createMoodAnalyserObject("Sad Mood");
            Object mood= MoodAnalyserReflector.invokeMethod(obj,"analyseMood");
            Assert.assertEquals("Happy", mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }

    }


}
