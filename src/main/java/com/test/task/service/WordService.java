package com.test.task.service;

import com.test.task.model.Word;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Word service layer.
 * @author Dmitry Karmanov
 * @version 1.0
 */
public interface WordService {
    List<Word> findAll();
    void addWord(Word word);
    void addWords(List<Word> words);
    void removeWord(Word word);
    long count();
}
