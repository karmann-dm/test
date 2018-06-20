package com.test.task.model;

import javax.persistence.*;

/**
 * Word JPA model.
 * @author Dmitry Karmanov
 * @version 1.0
 */
@Entity
@Table(name = "words")
public class Word {

    /**
     * Generated identity for table "words".
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "reversed_word")
    private String reversedWord;

    public Word() {}

    /**
     * Reversing constructor.
     * @param word {@link String} Word to reverse.
     */
    public Word(String word) {
        this.reversedWord = reverseString(word);
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

    public void setReversedWord(String word) {
        this.reversedWord = reverseString(word);
    }

    @Override
    public String toString() {
        return "Word [id = " + id + ", reversed = " + reversedWord + "]";
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
