package com.test.task.service;

import com.test.task.model.Word;
import com.test.task.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    private WordRepository wordRepository;

    @Override
    public List<Word> findAll() {
        return wordRepository.findAll();
    }

    @Override
    public void addWord(Word word) {
        wordRepository.save(word);
    }

    @Override
    public void addWords(List<Word> words) {
        wordRepository.saveAll(words);
    }

    @Override
    public void removeWord(Word word) {
        wordRepository.delete(word);
    }

    @Override
    public long count() {
        return wordRepository.count();
    }
}
