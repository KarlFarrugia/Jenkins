/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.one.petstore;
import java.util.*;
/**
 *
 * @author jonathan
 */
public class KittenDB {
    ArrayList<Kitten> Kitten =  new ArrayList<Kitten>();
    
    public boolean addKitten(ArrayList<Kitten> Kitten){
        int idkitt = 0;
        String nameKitt ="";
        String breedKitt ="";
        
        int idkitt1 = 0;
        String nameKitt1 ="";
        String breedKitt1 ="";
       
        Kitten k = new Kitten();
        k.setId(idkitt);
        k.setName(nameKitt);
        k.setBreed(breedKitt);
        /*
        idkitt1 = k.getId();
        nameKitt1 =k.getName();
        breedKitt1 =k.getBreed();   
       */
        Kitten.add(k);
        
        
        return true;
    }
    
    
}
