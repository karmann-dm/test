package com.test.task.repository;

import com.test.task.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Word JPA repository.
 * @author Dmitry Karmanov
 * @version 1.0
 */
@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
}
