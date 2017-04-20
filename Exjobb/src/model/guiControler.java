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
    
    public guiControler(GUI GUICLASS){
        gui = GUICLASS; 
        model = new GUImodel();
        model.test();
        
        
    }
    
    public void SetGroup(){
        
        
        
    }
    
    public void UppdateScreen(){
        ArrayList<String> temp = new ArrayList<String>();      
        gui.OrgMenu(model.GetOrgNames());
        gui.TaskMenu();
        gui.InterfaceMenu();
    }
   
    
}
