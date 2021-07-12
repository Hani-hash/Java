package com.license.dojoOverFlow.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.license.dojoOverFlow.models.Answer;
import com.license.dojoOverFlow.models.Question;
import com.license.dojoOverFlow.models.Tag;
import com.license.dojoOverFlow.models.tagQuestion;
import com.license.dojoOverFlow.repositories.AnswerRepo;
import com.license.dojoOverFlow.repositories.QuestionRepo;
import com.license.dojoOverFlow.repositories.TagQuestionRepo;
import com.license.dojoOverFlow.repositories.TagRepo;

@Service
public class ApiService {
	private final QuestionRepo Quest;
	private final AnswerRepo Answ;
	private final TagRepo Ta;
	private final TagQuestionRepo tag_quest;

	public ApiService(QuestionRepo Quest, AnswerRepo Answ, TagRepo Ta, TagQuestionRepo tag_quest) {
		this.Answ = Answ;
		this.Quest = Quest;
		this.tag_quest = tag_quest;
		this.Ta = Ta;
	}

	public Question createNew(Question first_question) {
		return Quest.save(first_question);
	}

	public Answer createNewaa(Answer first_answer) {
		return Answ.save(first_answer);
	}

	public Tag createNewtag(Tag first_tag) {
		return Ta.save(first_tag);
	}

	public tagQuestion createNewRel(tagQuestion var) {
		return tag_quest.save(var);
	}

	public List<Question> findAllQuestions() {
		return Quest.findAll();
	}

	public List<Answer> findAllAnswer() {
		return Answ.findAll();
	}

	public List<Tag> findAllTag() {
		return Ta.findAll();
	}

	public TagQuestionRepo getTag_quest() {
		return tag_quest;
	}

//	public Tag find(String asd) {
//		return Ta.findByIgnoreCase(asd);
//	}
	public Tag findSpecificTagbyName(String Sub) {
		return Ta.findBySubjectIgnoreCase(Sub);
	}
	
	public Question findById(Long id) {
		Question asd = Quest.findById(id).get();
		return asd;
		
		}

	public void CheckAndSaveTag(List<String> tags, Question question) {

		Question saveQuestion = createNew(question);

		for (String check : tags) {

			if (findSpecificTagbyName(check) != null) {

				tagQuestion combine = new tagQuestion();
				combine.setTag(findSpecificTagbyName(check));
				combine.setQuastion(saveQuestion);
				createNewRel(combine);
			} else {

				Tag newTag = new Tag();
				newTag.setSubject(check);
				Tag cTag = createNewtag(newTag);

				tagQuestion combine = new tagQuestion();
				combine.setTag(cTag);
				combine.setQuastion(saveQuestion);
				createNewRel(combine);

			}
		}
		
	}

}
