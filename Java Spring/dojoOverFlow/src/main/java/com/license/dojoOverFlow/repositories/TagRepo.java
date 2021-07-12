package com.license.dojoOverFlow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.license.dojoOverFlow.models.Tag;

public interface TagRepo extends CrudRepository<Tag, Long>{
	List<Tag> findAll();
	Tag findBySubjectIgnoreCase(String subject);

}
