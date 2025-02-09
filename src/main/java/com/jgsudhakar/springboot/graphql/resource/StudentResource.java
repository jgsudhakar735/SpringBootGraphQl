package com.jgsudhakar.springboot.graphql.resource;

import com.jgsudhakar.springboot.graphql.entity.Student;
import com.jgsudhakar.springboot.graphql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SubscriptionMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;
import java.util.Random;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.graphql.resource.StudentResource
 * Date    : 07-02-2025
 * Version : 1.0
 **************************************/
@Controller
public class StudentResource {

    @Autowired
    private StudentService studentService;

    @QueryMapping
    public List<Student> fetchAllStudents() {
        return studentService.fetchAll();
    }

    @QueryMapping
    public Student fetchByRollNo(@Argument String rollNo) {
        return studentService.fetchByRollNo(rollNo);
    }

    @QueryMapping
    public List<Student> fetchAllStudentsByName(@Argument String name) {
        return studentService.fetchStuListByName(name);
    }

    @MutationMapping
    public Student saveStudent(@Argument Student student) {
        return studentService.saveStudent(student);
    }

    @SubscriptionMapping("newMessage")
    public Flux<String> newMessage() {
        return Flux.interval(Duration.ofSeconds(2)).
                map(message -> String.valueOf(new Random().nextLong()));
    }
}
