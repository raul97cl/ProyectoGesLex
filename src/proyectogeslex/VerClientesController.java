/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogeslex;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import map.Cliente;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * FXML Controller class
 *
 * @author Jose Carlos PC
 */
public class VerClientesController implements Initializable {

    @FXML
    private TableView<Cliente> tableClientes;
    @FXML
    private ChoiceBox<String> cbColumna;
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
    private Session session;
    private SessionFactory sesion;
    @FXML
    private TableColumn<Cliente, String> dniColumn;
    @FXML
    private TableColumn<Cliente, String> nombreColumn;
    @FXML
    private TableColumn<Cliente, String> apellidosColumn;
    @FXML
    private TableColumn<Cliente, String> fechaColumn;
    @FXML
    private TableColumn<Cliente, String> sexoColumn;
    @FXML
    private TableColumn<Cliente, String> sitLaboralColumn;
    @FXML
    private TableColumn<Cliente, String> sitFamiliarColumn;
    @FXML
    private Button anadirCliente;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //Enlaza las columnas con los campos de cliente
        dniColumn.setCellValueFactory(new PropertyValueFactory<>("dni"));
        nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        apellidosColumn.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        fechaColumn.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
        sexoColumn.setCellValueFactory(new PropertyValueFactory<>("sexo"));
        sitLaboralColumn.setCellValueFactory(new PropertyValueFactory<>("situacionLaboral"));
        sitFamiliarColumn.setCellValueFactory(new PropertyValueFactory<>("situacionFamiliar"));
        
        //Añade opciones
        cbColumna.getItems().addAll("DNI", "Nombre", "Apellidos", "Fecha de nacimiento", "Sexo", "Sit.Laboral", "Sit.Familiar");
    }    


    @FXML
    private void buscarCLiente(ActionEvent event) {
    }

    @FXML
    private void borrarCliente(ActionEvent event) {
        
        Cliente aBorrar = (Cliente) tableClientes.getSelectionModel().getSelectedItem();
        
        if(aBorrar != null){
            
            //Elimina el cliente seleccionado
            Transaction tx = session.getTransaction();
            
            tx.begin();
            session.delete(aBorrar);
            tx.commit();
            
            cargarClientes();
        }else{
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setHeaderText("Cliente no seleccionado");
            alerta.setContentText("Porfavor seleccione el cliente que desee eliminar");
            alerta.showAndWait();
        }
    }

    public void setSession(Session session) {
        this.session = session;
        cargarClientes();
    }

    public void setSesion(SessionFactory sesion) {
        this.sesion = sesion;
    }
    
    private void cargarClientes(){
        
        //Busca todos los clientes en la base de datos
        Query consulta = session.createQuery("from Cliente");
        List<Cliente> clientes = consulta.list();
        
        //Muestra los clientes en la tabla
        tableClientes.setItems(FXCollections.observableArrayList(clientes));
    }

    @FXML
    private void anadirCliente(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AnadirCliente.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();

        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Añadir Clientes");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        
        stage.show();

        AnadirClienteController anadirClientes = (AnadirClienteController) fxmlLoader.getController();
        anadirClientes.setSesion(sesion);
        anadirClientes.setSession(session);
        cargarClientes();
    }
}
