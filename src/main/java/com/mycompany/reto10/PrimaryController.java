package com.mycompany.reto10;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import FuncionesReto10.Esfera;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button calvol;
    @FXML
    private Button calsup;
    @FXML
    private Button calar;
    @FXML
    private Button calper;
    @FXML
    private TextField radVol;
    @FXML
    private TextField radSup;
    @FXML
    private TextField radAr;
    @FXML
    private TextField radPe;
    @FXML
    private TextArea respuesta;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void calVolumen(ActionEvent event) {
       try{
           Esfera volumen=new Esfera();
            if(Double.parseDouble(radVol.getText())>0){
                
                Double R= volumen.volumen(Double.parseDouble(radVol.getText()));
            //System.out.println(R);
            respuesta.setText("El Volumen de la esfera es: "+R);
             }
       }
       
      catch(Exception NumberFormatException){
          
          if(radVol.getText().length()==0){
              respuesta.setText("ESPACIO VACIO. Debe ingresar valores numericos mayores a 0");
          }
          else{
                respuesta.setText("Debe ingresar valores numericos mayores a 0");}  
    }
    }

    @FXML
    private void calSuperficie(ActionEvent event) {
        try{
        Esfera superficie=new Esfera(); 
        if(Double.parseDouble(radSup.getText())>0){
        Double R= superficie.superficie(Double.parseDouble(radSup.getText()));
        //System.out.println(R);
        respuesta.setText("La superficie de la esfera es: "+R);}}
        catch(Exception NumberFormatException){
          if(radSup.getText().length()==0){
              respuesta.setText("ESPACIO VACIO. Debe ingresar valores numericos mayores a 0");
          }
          else{
                respuesta.setText("Debe ingresar valores numericos mayores a 0");}  
    }
           
    }

    @FXML
    private void calArea(ActionEvent event) {
    try{        
        Esfera area=new Esfera();
        if(Double.parseDouble(radAr.getText())>0){
        Double R=area.areaCirculo(Double.parseDouble(radAr.getText()));
        //System.out.println(R);
        respuesta.setText("El area del circulo es: "+R);}}
           catch(Exception NumberFormatException){
          if(radAr.getText().length()==0){
              respuesta.setText("ESPACIO VACIO. Debe ingresar valores numericos mayores a 0");
          }
          else{
                respuesta.setText("Debe ingresar valores numericos mayores a 0");}  
    }
    }

    @FXML
    private void calPerimetro(ActionEvent event) {
        try{
        Esfera Perimetro=new Esfera(); 
        if(Double.parseDouble(radPe.getText())>0){
        Double R= Perimetro.perimetroCirculo(Double.parseDouble(radPe.getText()));
        //System.out.println(R);
        respuesta.setText("El Perimetro del circulo es: "+R);}}
            catch(Exception NumberFormatException){
          if(radPe.getText().length()==0){
              respuesta.setText("ESPACIO VACIO. Debe ingresar valores numericos mayores a 0");
          }
          else{
                respuesta.setText("Debe ingresar valores numericos mayores a 0");}  
    }
    }
    
    
}
