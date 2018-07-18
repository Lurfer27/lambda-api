package com.gsam.model;

public class NumberEntity {

    private int value;
    private String inEnglish;
    private String inSpanish;

    public NumberEntity(int value, String inEnglish, String inSpanish) {
        this.value = value;
        this.inEnglish = inEnglish;
        this.inSpanish = inSpanish;
    }

    public int getValue() {
        return value;
    }

    public String getInEnglish() {
        return inEnglish;
    }

    public String getInSpanish() {
        return inSpanish;
    }

    @Override
    public String toString() {
        return "NumberEntity{" +
                "value=" + value +
                ", inEnglish='" + inEnglish + '\'' +
                ", inSpanish='" + inSpanish + '\'' +
                '}';
    }
}
