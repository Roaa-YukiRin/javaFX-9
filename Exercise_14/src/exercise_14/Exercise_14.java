/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class Exercise_14 extends Application {
         Text text = new Text("Programming is fun");
    ComboBox<String> cbFontFamilies = new ComboBox<>();

    CheckBox chkBold = new CheckBox("Bold");
    ComboBox<Integer> cbFontSize = new ComboBox<>();

    CheckBox chkItalic = new CheckBox("Italic");
    @Override
    public void start(Stage primaryStage) {
            // Center Text

        Integer[] sizes = new Integer[100];

        for (int i = 0; i < 100; i++)
            sizes[i] = i + 1;
        // Top pane nodes
        cbFontFamilies.getItems().addAll(Font.getFamilies());
        cbFontFamilies.setValue(text.getFont().getFamily());
        cbFontFamilies.setOnAction(e-> update());
        Label lblFontFamilies = new Label("Font Name", cbFontFamilies);
        lblFontFamilies.setContentDisplay(ContentDisplay.RIGHT);

        cbFontSize.getItems().addAll(getSizes());
        cbFontSize.setValue((int)text.getFont().getSize());
        cbFontSize.setOnAction(e -> {
            update();
            primaryStage.sizeToScene();
        });
        Label lblFontSizes = new Label("Font Size",cbFontSize);
        lblFontSizes.setContentDisplay(ContentDisplay.RIGHT);

        // Top pane
        HBox topPane = new HBox(lblFontFamilies, lblFontSizes);
        topPane.setSpacing(50);
        topPane.setPadding(new Insets(50));


        // Bottom pane nodes
        chkBold.setOnAction(e-> update());
        chkItalic.setOnAction(e-> update());

        // Bottom pane
        HBox bottomPane = new HBox(chkBold, chkItalic);
        bottomPane.setSpacing(50);
        bottomPane.setPadding(new Insets(50));
        bottomPane.setAlignment(Pos.CENTER);

        StackPane centerPane = new StackPane(text);
        BorderPane borderPane = new BorderPane(centerPane);
        borderPane.setTop(topPane);
        borderPane.setBottom(bottomPane);
        primaryStage.setTitle("Exercise 6");
        primaryStage.setScene(new Scene(borderPane));
        primaryStage.show();

    }
    private void update(){
        FontWeight fontWeight = (chkBold.isSelected()) ? FontWeight.BOLD : FontWeight.NORMAL;
        FontPosture fontPosture = (chkItalic.isSelected()) ? FontPosture.ITALIC : FontPosture.REGULAR;
        String fontFamily = cbFontFamilies.getValue();
        double size = cbFontSize.getValue();
        text.setFont(Font.font(fontFamily, fontWeight, fontPosture, size));
    }

    private Integer[] getSizes() {
        Integer[] sizes = new Integer[100];

        for (int i = 0; i < 100; i++)
            sizes[i] = i + 1;

        return sizes;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
