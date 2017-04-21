/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author jonas
 */
public class Interface implements Serializable {
    private String Priority;
    private String Quality;
    private boolean Pruducer;
    private boolean Consumer;
    private String Name;
    
    
            
    public Interface (){
    
    
}
    public Interface(String name,String priority,String quality){
        this.Name = name;
        this.Priority = priority;
        this.Quality = quality;
    }
    
    public void SetPriority(String Priority){
        this.setPriority(Priority);
    }

    /**
     * @return the Priority
     */
    public String getPriority() {
        return Priority;
    }

    /**
     * @param Priority the Priority to set
     */
    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    /**
     * @return the Quality
     */
    public String getQuality() {
        return Quality;
    }

    /**
     * @param Quality the Quality to set
     */
    public void setQuality(String Quality) {
        this.Quality = Quality;
    }

    /**
     * @return the Pruducer
     */
    public boolean isPruducer() {
        return Pruducer;
    }

    /**
     * @param Pruducer the Pruducer to set
     */
    public void setPruducer(boolean Pruducer) {
        this.Pruducer = Pruducer;
    }

    /**
     * @return the Consumer
     */
    public boolean isConsumer() {
        return Consumer;
    }

    /**
     * @param Consumer the Consumer to set
     */
    public void setConsumer(boolean Consumer) {
        this.Consumer = Consumer;
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
