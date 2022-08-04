package com.userfeedback.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userfeedback.entity.Feedback;
import com.userfeedback.repository.CrudRepository;

@Service
public class UserFeedbackServiceImp implements UserFeedbackService {

	@Autowired
	private CrudRepository crudRepository;

	@Override
	public Feedback saveFeedBack(Feedback feedback) {
		return crudRepository.save(feedback);
	}

}
