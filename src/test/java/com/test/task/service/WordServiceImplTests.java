package com.test.task.service;

import com.test.task.TaskApplication;
import com.test.task.model.Word;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TaskApplication.class})
public class WordServiceImplTests {
    @Autowired
    private WordService wordService;

    private Logger logger = LoggerFactory.getLogger(WordServiceImplTests.class);

    @Test
    public void addWord() {
        Word w1 = new Word("qwe");
        assertThat(w1.getReversedWord()).isEqualTo("ewq");
        wordService.addWord(w1);
        assertThat(wordService.findAll()).hasSize(1);
    }
}
