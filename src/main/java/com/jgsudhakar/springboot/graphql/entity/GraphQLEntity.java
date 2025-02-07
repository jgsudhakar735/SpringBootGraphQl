package com.jgsudhakar.springboot.graphql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.graphql.entity.GraphQLEntity
 * Date    : 02-02-2025
 * Version : 1.0
 **************************************/
@Table(name = "SB_JPA_EMPLOYEE")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GraphQLEntity extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

}
