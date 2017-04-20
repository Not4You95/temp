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
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author jonas
 */
public class Exjobb extends Application {
    BorderPane root;
    Button redButton;
    
    @Override   
    
    public void start(Stage primaryStage) {
        Button btn = new Button(null);
        redButton = new Button();
        root = new BorderPane();
        btn.setText("Say 'Hello World'");
        redButton.setText("Say 'Hello World'");
        //ActionEvent.ACTION, new colorButton()redbutton.addEventHandler(ActionEvent.ACTION, new colorButton());
        redButton.addEventHandler(ActionEvent.ACTION, new colorButton());
           
        /////////////////////////////////////////////////////////////
        Menu menu1 = new Menu("File");
        MenuItem SetGroupOrg = new MenuItem("SetGroup");
        SetGroupOrg.addEventHandler(ActionEvent.ACTION, new menu1Choise());
        
        MenuBar menulist = new MenuBar();
        menulist.getMenus().addAll(menu1);
        
        /*
         Menu meny = new Menu("File");
        open = new MenuItem("Open");
        open.addEventHandler(ActionEvent.ACTION, new menuChoise());
        save = new MenuItem("Save");
        save.addEventHandler(ActionEvent.ACTION, new menuChoise());
        newGame = new MenuItem("New Game");
        newGame.addEventHandler(ActionEvent.ACTION, new menuChoise());
        newPlayer = new MenuItem("New Player");
        newPlayer.addEventHandler(ActionEvent.ACTION, new menuChoise());
        meny.getItems().addAll(newGame, open, save, newPlayer);
        */
        /////////////////////////////////////////////////////////////
        
        root.setCenter(redButton);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
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
    private static class menu1Choise implements EventHandler<ActionEvent>{

       
        @Override
        public void handle(ActionEvent event) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    

    
    
}
