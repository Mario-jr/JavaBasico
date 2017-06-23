/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Pichau
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    public int flag = 0 ;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        if(flag == 0){
            label.setText("Hi there,  World!");
            flag = 1 ;
        }else if(flag == 1){
            label.setText("did alread say, Hi there Woorld!");
            flag =2;
        }else if(flag == 2){
            label.setText("bullshit");
            flag = 3 ;
        }else if(flag == 3){
            label.setText("Go to Hell  _|_");
            flag = 4 ;
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
