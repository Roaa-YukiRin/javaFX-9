/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3a_roaa_kalantan_441004834;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.image.*;
/**
 *
 * @author HP
 */
public class Lab3A_roaa_kalantan_441004834 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         BorderPane root = new BorderPane();
      root.setPadding(new Insets(15, 20, 10, 10));
        
     
      
      

/////////toop///////////

VBox right = new VBox();
        right.setPadding(new Insets(20));
Label Label = new Label("  TV controller  ");
        Label.setFont(Font.font("Gill Sans", FontWeight.NORMAL, 20));
        Label.setTextFill(Color.BLUE);
        
      
        right.setAlignment(Pos.CENTER);
        

        HBox  bottom = new HBox();
         bottom.setPadding(new Insets(20));
      Button onOFF = new Button("ON/OFF");
      onOFF.setPadding(new Insets(5, 5, 10, 10));
      bottom.setAlignment(Pos.TOP_CENTER);
     
        
      
     RadioButton mute=new RadioButton("mute");
    mute.setPadding(new Insets(5, 5, 10, 10));
      bottom.setAlignment(Pos.TOP_CENTER);
      
      
      bottom.getChildren().addAll(onOFF,Label,mute);
    
 
      root.setTop(bottom);
      
      /////////
       //Right side
        VBox right1 = new VBox(5);
        right1.setPadding(new Insets(10, 10, 10, 10));
        Label soundLabel = new Label("Sound:");
        soundLabel.setFont(Font.font("Edwardian Script ITC", FontWeight.NORMAL, 20));
        soundLabel.setTextFill(Color.BLACK);
       
        
        Slider slider = new Slider();
        slider.setMin(-50);
        slider.setMax(+50);
        slider.setValue(0);
        slider.setOrientation(Orientation.VERTICAL);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(50);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(2);
        
      right1.getChildren().addAll(soundLabel, slider);//, btMute
        right1.setAlignment(Pos.CENTER);
        right1.setStyle("-fx-border-color: blue");
         root.setRight(right1);
      
      //////////center///////////
       HBox  bottom1 = new HBox();
         bottom1.setPadding(new Insets(5));
      Button up = new Button("▲");
      up.setPadding(new Insets(5, 5, 10, 10));
      bottom1.setAlignment(Pos.TOP_CENTER);
      
      Button dow = new Button("▼");
      dow.setPadding(new Insets(5, 5, 10, 10));
      bottom1.setAlignment(Pos.CENTER);
      
      Button leift = new Button("◀");
      leift.setPadding(new Insets(5, 5, 10, 10));
      bottom1.setAlignment(Pos.CENTER);
    
      Button center = new Button("OK");
      center.setPadding(new Insets(5, 5, 10, 10));
      bottom1.setAlignment(Pos.CENTER);
      
      Button raight = new Button("▶");
      raight.setPadding(new Insets(5, 5, 10, 10));
      bottom1.setAlignment(Pos.CENTER);
      
      
      
       bottom1.getChildren().addAll(up,leift,center,raight,dow);
       bottom1.setAlignment(Pos.CENTER);
     
       root.setCenter(bottom1);
       
       /////////////////
       VBox  bottom2 = new VBox();
         bottom2.setPadding(new Insets(5));
       Button add = new Button("+");
      add.setPadding(new Insets(5, 5, 10, 10));
    
      
      Label Label1 = new Label("PAGE");
        Label1.setFont(Font.font("Edwardian Script ITC", FontWeight.NORMAL, 20));
        Label1.setTextFill(Color.BLACK);
        
        Button dec = new Button("-");
      dec.setPadding(new Insets(5, 5, 10, 10));
      
      
      bottom2.getChildren().addAll(add,Label1,dec); 
       bottom2.setAlignment(Pos.CENTER);
       bottom2.setStyle("-fx-border-color: blue");
      root.setLeft(bottom2);
      
      ///////
      HBox  bottom3 = new HBox();
         bottom3.setPadding(new Insets(5));
         
         Button NO = new Button("1 2 3");
      NO.setPadding(new Insets(5, 5, 10, 10));
      bottom3.setAlignment(Pos.CENTER);
      
       Button HOME = new Button("HOME");
      HOME.setPadding(new Insets(5, 5, 10, 10));
      bottom3.setAlignment(Pos.CENTER);
      
       Button E = new Button(" * * * ");
      E.setPadding(new Insets(5, 5, 10, 10));
      bottom3.setAlignment(Pos.CENTER);
      
      bottom3.getChildren().addAll(NO,HOME,E); 
       bottom3.setAlignment(Pos.CENTER);
      root.setBottom(bottom3);
      
      
       Scene scene = new Scene(root, 350, 500);
      primaryStage.setTitle("Lab3_Smart_Home1");
      primaryStage.setScene(scene);
      primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
