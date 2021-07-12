package com.license.dojoOverFlow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.license.dojoOverFlow.models.Answer;

public interface AnswerRepo extends CrudRepository<Answer, Long> {
	List<Answer> findAll();
}
