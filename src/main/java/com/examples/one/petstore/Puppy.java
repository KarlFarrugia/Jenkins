/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.one.petstore;

/**
 *
 * @author James
 */
public class Puppy {
    
    int id;
    String name;
    String breed;
    boolean loadBark;
    boolean friendlyWithChildren;
    
    public void Puppy(int p_id, String p_name, String p_breed) {
        
        id = p_id;
        name = p_name;
        breed = p_breed;
        System.out.println("fishsticks");
    
    }
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getBreed() {
        return breed;
    }
}
