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
    private boolean Plan=true,Live=false,Simulate=false;
    
    
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
      // gui.UppdateListOfTask(temp);
       UppdateScreen();
       //gui.OverViewSceen(model.GetOrgPriorityForAll(), model.GetOrgQualityForAll(),model.GetOrgInfo());
    }
    
    public void Overview(){
        gui.OverViewSceen(model.GetOrgPriorityForAll(), model.GetOrgQualityForAll(),model.GetOrgInfo());
    }
    
    public void setScreen(){
        gui.OrgMenu(model.GetOrgNames());
        gui.TaskMenu();
        gui.InterfaceMenu();
        gui.P_2_PMenu();
        gui.SendMenu();
        gui.ButtonTopLine();
        gui.setListOfTask();
        tempTask.clear();
        gui.ModeMenu();
    }
    
    public void UppdateScreen(){          
        
        
        if (Plan) {
            gui.screenForPlanMode(model.getTaskList());
            
        }else if(Live){
            
        }
        else if(Simulate){
            
        }
        
       // tempTask.add("Test");
       // tempTask.add("Hello");
       
        
       
    }
    
    public void choiseOfInterface(String temp){
        gui.makeNewTabView(temp);
    }
    
   public void modeState(boolean Plan,boolean Live,boolean Simulate){
          this.Plan = Plan;
          this.Live = Live;
          this.Simulate = Simulate;
          UppdateScreen();
      }
    
}
