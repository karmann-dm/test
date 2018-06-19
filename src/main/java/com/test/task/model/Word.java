package com.test.task.model;

import javax.persistence.*;

@Entity
@Table(name = "words")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "reversed_word")
    private String reversedWord;

    public Word() {
    }

    public Word(String word) {
        this.reversedWord = new StringBuilder(word).reverse().toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReversedWord() {
        return reversedWord;
    }

    public void setReversedWord(String reversedWord) {
        this.reversedWord = reversedWord;
    }
}
