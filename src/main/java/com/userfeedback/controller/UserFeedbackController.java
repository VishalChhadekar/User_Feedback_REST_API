package com.userfeedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userfeedback.Service.UserFeedbackService;
import com.userfeedback.entity.Feedback;

@RestController
public class UserFeedbackController {

	@Autowired
	private UserFeedbackService userFeedbackService;

	@PostMapping("/addfeedback")
	public Feedback saveFeedback(@RequestBody Feedback feedback) {
		// add feedback to database
		return userFeedbackService.saveFeedBack(feedback);
	}
}
