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
        /*
        int idkitt1 = 0;
        String nameKitt1 ="";
        String breedKitt1 ="";
       */
        //setters
        Kitten k = new Kitten();
        
        //in case of emergency fail
        /*
        idkitt1 = k.getId();
        nameKitt1 =k.getName();
        breedKitt1 =k.getBreed();   
       */
        Kitten.add(k);
        //to fix
        for(int value = 0; idkitt < Kitten.size(); idkitt++){
            if (k.getId() == idkitt){
                
            }else{
                k.setId(idkitt);
                k.setName(nameKitt);
                k.setBreed(breedKitt);
                return true;
            }
        }
        /*
        if(Kitten.add(k)){
            return true;
        }else{
            return false;
        }
        */
        return false;
    }
    
    public boolean delKitten(int id){
        //int sizeOfArray = Kitten.size();
        boolean type = true;
        for (int count = 0; count < Kitten.size(); count++) {
            if (Kitten.get(count).equals(id)) {
                Kitten.remove(count);
            } else 
                type = false;
        }
        return type;
    }
    
    public Kitten getKitten(int id){
        for (int count = 0; count < Kitten.size(); count++) {
            if (Kitten.get(count).equals(id)) {
                return Kitten.get(count);
            }
        }
        return null;
    }
    
    public int countKitten(){
        return Kitten.size();
    }
}
