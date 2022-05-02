package com.sms.supermarketMS.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "reduction")
@Generated
public class Reduction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter @Setter
  private Double taux ;

  @Getter @Setter
  @Column
  private String type;
    
}