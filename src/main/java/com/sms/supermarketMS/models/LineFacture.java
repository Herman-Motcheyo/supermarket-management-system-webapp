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
public class LineFacture {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;
    
    @Column(name = "prix_vente", nullable = false)
    @Getter @Setter
    private Double prixVente;

    @Column(name = "quantite", nullable = false)
    @Getter @Setter
    private int quantite;
}
