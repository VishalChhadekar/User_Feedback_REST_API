package com.userfeedback.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.userfeedback.entity.Feedback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
/*
 * By default the DataJpa replace/configure the dataSource with Embedded
 * database, with these two annotations, it will avoid to autoConfiguer that, so
 * we won't get any error
 */
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) By default @Data
class CrudRepositoryTest {

	@Autowired
	private CrudRepository crudRepository;

	@Test
	void testRepositotyLayer() {
		Feedback feedback = Feedback.builder().feedback("Demo feedback, to check repositoty layer").id(1).build();
		Feedback returnedFeedback = crudRepository.save(feedback);
		// verify
		assertThat(returnedFeedback).isNotNull();
		assertThat(returnedFeedback.getId()).isGreaterThan(0);

	}

}
