package com.test.task.model;

import java.util.List;

/**
 * DTO reverse strings message.
 * @author Dmitry Karmanov
 * @version 1.0
 */
public class ReverseStringMessage {
    private List<Word> words;

    public ReverseStringMessage() {
    }

    public ReverseStringMessage(List<Word> words) {
        this.words = words;
    }

    public List<Word> getStrings() {
        return words;
    }

    public void setStrings(List<Word> words) {
        this.words = words;
    }
}
