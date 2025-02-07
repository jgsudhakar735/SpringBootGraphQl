package com.jgsudhakar.springboot.graphql.repository;

import com.jgsudhakar.springboot.graphql.entity.GraphQLEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*************************************
 * This interface is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.graphql.repository.GraphQlRepository
 * Date    : 02-02-2025
 * Version : 1.0
 **************************************/
@Repository
public interface GraphQlRepository extends JpaRepository<GraphQLEntity,Long> {
}
