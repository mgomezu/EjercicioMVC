/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomvc.vista;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Profesor
 */
public class Vista2 implements Vista{
    private Scene escena;
    private Label lbEdad;
    private Label lbGenero;
    private TextField tfEdad;
    private RadioButton rbMasculino;
    private RadioButton rbFemenino;
    private Button btGuardar;

    public Vista2() {
        lbEdad = new Label("Edad");
        tfEdad = new TextField();
        lbGenero = new Label("Genero");
        ToggleGroup grupo = new ToggleGroup();
        rbMasculino = new RadioButton("Masculino");
        rbMasculino.setToggleGroup(grupo);
        rbFemenino = new RadioButton("Femenino");
        rbFemenino.setToggleGroup(grupo);
        btGuardar = new Button("Guardar");
        VBox layout = new VBox();
        HBox fila1 = new HBox();
        HBox fila2 = new HBox();
        VBox radioFila2 = new VBox();
        fila1.getChildren().add(lbEdad);
        fila1.getChildren().add(tfEdad);
        fila2.getChildren().add(lbGenero);
        radioFila2.getChildren().add(rbFemenino);
        radioFila2.getChildren().add(rbMasculino);
        fila2.getChildren().add(radioFila2);
        layout.getChildren().add(fila1);
        layout.getChildren().add(fila2);
        layout.getChildren().add(btGuardar);
        this.escena = new Scene(layout, 500, 500);
        
    }

    public Button getBtGuardar() {
        return btGuardar;
    }
            
    
    @Override
    public Scene getScena() {
      return this.escena;  
    }
    
}
