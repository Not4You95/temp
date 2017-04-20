/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jonas
 */
public class Orginasation {
    private String name;
    private String info;
    private String priotetForAllTSN;
    private String QualityForAllTSN;
    private ArrayList<Task> Tasks;
   
    
    public Orginasation (String InputName, String Inputinfo){
        this.name = InputName;
        this.info = Inputinfo;
        Tasks = new ArrayList<Task>();
       
        
    }
    
    public Orginasation(){
        this.name = null;
        this.info = null;
        Tasks = new ArrayList<Task>();
    }

    /**
     * @return Returns the name of the orgination
     */
    
    public String getName() {
        return name;
    }

    /**
     * @return Returns the info the orginations 
     */
    public String getInfo() {
        return info;
    }
 

    /**
     * @return the priotetForAllTSN
     */
    public String getPriotetForAllTSN() {
        return priotetForAllTSN;
    }

    /**
     * @param priotetForAllTSN the priotetForAllTSN to set
     */
    public void setPriotetForAllTSN(String priotetForAllTSN) {
        this.priotetForAllTSN = priotetForAllTSN;
        for (int i = 0; i < Tasks.size(); i++) {
            Tasks.get(i).SetpriorityForAllTSN(priotetForAllTSN);
        }
    }

    /**
     * @return the QualityForAllTSN
     */
    public String getQualityForAllTSN() {
        return QualityForAllTSN;
    }

    /**
     * @param QualityForAllTSN the QualityForAllTSN to set
     */
    public void setQualityForAllTSN(String QualityForAllTSN) {
        this.QualityForAllTSN = QualityForAllTSN;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }
    
}
