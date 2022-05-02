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

@Entity(name = "order")
@Generated
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long order_number ;
    
  
    @Column(name = "order_date", nullable = false)
    @Getter @Setter
    private Date order_date;

    @Column(name = "order_total", nullable = false)
    @Getter @Setter
    private Double order_total;
  
    @Column(name = "valide", nullable = false)
    @Getter @Setter
    private Boolean order_valide ;


}
