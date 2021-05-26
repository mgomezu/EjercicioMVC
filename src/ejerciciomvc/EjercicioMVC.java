/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomvc;

import ejerciciomvc.controlador.Controlador1;
import ejerciciomvc.controlador.Singleton;
import ejerciciomvc.vista.Vista;
import ejerciciomvc.vista.Vista1;
import ejerciciomvc.vista.Vista2;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Profesor
 */
public class EjercicioMVC extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      //Temporal
      Singleton singleton = Singleton.getSingleton();
      singleton.setStage(primaryStage);
      Controlador1 controlador = new Controlador1();
      Vista vista = controlador.getVista();
      primaryStage.setScene(vista.getScena());
      primaryStage.show();
        
    }
    
}
