package com.example.qrcodeprojekt.entity;

import jakarta.persistence.Entity;                                                                                      //
import jakarta.persistence.Id;                                                                                          //These lines import the required classes and annotations for defining a JPA (Java Persistence API) entity,
import jakarta.persistence.Table;                                                                                       // including Entity, Id, Table, and NonNull.
import org.springframework.lang.NonNull;                                                                                //

@Entity                                                                                                                 //This line here defines to java that Hey! this is an Entity as if it was a Database
@Table(name = "itemonstock")                                                                                            //This line marks the beginning of the ItemOnStockEntity class declaration, and applies the @Entity and @Table(name = "itemonstock") annotations,
public class ItemOnStockEntity{                                                                                         // which indicate that it is a JPA entity and should be stored in a database table called "itemonstock", respectively.


    @Id
    private int IDitemonstock;                                                                                          // SETTING UP ATTRIBUTES FROM THE DATABANK

    @NonNull
    private String name;                                                                                                // SETTING UP ATTRIBUTES FROM THE DATABANK

    @NonNull
    private int IDFSshelf;                                                                                              // SETTING UP ATTRIBUTES FROM THE DATABANK

    @NonNull
    private int cost;                                                                                                   // SETTING UP ATTRIBUTES FROM THE DATABANK

    @NonNull
    private int IDFSqrcode;                                                                                             // SETTING UP ATTRIBUTES FROM THE DATABANK

    public ItemOnStockEntity(){                                                                                         // constructor(basic shit bruh)

    }

    public int getIDitemonstock(){                                                                                      //GETTER?!? NOOOOOOOOO WHY PETER RUTSCHMANN WHYYYYYY
        return IDitemonstock;
    }

    public ItemOnStockEntity setIDitemonstock(int IDitemonstock){                                                       //GETTER?!? AGAIN?!?!?!?!?!?! NOOOOOOOOO WHY PETER RUTSCHMANN WHYYYYYY
        this.IDitemonstock = IDitemonstock;
        return this;
    }

    @NonNull
    public String getName(){                                                                                            // GETTER FOR THE NAME?!?! NOOO
        return name;
    }

    public ItemOnStockEntity setName(@NonNull String name){                                                             // S-S-S-SETTER FOR THE NAME?!?! NOOO
        this.name = name;
        return this;
    }

    public int getIDFSshelf(){
        return IDFSshelf;
    }

    public ItemOnStockEntity setIDFSshelf(int IDFSshelf){
        this.IDFSshelf = IDFSshelf;
        return this;
    }

    public int getCost(){
        return cost;
    }

    public ItemOnStockEntity setCost(int cost){
        this.cost = cost;
        return this;
    }

    public int getIDFSqrcode(){
        return IDFSqrcode;
    }

    public ItemOnStockEntity setIDFSqrcode(int IDFSqrcode){
        this.IDFSqrcode = IDFSqrcode;
        return this;
    }

    public ItemOnStockEntity(int IDitemonstock, int IDFSqrcode, int IDFSshelf, int cost, String name){                  // another boring Construtor but with parameters this time.
        this.cost = cost;
        this.name=name;
        this.IDFSqrcode=IDFSshelf;
        this.IDitemonstock=IDitemonstock;
        this.IDFSshelf=IDFSshelf;
    }
}
