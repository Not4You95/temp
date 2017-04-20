/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exjobb;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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
   private MenuItem SetGroupOrg,ShowOrg;
   private guiControler Contolloer;
   private Menu menu1,TaskMenu;
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
        btn.setText("Say 'Hello World'");
        redButton.setText("Say 'Hello World'");
        
        redButton.addEventHandler(ActionEvent.ACTION, new colorButton());
           
        /////////////////////Menu ////////////////////////////////////////
       Menu1();
        
        ///////////////////////Task Menu///////////////////////////////////////////
        Menu OrgMenu = new Menu("Organasations");
        ShowOrg = new MenuItem();
        
        
        MenuBar menulist = new MenuBar();
        menulist.getMenus().addAll(menu1,OrgMenu);
        
        
        
        root.setStyle("-fx-background-color: linear-gradient(to bottom," +
                    " black 60, #141414 60.1%, black 100%);");
        
       
        /////////////////////////////////////////////////////////////
        TopLine.setAlignment(Pos.CENTER);
        TopLine.setSpacing(20);
        TopLine.getChildren().add(choiceBox);
        root.setTop(TopLine);
        root.setCenter(redButton);
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }

private void Menu1(){
        menu1 = new Menu("File");
        SetGroupOrg = new MenuItem("SetGroup");
        SetGroupOrg.addEventHandler(ActionEvent.ACTION, new menu1Choise());        
        menu1.getItems().addAll(SetGroupOrg);
        
}



public void OrgMenu(ArrayList<String> TasknName){
    choiceBox = new ChoiceBox<>();
    choiceBox.setStyle("-fx-Background-color: gold");
    choiceBox.getItems().addAll(TasknName);    
   
    choiceBox.getSelectionModel().selectedItemProperty().addListener((v,oldvalue,newvalue) -> System.out.println(newvalue));
    
}
   
 public static void main(String[] args) {
        launch(args);
    }
//////////////////////////////////////////////////////////////////////////
    private static class colorButton implements EventHandler<ActionEvent>{

    
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Hello world!");
        }
        
        }
////////////////////////////Menu1 action event //////////////////////////////////////////////////////
 /**
  * Menu1 action event
  */
    private class menu1Choise implements EventHandler<ActionEvent>{

       
        @Override
        public void handle(ActionEvent event) {
            
            if (event.getSource() == SetGroupOrg) {
                
            }
            
            
        }
    }
    
   
    
    
    

}
