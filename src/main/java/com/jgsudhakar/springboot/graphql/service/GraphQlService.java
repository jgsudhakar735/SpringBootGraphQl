package com.jgsudhakar.springboot.graphql.service;

import com.jgsudhakar.springboot.graphql.entity.GraphQLEntity;

import java.util.List;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.graphql.service.GraphQlService
 * Date    : 02-02-2025
 * Version : 1.0
 **************************************/
public interface GraphQlService {

    public GraphQLEntity save(GraphQLEntity graphQLEntity);

    public GraphQLEntity update(GraphQLEntity graphQLEntity);

    public GraphQLEntity delete(Long primaryKey);

    public List<GraphQLEntity> fetchAll();

    public GraphQLEntity fetchById(Integer id);
}
