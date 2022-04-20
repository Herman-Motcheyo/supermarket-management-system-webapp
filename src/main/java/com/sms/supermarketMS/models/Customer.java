package com.sms.supermarketMS.models;

import javax.persistence.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Generated
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Getter @Setter
    private long code;

    @Column(name = "cust_age", nullable = false, length = 100)
    @Getter @Setter
    private String age;// verifie que age est dans une tranche

    @Column(name = "cust_addresse", nullable = false, length = 100)
    @Getter @Setter
    private String adresse;

    @Column(name = "cust_email", nullable = false, length = 100)
    @Getter @Setter
    private String email;

    @Column(name = "cust_nom", nullable = false, length = 255)
    @Getter @Setter
    private String nom;

    @Column(name = "cust_prenom", nullable = false, length = 255)
    @Getter @Setter
    private String prenom;
    
    @Column(name = "cust_telephone", nullable = false)
    @Getter @Setter
    private long telephone;

}
