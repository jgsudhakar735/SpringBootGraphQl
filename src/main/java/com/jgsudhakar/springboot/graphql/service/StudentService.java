package com.jgsudhakar.springboot.graphql.service;

import com.jgsudhakar.springboot.graphql.entity.Student;

import java.util.List;

/*************************************
 * This interface is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.graphql.service.StudentService
 * Date    : 07-02-2025
 * Version : 1.0
 **************************************/
public interface StudentService {
    public List<Student> fetchAll();
    public Student fetchByRollNo(String rollNo);
    public List<Student> fetchStuListByName(String name);
}
