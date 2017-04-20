/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.jar.Attributes;

/**
 *
 * @author jonas
 */
public class TSN {
private String name;
private ArrayList<Interface> ListOfInterface;


/**
 * Constructur
 * @param name 
 */
public TSN(String name)
{
       this.name = name;
       ListOfInterface = new ArrayList<Interface>();
    
}
/**
 * Construktur
 */
public TSN(){
    this.name = null;
    ListOfInterface = new ArrayList<Interface>();
}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    public void SetPriorityForAllInterface(String priority){
        for (int i = 0; i < ListOfInterface.size(); i++) {
            ListOfInterface.get(i).SetPriority(priority);
        }
    }
    
    public void SetPriorityForSpecialInterface(){
        
    }
}
