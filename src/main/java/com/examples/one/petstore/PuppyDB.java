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
import java.util.*;

public class PuppyDB {
    
    ArrayList<Puppy> Puppies = new ArrayList<Puppy>();
    
    public boolean addPuppy(ArrayList<Puppy> Puppies) {
        
        int idpup = 0;
        String namepup = "";
        String breedpup = "";
       
        Puppy p = new Puppy();
        p.setId(idpup);
        p.setName(namepup);
        p.setBreed(breedpup);
        Puppies.add(p);
        
        return true;
    }
    
    public boolean delPuppy(int id) {
        
        boolean p = true;
        
        for (int count = 0; count < Puppies.size(); count++) {
            if (Puppies.get(count).equals(id)) {
                Puppies.remove(count);
            } else 
                p = false;
        }
        return p;
    }
    
    public boolean getPuppy(int id) {
        
        boolean p = true;
        
        for (int count = 0; count < Puppies.size(); count++) {
            if (Puppies.get(count).equals(id)) {
                System.out.println("This is the puppy requested: " + Puppies.get(count));
            } else {
                System.out.println("Puppy not found!");
                p = false;
            }
        }
        return p;
    }
    
    public boolean countPuppies() {
        
        boolean p = true;
        System.out.println("No. of puppies: " + Puppies.size());
        return p;
    }   
}
