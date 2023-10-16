package com.cts.quarkus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.quarkus.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
