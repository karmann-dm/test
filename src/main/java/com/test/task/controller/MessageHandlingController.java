package com.test.task.controller;

import com.test.task.model.Word;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;

@Controller
public class MessageHandlingController {
    @MessageMapping("/reverse-string")
    @SendTo("/tr")
    public List<Word> greeting(@Payload Word word) throws Exception {
        return Arrays.asList(new Word("1"), new Word("2"));
    }
}
