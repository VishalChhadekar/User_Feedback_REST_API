package com.userfeedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userfeedback.entity.Feedback;

@Repository
public interface CrudRepository extends JpaRepository<Feedback, Integer> {

}
