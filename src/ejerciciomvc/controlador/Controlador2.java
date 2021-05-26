/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomvc.controlador;

import ejerciciomvc.modelo.Dao;
import ejerciciomvc.vista.Vista;
import ejerciciomvc.vista.Vista2;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 *
 * @author Profesor
 */
public class Controlador2 {
    private Vista2 vista;
    private Dao dao;

    public Controlador2() {
      this.vista = new Vista2();
      this.dao = new Dao("bd.txt");
      this.vista.getBtGuardar()
              .setOnAction(new Evento());
    }

    public Vista2 getVista() {
        return vista;
    }
    
    private class Evento implements
            EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            System.out.println("asd");
            Controlador1 controlador = 
                    new Controlador1();
            Vista vista = controlador.getVista();
            Singleton singleton = 
                    Singleton.getSingleton();
            Stage stage = singleton.getStage();
            stage.setScene(vista.getScena());
            stage.show();
            
        }
    
    
    }
    
}
