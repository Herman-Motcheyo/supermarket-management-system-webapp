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



@Entity(name="folder")
@Generated
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id_folder;
   
    @Column(name = "fol_name" , length = 200 , nullable = false)
    private String nom ;
    
    @Column(name ="ouverture" , nullable = false)
    @Getter @Setter
    private Date ouverture ;

    @Column(name ="fermeture" , nullable = false)
    @Getter @Setter
    private Date fermeture ;
}
