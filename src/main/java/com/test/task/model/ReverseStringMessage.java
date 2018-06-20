package com.test.task.model;

import java.util.List;

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
