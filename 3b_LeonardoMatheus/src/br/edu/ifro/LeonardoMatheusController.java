/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import br.edu.ifro.modelo.LeonardoMatheus.LeonardoMatheus;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 05015429223
 */
public class LeonardoMatheusController implements Initializable {

    @FXML
    private TextField txtNome;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void salvar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        LeonardoMatheus aluno1 = new LeonardoMatheus(); 
        aluno1.setNome(txtNome.getText());
        
        em.getTransaction().begin();
        em.persist(aluno1);
        em.getTransaction().commit();
    }

    @FXML
    private void fechar(ActionEvent event) {
    }
    
}
