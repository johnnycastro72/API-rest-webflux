package com.sofkau.apirestwebflux.collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Dato {
    @Id
    private String id;
    private String informacion;
    //Getters and Setters
}