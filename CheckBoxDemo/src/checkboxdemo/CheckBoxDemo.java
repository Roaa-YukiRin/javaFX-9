/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkboxdemo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class CheckBoxDemo extends Application {
    
    @Override
      public void start(Stage primaryStage) {
         Text text = new Text(50, 50, "JavaFX Programming");
         
           Pane paneForText = new Pane();
     paneForText.getChildren().add(text);
           
        HBox paneForButtons = new HBox(20);
        
//     ImageView l = new ImageView("sample/images/L.png");
//     l.setFitWidth(10);
//     l.setFitHeight(10);

//     ImageView r = new ImageView("sample/images/R.png");
//     r.setFitWidth(10);
//     r.setFitHeight(10);

     Button btLeft = new Button("Left");
     Button btRight = new Button("Right");

     btLeft.setContentDisplay(ContentDisplay.LEFT);
     btRight.setContentDisplay(ContentDisplay.LEFT);

     paneForButtons.getChildren().addAll(btLeft, btRight);

paneForButtons.setAlignment(Pos.CENTER);
paneForButtons.setStyle("-fx-border-color: green");

     BorderPane paneForAll = new BorderPane();
     paneForAll.setBottom(paneForButtons);
     paneForAll.setCenter(paneForText);
     
    btLeft.setOnAction(e -> text.setX(text.getX() - 10));
   btRight.setOnAction(e -> text.setX(text.getX() + 10));

//new
     VBox paneForCheckBoxes = new VBox(20);
     paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
     paneForCheckBoxes.setStyle("-fx-border-color: green");
     
     CheckBox chkBold = new CheckBox("Bold");
     CheckBox chkItalic = new CheckBox("Italic");
     paneForCheckBoxes.getChildren().addAll(chkBold, chkItalic);
     
     paneForAll.setRight(paneForCheckBoxes);
     
    text.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 
    FontPosture.REGULAR, 20));
    
    //new action
    //checkbox action
    EventHandler<ActionEvent> handler = e -> {
    if (chkBold.isSelected() && chkItalic.isSelected()) {
     text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 
    FontPosture.ITALIC, 20)); // Both check boxes checked
    }
    else if (chkBold.isSelected()) {
     text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 
    FontPosture.REGULAR, 20)); // The Bold check box checked
    }
    else if (chkItalic.isSelected()) {
     text.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 
    FontPosture.ITALIC, 20)); // The Italic check box checked
    }
    else {
     text.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 
    FontPosture.REGULAR, 20)); // Both check boxes unchecked
    }
    };
    
    chkBold.setOnAction(handler);
    chkItalic.setOnAction(handler);

    Scene scene = new Scene(paneForAll, 400, 200);
    primaryStage.setTitle("CheckBoxDemo");
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
