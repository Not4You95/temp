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
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.*;

/**
 *
 * @author jonas
 */
public class GUI extends Application {
   private BorderPane root;
   private GridPane  border;
   private Button ButtonOverview,ButtonInterface,ButtonNodes;
   private MenuItem SetGroupOrg,SetPrioritForAllTask,SetQualityForAllTask,SetQualityForOneTask,SetPriorityForOneTask;
   private MenuItem SendToSystem,P_2_P_MenuItem,SendToSystemItem;
   private guiControler Contolloer;
   private Menu SetTaskmMenu,SetInterfacemMenu,P_2_P_Menu,SendMenu,ModeMenu;
   private ComboBox <String> choiceBox;
   private CheckMenuItem Plan,Live,Simulate;
   private ListView<String> ListOfTasks;
   private HBox TopLine,TopLineLine2,CenterHBox;
   private VBox ToplineVBox,CentetVBox;
   private MenuBar menulist;
   private GridPane Net;
    @Override   
    
    public void start(Stage primaryStage) {
       
        Contolloer = new guiControler(this);        
        root = new BorderPane();
        border = new GridPane();
        TopLine = new HBox(20);
        TopLineLine2 = new HBox();
        ToplineVBox = new VBox();
        Contolloer.UppdateScreen();
        
        ///////////////////////////////////////////////////////////////////////
        
        
           
        /////////////////////Menu ////////////////////////////////////////
       
        Label Orginations = new Label("Organization:");
        Label Task = new Label("Task");
        ///////////////////////Task Menu///////////////////////////////////////////
       
        
       
        
        
        
        /*root.setStyle("-fx-background-color: linear-gradient(to bottom," +
                    " black 60, #141414 60.1%, black 100%);");*/
        
        
        menulist = new MenuBar();
        menulist.getMenus().addAll(SetTaskmMenu,SetInterfacemMenu,P_2_P_Menu,SendMenu,ModeMenu);
        /////////////////////////////////////////////////////////////
        TopLine.setAlignment(Pos.CENTER_LEFT);
        TopLine.setSpacing(20);
        
        TopLine.getChildren().addAll(Orginations,choiceBox,menulist); 
        TopLineLine2.setSpacing(20);
        TopLineLine2.getChildren().addAll(Task,ButtonOverview,ButtonInterface,ButtonNodes);
       
               
               
       ToplineVBox.getChildren().addAll(TopLine,TopLineLine2);
       
       root.setTop(ToplineVBox);
        
        root.setLeft(ListOfTasks);
        SetColor();
        Scene scene = new Scene(root, 700, 300);
        
        primaryStage.setTitle("GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }
    
    
public void ButtonTopLine(){
    ButtonOverview = new Button("Overview");
    ButtonOverview.addEventHandler(ActionEvent.ACTION, new ButtonChoice());
    ButtonInterface = new Button("Interface");
    ButtonInterface.addEventFilter(ActionEvent.ACTION, new ButtonChoice());
    ButtonNodes = new Button("Nodes");
    ButtonNodes.addEventFilter(ActionEvent.ACTION, new ButtonChoice());
    
}
public void ModeMenu(){
    ModeMenu = new Menu("Mode");
    Plan = new CheckMenuItem("Plan");
    Plan.addEventHandler(ActionEvent.ACTION, new ModeMenuChoice());
    Live = new CheckMenuItem("Live");
    Live.addEventHandler(ActionEvent.ACTION, new ModeMenuChoice());
    Simulate = new CheckMenuItem("Simnulate");
    Simulate.addEventHandler(ActionEvent.ACTION, new ModeMenuChoice());
    ModeMenu.getItems().addAll(Plan,Live,Simulate);

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
    SendToSystem = new Menu("Send to system");
    SendToSystem.addEventHandler(ActionEvent.ACTION, new MenuSendChoice());
    SendMenu.getItems().add(SendToSystem);
}

public void P_2_PMenu(){
    P_2_P_Menu = new Menu("_P_2_P");
    P_2_P_Menu.addEventHandler(ActionEvent.ACTION, new MenuP_2_PChoice());
    P_2_P_MenuItem = new MenuItem("P-2-P");
    P_2_P_MenuItem.addEventHandler(ActionEvent.ACTION, new MenuP_2_PChoice());
    P_2_P_Menu.getItems().add(P_2_P_MenuItem);
}

public void OrgMenu(ArrayList<String> TasknName){
    
    choiceBox = new ComboBox<>();
    //choiceBox.setStyle("-fx-Background-color: black");    
    choiceBox.getItems().addAll(TasknName); 
    choiceBox.setPromptText("Org");
    choiceBox.getSelectionModel().selectedItemProperty().addListener((v,oldvalue,newvalue) -> Contolloer.ChoiceOfOrg(newvalue));
    
}
public void setListOfTask(){
    ListOfTasks = new ListView<String>();    
    ListOfTasks.setPrefSize(100, 280);
    ListOfTasks.getSelectionModel().selectedIndexProperty().addListener((v,oldvalue,newvalue)-> System.out.println(newvalue));
    
}
public void UppdateListOfTask(ArrayList<String> task){
     ListOfTasks.getItems().clear();
     ListOfTasks.getItems().addAll(task);
   
}

public void SetColor(){
    TopLine.setStyle("-fx-background-color: #ccccb3");
    TopLineLine2.setStyle("-fx-background-color: #ccccb3");
    menulist.setStyle("-fx-background-color: #ccccb3");
    choiceBox.setStyle("-fx-background-color: #ccccb3");
    ButtonOverview.setStyle("-fx-background-color: #ccccb3");
    ButtonInterface.setStyle("-fx-background-color: #ccccb3");
    ButtonNodes.setStyle("-fx-background-color: #ccccb3");

}



    private class ButtonChoice implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == ButtonOverview) {
                System.out.println("Overview");
                Contolloer.Overview();
            }
            else if (event.getSource() == ButtonInterface) {
                System.out.println("Interface");
            }
            else if(event.getSource() == ButtonNodes){
                System.out.println("Nodes");
            }
        }
    }

    private class ModeMenuChoice implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == Plan) {
                Live.setSelected(false);
                Simulate.setSelected(false);
            }
            else if (event.getSource() == Live) {
                Plan.setSelected(false);
                Simulate.setSelected(false);
            }
            else if (event.getSource() == Simulate) {
                Plan.setSelected(false);
                Live.setSelected(false);
            }
        }
    }
    private class MenuP_2_PChoice implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
           
            if (event.getSource() == P_2_P_MenuItem) {
                System.out.println("P_2_P\n");
                
            }
        }
    }

    private class MenuSendChoice implements EventHandler<ActionEvent>{

       

        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == SendToSystem) {
                System.out.println("Send To System\n");
                
            }
        }
    }
   

