package com.jgsudhakar.springboot.graphql.service.impl;

import com.jgsudhakar.springboot.graphql.entity.GraphQLEntity;
import com.jgsudhakar.springboot.graphql.repository.GraphQlRepository;
import com.jgsudhakar.springboot.graphql.service.GraphQlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.graphql.service.impl.GraphQlServiceImpl
 * Date    : 04-02-2025
 * Version : 1.0
 **************************************/
@Service
public class GraphQlServiceImpl implements GraphQlService {

    @Autowired
    private GraphQlRepository graphQlRepository;

    /**
     * @param graphQLEntity
     * @return
     */
    @Override
    public GraphQLEntity save(GraphQLEntity graphQLEntity) {
        return null;
    }

    /**
     * @param graphQLEntity
     * @return
     */
    @Override
    public GraphQLEntity update(GraphQLEntity graphQLEntity) {
        return null;
    }

    /**
     * @param primaryKey
     * @return
     */
    @Override
    public GraphQLEntity delete(Long primaryKey) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<GraphQLEntity> fetchAll() {
        return graphQlRepository.findAll();
    }

    @Override
    public GraphQLEntity fetchById(Integer id) {
        Optional<GraphQLEntity> byId = graphQlRepository.findById(Long.valueOf(id));
        if(byId.isPresent()) {
            return byId.get();
        }
        return null;
    }
}
