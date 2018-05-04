/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JButton;

/**
 *
 * @author 05015429223
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txt1, txt2, txtResultado;
    
    @FXML
    private JButton btnSoma;
    
    @FXML
    private void soma(ActionEvent event) {
    Double num1 = Double.parseDouble(txt1.getText());   
    Double num2 = Double.parseDouble(txt2.getText());
    
    Double resultado = num1 + num2 ;
    
    txtResultado.setText(resultado.toString());


    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
