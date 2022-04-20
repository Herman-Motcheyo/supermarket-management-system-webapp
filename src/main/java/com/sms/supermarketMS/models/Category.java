package com.sms.supermarketMS.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Generated 
/*
Lombok will eventually automatically add this annotation to 
all generated constructors, methods, fields, and type
*/
public class Category {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long id_cat ;

    @Column(name = "description"  , nullable = false)
    @Getter @Setter
    private String description;
}
