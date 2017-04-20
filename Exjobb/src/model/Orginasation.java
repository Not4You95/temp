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
    private ArrayList<TSN> noder;
    
    public Orginasation (String InputName, String Inputinfo){
        this.name = InputName;
        this.info = Inputinfo;
        noder = new ArrayList<TSN>();
        
    }
    
    public Orginasation(){
        this.name = null;
        this.info = null;
        noder = new ArrayList<TSN>();
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
    
}
