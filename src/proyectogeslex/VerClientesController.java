/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogeslex;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Jose Carlos PC
 */
public class VerClientesController implements Initializable {

    @FXML
    private TableView<?> tableClientes;
    @FXML
    private ChoiceBox<?> cbColumna;
    @FXML
    private TextField tfBusqueda;
    private AnchorPane v;
    @FXML
    private HBox idbajo;
    @FXML
    private HBox idcentro;
    @FXML
    private Button btnBuscar;
    @FXML
    private Button btnBorrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        idbajo.setAlignment(Pos.CENTER);
        idcentro.setAlignment(Pos.CENTER);
    }    


    @FXML
    private void buscarCLiente(ActionEvent event) {
    }

    @FXML
    private void borrarCliente(ActionEvent event) {
    }
    
}
