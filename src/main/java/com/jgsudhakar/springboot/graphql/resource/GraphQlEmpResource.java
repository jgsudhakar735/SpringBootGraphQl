package com.jgsudhakar.springboot.graphql.resource;

import com.jgsudhakar.springboot.graphql.entity.GraphQLEntity;
import com.jgsudhakar.springboot.graphql.service.GraphQlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.graphql.resource.GraphQlEmpResource
 * Date    : 02-02-2025
 * Version : 1.0
 **************************************/
@Controller
public class GraphQlEmpResource {

    @Autowired
    private GraphQlService graphQlService;

    @QueryMapping
    public List<GraphQLEntity> getAllEmp() {
        return graphQlService.fetchAll();
    }

    @MutationMapping
    public GraphQLEntity fetchEmployee(@Argument Integer id) {
        return graphQlService.fetchById(id);
    }
}
