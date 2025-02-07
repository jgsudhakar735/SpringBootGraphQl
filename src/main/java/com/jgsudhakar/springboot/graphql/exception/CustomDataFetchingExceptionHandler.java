package com.jgsudhakar.springboot.graphql.exception;

import graphql.GraphQLError;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.graphql.data.method.annotation.GraphQlExceptionHandler;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.web.bind.annotation.ControllerAdvice;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.graphql.exception.CustomDataFetchingExceptionHandler
 * Date    : 02-02-2025
 * Version : 1.0
 **************************************/
@ControllerAdvice
@Log4j2
public class CustomDataFetchingExceptionHandler  {

    @GraphQlExceptionHandler
    public GraphQLError handle(BindException ex) {
        return GraphQLError.newError().errorType(ErrorType.BAD_REQUEST).message("...").build();
    }
}
