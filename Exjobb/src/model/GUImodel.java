/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author jonas
 */
public class GUImodel {
    private ArrayList<Orginasation> Org;
    private ReadAndWriteToFile SaveAndRead;
    private File filename;
    private String OrgName;
    
    
    
    public GUImodel(){
        Org = new ArrayList<Orginasation>();
        SaveAndRead = new ReadAndWriteToFile();
        filename = new File("test.txt");       
    }
    
    public ArrayList<String> GetOrgNames(){
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 0; i < Org.size(); i++) {
            temp.add(Org.get(i).getName());
        }
        return temp;
    }
    
    public void SetOrgName(String name){
        OrgName = name;        
    }
    
    
    public ArrayList<String> GetTaskNames(){
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 0; i < Org.size(); i++) {
            if (Org.get(i).getName() == OrgName) {
                temp.addAll(Org.get(i).GetTaskNames());               
            } 
        }
        
        return temp;
    }
    
    
    public void SaveToFile() throws IOException, AlertToUser{
           SaveAndRead.writeToFile(Org, filename);          
    }
    
    public void ReadFromFile() throws AlertToUser, IOException, ClassNotFoundException{
         
         Org.add(SaveAndRead.readFromFile(filename));
        
    }
    
    public String GetOrgInfo(){
        String temp=null;
       for (int i = 0; i < Org.size(); i++) {
            if (Org.get(i).getName() == OrgName) {
                temp = Org.get(i).getInfo();
                              
            } 
        }
       return temp;
    }
    
    public String GetOrgPriorityForAll(){
      String temp=null;
       for (int i = 0; i < Org.size(); i++) {
            if (Org.get(i).getName() == OrgName) {
                temp = Org.get(i).getPriotetForAllTSN();
                              
            } 
        }
       return temp;
    }
    
      public void test() {
          ArrayList<TSN> temp = new ArrayList<TSN>();
        ArrayList<Orginasation> orgList = new ArrayList<Orginasation>();
        Task task = new Task("Defend the candy");
        Task task2 = new Task("Defend the hill");
        ArrayList<Task> taskList = new ArrayList<Task>();
        Orginasation Gotland = new Orginasation();
        Orginasation Blidö = new Orginasation();
        Orginasation Öland = new Orginasation();
        
        TSN one = new TSN("UAV ISR Global");
        TSN two = new TSN("Datafusion M");
        TSN three = new TSN("Datafusion S");
        TSN FOUR = new TSN("Troups");
        TSN five = new TSN("Military Hospital");
        TSN six = new TSN("BMS/Soldier");
        TSN seven = new TSN("Deployed c2");
        TSN eight = new TSN("UAV Local");
        //System.out.println(one.getName());
        
        System.out.println("-----------------------------------------------");
        ///////////////////////////////////////////////////////////////////////
        
        temp.add(one);
        temp.add(two);
        temp.add(three);
        temp.add(FOUR);
        temp.add(five);
        temp.add(six);
        temp.add(seven);
        temp.add(eight);
        task.setNoder(temp);
        task2.setNoder(temp);
        taskList.add(task);
        taskList.add(task2);
        /////////////////////////////////////////////////////
        Gotland.setTasks(taskList);
        Gotland.setName("Gotland");
        Gotland.setInfo("Defend Gtoland from ryssland");
        //////////////////////////////////////////////////////
        Öland.setTasks(taskList);
        Öland.setName("Öland");
        Öland.setInfo("Defend Öland from Denmark");
        //////////////////////////////////////////////////////
        Blidö.setTasks(taskList);
        Blidö.setName("Blidö");
        Blidö.setInfo("Defend from who?");
        ///////////////////////////////////////////////////////////////////////
        Org.add(Öland);
        Org.add(Gotland);
        Org.add(Blidö);

       /*for (int i = 0; i < 1; i++) {
            for (int j = 0; j < temp.size() ; j++) {
                System.out.println(org.getTasks().get(0).getNoder().get(j).getName());
            }
            
        }*/
       
        
    }
}
