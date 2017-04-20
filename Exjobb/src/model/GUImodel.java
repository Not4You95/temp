/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import model.*;

/**
 *
 * @author jonas
 */
public class GUImodel {
    private ArrayList<Orginasation> Org;
    
    public GUImodel(){
        Org = new ArrayList<Orginasation>();
    }
    
    public ArrayList<String> GetOrgNames(){
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 0; i < Org.size(); i++) {
            temp.add(Org.get(i).getName());
        }
        return temp;
    }
    
      public void test(){
          ArrayList<TSN> temp = new ArrayList<TSN>();
        ArrayList<Orginasation> orgList = new ArrayList<Orginasation>();
        Task task = new Task("Defend kandy");
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
        taskList.add(task);
        /////////////////////////////////////////////////////
        Gotland.setTasks(taskList);
        Gotland.setName("Gotland");
        //////////////////////////////////////////////////////
        Öland.setTasks(taskList);
        Öland.setName("Öland");
        //////////////////////////////////////////////////////
        Blidö.setTasks(taskList);
        Blidö.setName("Blidö");
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
