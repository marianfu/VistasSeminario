import java.net.URL;
import java.util.ResourceBundle;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class VistaListarOdontologosControlador implements Initializable {

	private ObservableList<OdontologoView> odontologos = FXCollections
			.observableArrayList();
	@FXML
	private TextField textFiltrarTabla;
	@FXML
	private Button botonBuscar;
	@FXML
	private TableView<OdontologoView> tablaListarOdontologos;
	@FXML
	private TableColumn<OdontologoView, String> columnaNombre;
	@FXML
	private TableColumn<OdontologoView, String> columnaApellido;
	@FXML
	private TableColumn<OdontologoView, String> columnaMatricula;
	@FXML
	private TableColumn<OdontologoView, String> columnaEspecialidad;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		columnaNombre.setCellValueFactory(
                new PropertyValueFactory<OdontologoView, String>("nombre"));
		columnaApellido.setCellValueFactory(
                new PropertyValueFactory<OdontologoView, String>("apellido"));
		columnaMatricula.setCellValueFactory(
                new PropertyValueFactory<OdontologoView, String>("matricula"));
		columnaEspecialidad.setCellValueFactory(
                new PropertyValueFactory<OdontologoView, String>("especialidad"));

	}
	
	public void verTodos(ActionEvent event) {

		  // setea los pacientes en la tabla
		  
		//tablaListarOdontologos.getItems().setAll(null);
				
	}

	private boolean evaluar(OdontologoView p, String s) {
		return false;

		// if(p.getNombre().equals(s))
		// return true;
		// else if(p.getApellido().equals(s))
		// return true;
		// else if(p.getMatriicula().equals(s))
		// return true;
		// else if(p.getEspecialidad().equals(s))
		// return true;
		// else
		// return false;
	}

	public class OdontologoView {

	}

}
