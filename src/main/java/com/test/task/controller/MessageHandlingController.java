package com.test.task.controller;

import com.test.task.model.InputMessage;
import com.test.task.model.ReverseStringMessage;
import com.test.task.model.Word;
import com.test.task.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageHandlingController {
    @Autowired
    WordService wordService;

    @MessageMapping("/reverse-string")
    @SendTo("/topic/tr")
    public ReverseStringMessage greeting(InputMessage message) throws Exception {
        wordService.addWord(new Word(message.getString()));
        return new ReverseStringMessage(wordService.findAll());
    }
}
