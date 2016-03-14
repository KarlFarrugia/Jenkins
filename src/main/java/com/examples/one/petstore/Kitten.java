/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.one.petstore;

/**
 *
 * @author jonathan
 */
public class Kitten {
    int id;
    String name;
    String breed;
    boolean sensitiveToFeeding;
    
    public void Kitten(String name1, int id1, String breed1){
        name = name1;
        id = id1;
        breed = breed1;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public void setBreed(String breed){
        this.breed = breed;
    }    
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    
    public String getBreed(){
        return breed;
    }    
}
