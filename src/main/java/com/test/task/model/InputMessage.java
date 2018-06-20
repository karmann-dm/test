package com.test.task.model;

/**
 * DTO Input message class.
 * @author Dmitry Karmanov
 * @version 1.0
 */
public class InputMessage {
    private String string;

    public InputMessage() {}
    public InputMessage(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
