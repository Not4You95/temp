/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exjobb;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.*;

/**
 *
 * @author jonas
 */
public class GUI extends Application {
   private BorderPane root;
   private GridPane  border;
   private Button redButton;
   private MenuItem SetGroupOrg,SetPrioritForAllTask,SetQualityForAllTask,SetQualityForOneTask,SetPriorityForOneTask;
   private guiControler Contolloer;
   private Menu SetTaskmMenu,SetInterfacemMenu,P_2_P_Menu,SendMenu;
   private ChoiceBox <String> choiceBox;
   private HBox TopLine;
    @Override   
    
    public void start(Stage primaryStage) {
       
        Button btn = new Button(null);
        Contolloer = new guiControler(this);
        redButton = new Button();
        root = new BorderPane();
        border = new GridPane();
        TopLine = new HBox(20);
        Contolloer.UppdateScreen();
        
        ///////////////////////////////////////////////////////////////////////
        
        
           
        /////////////////////Menu ////////////////////////////////////////
       
        Label Orginations = new Label("Org:");
        ///////////////////////Task Menu///////////////////////////////////////////
       
        
       
        
        
        
        /*root.setStyle("-fx-background-color: linear-gradient(to bottom," +
                    " black 60, #141414 60.1%, black 100%);");*/
        
        
        MenuBar menulist = new MenuBar();
        menulist.getMenus().addAll(SetTaskmMenu,SetInterfacemMenu);
        /////////////////////////////////////////////////////////////
        TopLine.setAlignment(Pos.CENTER_LEFT);
        TopLine.setSpacing(20);
        
        TopLine.getChildren().addAll(Orginations,choiceBox,menulist);
       //TopLine.getChildren().add(menulist);
        
       // root.setTop(TopLine);
        root.setTop(TopLine);
        Scene scene = new Scene(root, 700, 300);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }

public void TaskMenu(){
    SetTaskmMenu = new Menu("_Task");
    SetPrioritForAllTask = new MenuItem("Set Priority for all task");
    SetPrioritForAllTask.addEventHandler(ActionEvent.ACTION, new MenuTaskChoice());
   SetQualityForAllTask = new MenuItem("Set Quality for all task");
   SetQualityForAllTask.addEventHandler(ActionEvent.ACTION, new MenuTaskChoice());
    SetTaskmMenu.getItems().addAll(SetPrioritForAllTask,SetQualityForAllTask);
        
}

public void InterfaceMenu(){
    SetInterfacemMenu = new Menu("_Interface");
    SetPriorityForOneTask = new MenuItem("Set Priority");
    SetPriorityForOneTask.addEventHandler(ActionEvent.ACTION, new menuInterfaceChoice());
    SetQualityForOneTask = new MenuItem("Set Quality");
    SetQualityForOneTask.addEventHandler(ActionEvent.ACTION, new menuInterfaceChoice());
    SetInterfacemMenu.getItems().addAll(SetPriorityForOneTask,SetQualityForOneTask);
}

public void SendMenu(){
    SendMenu = new Menu("_Send");    
}

public void OrgMenu(ArrayList<String> TasknName){
    
    choiceBox = new ChoiceBox<>();
    //choiceBox.setStyle("-fx-Background-color: black");    
    choiceBox.getItems().addAll(TasknName);    
   
    choiceBox.getSelectionModel().selectedItemProperty().addListener((v,oldvalue,newvalue) -> System.out.println(newvalue));
    
}
   

//////////////////////////////////////////////////////////////////////////
    

    private class MenuTaskChoice implements EventHandler<ActionEvent>{

        
        @Override
        public void handle(ActionEvent event) {
            
            if (event.getSource() == SetQualityForAllTask) {
                System.out.println(" ");
                
            }else if (event.getSource() == SetPrioritForAllTask) {
                
            }
                
        }
    }

    private class menuInterfaceChoice implements EventHandler<ActionEvent>{

       
        
        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == SetPriorityForOneTask) {
                
            }
            else if(event.getSource() == SetQualityForOneTask){
                
            }
        }
    }

}
