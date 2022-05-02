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

@Entity(name = "stock")
@Generated
public class Stock {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter @Setter
    private int idStock;

    @Getter @Setter
    @Column(nullable= false)
    private Date dataStock;

    @Getter @Setter
    @Column(nullable= false)
    private Integer quantite;
}
