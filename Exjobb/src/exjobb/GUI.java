/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exjobb;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
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
   private MenuItem SetGroupOrg;
   private guiControler Contolloer;
    @Override   
    
    public void start(Stage primaryStage) {
        Button btn = new Button(null);
        Contolloer = new guiControler(this);
        redButton = new Button();
        root = new BorderPane();
        border = new GridPane();
        btn.setText("Say 'Hello World'");
        redButton.setText("Say 'Hello World'");
        
        redButton.addEventHandler(ActionEvent.ACTION, new colorButton());
           
        /////////////////////////////////////////////////////////////
        Menu menu1 = new Menu("File");
        SetGroupOrg = new MenuItem("SetGroup");
        SetGroupOrg.addEventHandler(ActionEvent.ACTION, new menu1Choise());
        
        menu1.getItems().addAll(SetGroupOrg);
        MenuBar menulist = new MenuBar();
        menulist.getMenus().addAll(menu1);
        
        
        
        root.setStyle("-fx-background-color: linear-gradient(to bottom," +
                    " black 60, #141414 60.1%, black 100%);");
        
        /*
         Menu meny = new Menu("File");
        open = new MenuItem("Open");
        open.addEventHandler(ActionEvent.ACTION, new menuChoise());        
        meny.getItems().addAll(newGame, open, save, newPlayer);
        
        menuBar.setStyle("-fx-background-color: #a6b5c9,linear-gradient(#303842 0%, #3e5577 20%, #375074 100%),linear-gradient(#768aa5 0%, #849cbb 5%, #5877a2 50%, #486a9a 51%, #4a6c9b 100%);"
                + "-fx-background-insets: 0 0 -1 0,0,1;"
                + "-fx-background-radius: 5,5,4;"
                + "-fx-padding: 7 30 7 30;"
                + "-fx-text-fill: #242d35;"
                + "-fx-font-family: Helvetica;"
                + "-fx-font-size: 14px;"
                + "-fx-text-fill: Withe;");
        */
        /////////////////////////////////////////////////////////////
        root.setTop(menulist);
        root.setCenter(redButton);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    
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
            else if()
            {
                
            }
        }
    }
    
    
    

}
