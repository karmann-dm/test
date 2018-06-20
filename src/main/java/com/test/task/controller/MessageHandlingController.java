package com.test.task.controller;

import com.test.task.model.InputMessage;
import com.test.task.model.ReverseStringMessage;
import com.test.task.model.Word;
import com.test.task.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Websocket message handling controller.
 * @author Dmitry Karmanov
 * @version 1.0
 */
@Controller
public class MessageHandlingController {
    @Autowired
    private WordService wordService;

    /**
     * Message mapper to reverse input string.
     * @param message {@link InputMessage} Input message containing string.
     * @return ReverseStringMessage Message with list of reversed strings.
     * @throws Exception If adding a word went with an error.
     */
    @MessageMapping("/reverse-string")
    @SendTo("/topic/tr")
    public ReverseStringMessage greeting(InputMessage message) throws Exception {
        wordService.addWord(new Word(message.getString()));
        return new ReverseStringMessage(wordService.findAll());
    }
}
