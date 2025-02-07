package com.jgsudhakar.springboot.graphql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.graphql.entity.Student
 * Date    : 07-02-2025
 * Version : 1.0
 **************************************/
@Table(name = "SB_STUDENT")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ROLL_NO")
    private String rollNo;

    @Column(name = "STANDARD")
    private String standard;
}
