/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomvc.vista;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Profesor
 */
public class Vista1 implements Vista{
    private Scene escena;
    private Label lbnombre;
    private Label lbapellido;
    private TextField tfnombre;
    private TextField tfApellido;
    private Button btSiguiente;

    public Vista1() {
      lbnombre = new Label("Nombre");
      lbapellido = new Label("Apellido");
      tfnombre = new TextField();
      tfApellido = new TextField();
      btSiguiente = new Button("Siguiente");
      VBox layout = new VBox();
      HBox fila1= new HBox();
      HBox fila2 = new HBox();
      fila1.getChildren().add(lbnombre);
      fila1.getChildren().add(tfnombre);
      fila2.getChildren().add(lbapellido);
      fila2.getChildren().add(tfApellido);
      layout.getChildren().add(fila1);
      layout.getChildren().add(fila2);
      layout.getChildren().add(btSiguiente);
      this.escena = new Scene(layout, 500, 500);

    }
                
    
    @Override
    public Scene getScena() {
        return this.escena;
    }

    public TextField getTfnombre() {
        return tfnombre;
    }

    public TextField getTfApellido() {
        return tfApellido;
    }

    public Button getBtSiguiente() {
        return btSiguiente;
    }
    
    
}
