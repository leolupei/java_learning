package com.example.java_learning_week3.Model;

public class GetRandomNumbersResponse {
    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public String getRandomNumbersText() {
        return randomNumbersText;
    }

    public void setRandomNumbersText(String randomNumbersText) {
        this.randomNumbersText = randomNumbersText;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(long timeInterval) {
        this.timeInterval = timeInterval;
    }

    private long beginTime;
    private long endTime;
    private long timeInterval;
    private String randomNumbersText;
}
