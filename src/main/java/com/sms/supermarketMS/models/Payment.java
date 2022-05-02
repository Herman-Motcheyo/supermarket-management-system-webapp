package com.sms.supermarketMS.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "payment")
@Generated
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long pay_id;

    @Getter @Setter
    @Column(nullable = false)
    private double taux ;

    @Column(nullable = false)
    @Getter @Setter
    private String type;
}
