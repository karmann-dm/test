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
}
