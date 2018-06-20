package com.test.task.service;

import com.test.task.model.Word;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WordService {
    List<Word> findAll();
    void addWord(Word word);
    void addWords(List<Word> words);
    void removeWord(Word word);
    long count();
}
