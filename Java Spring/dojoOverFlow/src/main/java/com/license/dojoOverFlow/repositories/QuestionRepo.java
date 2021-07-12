package com.license.dojoOverFlow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.license.dojoOverFlow.models.Question;

public interface QuestionRepo extends CrudRepository<Question, Long> {
	List<Question> findAll();

}
