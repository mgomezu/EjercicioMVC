/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomvc.controlador;

import ejerciciomvc.modelo.Dao;
import ejerciciomvc.vista.Vista;
import ejerciciomvc.vista.Vista1;
import ejerciciomvc.vista.Vista2;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 *
 * @author Profesor
 */
public class Controlador1 {
    private Vista1 vista;
    private Dao modelo;

    public Controlador1() {
        this.vista = new Vista1();
        this.vista.getBtSiguiente()
                .setOnAction(new EventoSiguiente());
        
        this.modelo = new Dao("bd.txt");
    }

    public Vista1 getVista() {
        return vista;
    }
     
    
    //Registro eventos
    private class EventoSiguiente 
            implements  EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
          String nombre = 
                  vista.getTfnombre().getText();
          String apellido = 
                  vista.getTfApellido().getText();
          
          Singleton singleton = Singleton.getSingleton();
          Stage stage = singleton.getStage();
                    
          Controlador2 controlador = new Controlador2();
          Vista vista = controlador.getVista();
          stage.setScene(vista.getScena());
          stage.show();
        }
    
    }
}
