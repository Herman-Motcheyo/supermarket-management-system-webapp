package com.sms.supermarketMS.models;

import java.util.Date;

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
public class Livraision {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long liv_id;
    
    @Column(name = "liv_adresse", nullable = false)
    @Getter @Setter
    private String adresse;

    @Column(name = "liv_date", nullable = false)
    @Getter @Setter
    private Date liv_date;
}