//////////////////////////////////////////////////////////////////////////
    

    private class MenuTaskChoice implements EventHandler<ActionEvent>{

        
        @Override
        public void handle(ActionEvent event) {
            
            if (event.getSource() == SetQualityForAllTask) {
                System.out.println("Set Quality\n");
                
            }else if (event.getSource() == SetPrioritForAllTask) {
                System.out.println("Set Priority\n");
            }
                
        }
    }

    private class menuInterfaceChoice implements EventHandler<ActionEvent>{

       
        
        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == SetPriorityForOneTask) {
                System.out.println("Set priority\n");
            }
            else if(event.getSource() == SetQualityForOneTask){
                System.out.println("Set Quality\n");
            }
        }
    }
    
    
    public void  OverViewSceen(String GlobalPriorityIput,String GlobalQualityInput,String info){
        Net = new GridPane();
        CenterHBox = new HBox();
        CentetVBox = new VBox();
        Label labelText = new Label("Information:");
        Text texttest = new Text(info);
        
        Label globalPriotet = new Label("Global Priority:");
        Label globalQuality = new Label("Global Quality:");
        Net.setVgap(20);
        Net.setHgap(20);
        Net.setAlignment(Pos.TOP_CENTER);
        CentetVBox.setAlignment(Pos.CENTER_LEFT);
        Net.add(globalPriotet, 0, 0);
        Net.add(globalQuality, 0, 1);
        
        Label temp1 = new Label(GlobalPriorityIput);
        Label temp2 = new Label(GlobalQualityInput);
        Net.add(temp1, 1, 0);
        Net.add(temp2, 1, 1);
        CentetVBox.getChildren().addAll(labelText,texttest);
        CenterHBox.setSpacing(20);
        CenterHBox.setAlignment(Pos.CENTER_LEFT);
        CenterHBox.getChildren().addAll(CentetVBox,Net);
        
        root.setCenter(CenterHBox);
        
    }
    

}
