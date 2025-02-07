package com.jgsudhakar.springboot.graphql.service.impl;

import com.jgsudhakar.springboot.graphql.entity.Student;
import com.jgsudhakar.springboot.graphql.repository.StudentRepository;
import com.jgsudhakar.springboot.graphql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.graphql.service.impl.StudentServiceImpl
 * Date    : 07-02-2025
 * Version : 1.0
 **************************************/
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    /**
     * @return
     */
    @Override
    public List<Student> fetchAll() {
        return studentRepository.findAll();
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Student fetchByRollNo(String rollNo) {
        return studentRepository.findByRollNo(rollNo);
    }

    /**
     * @param name
     * @return
     */
    @Override
    public List<Student> fetchStuListByName(String name) {
        return studentRepository.findByName(name);
    }
}
