package com.sms.supermarketMS.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Getter;
import lombok.Setter;

@Entity(name = "product")
@lombok.Generated
public class Product {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter
    private Long id;
    @Column(nullable = false , length = 200)
    @Setter @Getter
    private String designation;

    @Setter @Getter
    @Column(nullable = false)
    private double prix;

    @Setter @Getter
    @Column(nullable = false)
    private Integer quantite;

    @Setter @Getter
    @Column(nullable = false)
    private Integer quatiteAlert;

    @Column(nullable = false)
    private String reference;
}
