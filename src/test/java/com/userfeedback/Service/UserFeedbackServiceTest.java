package com.userfeedback.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.userfeedback.entity.Feedback;
import com.userfeedback.repository.CrudRepository;

@SpringBootTest
class UserFeedbackServiceTest {
	@MockBean
	private CrudRepository crudRepository;

	private Feedback feedback;

	@BeforeEach
	void setUp() {
		feedback.builder().feedback("Demo feeback note").id(1).build();
	}

	@Test
	void testSaveFeedBack() {
		Feedback inputFeedback = Feedback.builder().feedback("Demo feeback note").id(1).build();
		Mockito.when(crudRepository.save(inputFeedback)).thenReturn(feedback);
	}

}
