package com.sms.supermarketMS.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Getter;
import lombok.Setter;

@Entity(name = "provider")
@lombok.Generated
public class Provider {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter
    private Long id;

    @Column(nullable = false , length = 200)
    @Setter @Getter
    private String adresse;

    @Setter @Getter
    @Column(nullable = false)
    private Double capital;

    @Setter @Getter
    @Column(nullable = false)
    private Long code;

    @Setter @Getter
    @Column(nullable = false)
    private String compteBancaire;

    @Setter @Getter
    @Column(nullable = false)
    private String email;

    @Setter @Getter
    @Column(nullable = false)
    private String fax;

    @Setter @Getter
    @Column(nullable = false)
    private String raisonSociale ;
    
    @Setter @Getter
    @Column(nullable = false)
    private String telephone ;
    
}
