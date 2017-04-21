/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jonas
 */
public class Task implements Serializable{
     private ArrayList<TSN> noder;
     private String Name;
     
     
     
     public Task(String name){
         this.Name = name;
         noder = new ArrayList<TSN>();
     }
     
     public void SetpriorityForAllTSN(String priority){
         for (int i = 0; i < getNoder().size(); i++) {
             getNoder().get(i).SetPriorityForAllInterface(priority);
         }
     }

    /**
     * @return the noder
     */
    public ArrayList<TSN> getNoder() {
        ArrayList<TSN> temp = new ArrayList<TSN>();
        temp.addAll(noder);
        return temp;
    }

    /**
     * @param noder the noder to set
     */
    public void setNoder(ArrayList<TSN> noder) {
        this.noder.addAll(noder);
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }
     
     
}
