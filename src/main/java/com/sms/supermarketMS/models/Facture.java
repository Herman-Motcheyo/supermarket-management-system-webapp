package com.sms.supermarketMS.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Getter @Setter
    private Long code;

    @Column(name = "fact_capital", nullable = false)
    @Getter @Setter
    private Double capital;// verifie que age est dans une tranche

    @Column(name = "fact_addresse", nullable = false, length = 100)
    @Getter @Setter
    private String adresse;

    @Column(name = "fact_email", nullable = false, length = 100)
    @Getter @Setter
    private String email;

    @Column(name = "fact_compteBancaire", nullable = false, length = 255)
    @Getter @Setter
    private String compteBancaire;
    
    @Column(name = "fact_telephone", nullable = false)
    @Getter @Setter
    private Long telephone;

    @Column(name="fact_raisonsocial" , nullable = false , length = 255 )
    @Getter @Setter
    private String raisonSocial;

    @Column(name = "fact_fax", nullable = false)
    @Getter @Setter
    private Long fax;

}
