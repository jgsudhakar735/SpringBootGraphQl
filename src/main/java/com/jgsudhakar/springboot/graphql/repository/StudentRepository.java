package com.jgsudhakar.springboot.graphql.repository;

import com.jgsudhakar.springboot.graphql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*************************************
 * This interface is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.graphql.repository.StudentRepository
 * Date    : 07-02-2025
 * Version : 1.0
 **************************************/
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public Student findByRollNo(String rollNo);
    public List<Student> findByName(String name);
}
