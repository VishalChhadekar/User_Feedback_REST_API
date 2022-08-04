package com.userfeedback.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.userfeedback.Service.UserFeedbackService;
import com.userfeedback.entity.Feedback;

@WebMvcTest(Feedback.class)
class UserFeedbackControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserFeedbackService userFeedbackService;

	private Feedback feedback;

	@BeforeEach
	void setUp() {
		feedback.builder().feedback("Demo feeback note").id(1).build();
	}

	@Test
	void testSaveFeedBack() {
		Feedback inputFeedback = Feedback.builder().feedback("Demo feeback note").id(1).build();
		Mockito.when(userFeedbackService.saveFeedBack(inputFeedback)).thenReturn(feedback);
	}

}
