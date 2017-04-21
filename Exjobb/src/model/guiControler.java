/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exjobb.GUI;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author jonas
 */
public class guiControler {
    private GUI gui;
    private GUImodel model;
    private ArrayList<String> tempTask;
    public guiControler(GUI GUICLASS){
        gui = GUICLASS; 
        model = new GUImodel();
        model.test();
        tempTask = new ArrayList<String>();
        
        
    }
    
    public void SetGroup(){
        
        
        
    }
    
    public void ChoiceOfOrg(String name){
       ArrayList<String> temp = new ArrayList<String>();  
       model.SetOrgName(name);
        System.out.println("Contoler name: "+name);
       temp.addAll(model.GetTaskNames());
       gui.UppdateListOfTask(temp);
    }
    
    public void UppdateScreen(){
           
        gui.OrgMenu(model.GetOrgNames());
        gui.TaskMenu();
        gui.InterfaceMenu();
        gui.P_2_PMenu();
        gui.SendMenu();
        gui.setListOfTask();
        tempTask.clear();
       // tempTask.add("Test");
       // tempTask.add("Hello");
       
        
       
    }
   
    
}
