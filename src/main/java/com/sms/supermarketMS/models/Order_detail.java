package com.sms.supermarketMS.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "order_detail")
@Generated
public class Order_detail {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long orderd_id;
    
    @Column(name = "total", nullable = false)
    @Getter @Setter
    private Double total;

    @Column(name = "quantite", nullable = false)
    @Getter @Setter
    private int quantite;
}
