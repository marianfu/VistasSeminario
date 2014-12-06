import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class VistaListarPacientesControlador implements Initializable {

	private ObservableList<Persona> personas = FXCollections.observableArrayList();
	@FXML 
	private TextField textFiltrarTabla;
	@FXML
	private Button botonBuscar;
	@FXML
	private TableView<Persona> tablaListarPacientes;
	@FXML
	private TableColumn<Persona, String> columnaNombre;
	@FXML 
	private TableColumn<Persona, String> columnaApellido;	
	@FXML
	private TableColumn<Persona, String> columnaDni;
	@FXML 
	private TableColumn<Persona, String> columnaTelefono;	
	@FXML
	private TableColumn<Persona, String> columnaEmail;
	@FXML 
	private TableColumn<Persona, String> columnaNacimiento;	
	@FXML
	private TableColumn<Persona, String> columnaObraSocial;
	@FXML 
	private TableColumn<Persona, String> columnaPlan;	
	@FXML 
	private TableColumn<Persona, String> columnaActivo;	
	
	public void filtrarTabla(ActionEvent event){
		
		ObservableList<Persona> tablaFiltro = FXCollections.observableArrayList();
		
		for(Persona p : personas){
			
			if(this.evaluar(p, textFiltrarTabla.getText())== true){
				
				tablaFiltro.add(p);
			}
		}
		
		tablaListarPacientes.getItems().setAll(tablaFiltro);
	}
	
	public void verTodos(ActionEvent event) {

		  // setea los pacientes en la tabla
		  
		tablaListarPacientes.getItems().setAll(this.getPersonas());
				
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		  columnaNombre.setCellValueFactory(
	                new PropertyValueFactory<Persona, String>("nombre"));
		  columnaApellido.setCellValueFactory(
	                new PropertyValueFactory<Persona, String>("apellido"));
		  columnaDni.setCellValueFactory(
	                new PropertyValueFactory<Persona, String>("dni"));
		  columnaTelefono.setCellValueFactory(
	                new PropertyValueFactory<Persona, String>("telefono"));
		  columnaEmail.setCellValueFactory(
	                new PropertyValueFactory<Persona, String>("email"));
		  columnaNacimiento.setCellValueFactory(
	                new PropertyValueFactory<Persona, String>("nacimiento"));
		  columnaObraSocial.setCellValueFactory(
	                new PropertyValueFactory<Persona, String>("obraSocial"));
		  columnaPlan.setCellValueFactory(
	                new PropertyValueFactory<Persona, String>("plan"));
		  columnaActivo.setCellValueFactory(
	                new PropertyValueFactory<Persona, String>("activo"));
		  
		 
	}
	
	private boolean evaluar(Persona p, String s){
		
		if(p.getNombre().equals(s))
			return true;
		else if(p.getApellido().equals(s))
			return true;
		else if(p.getApellido().equals(s))
			return true;
		else if(p.getDni().equals(s))
			return true;
		else if(p.getEmail().equals(s))
			return true;
		else if(p.getNacimiento().equals(s))
			return true;
		else if(p.getTelefono().equals(s))
			return true;
		else if(p.getObraSocial().equals(s))
			return true;
		else if(p.getPlan().equals(s))
			return true;
		else if(p.getActivo().equals(s))
			return true;
		else
			return false;
	}
	
	private ObservableList<Persona> getPersonas(){
		
		// CREA Y RETORNA LA LISTA QUE CONTIENE LOS PACIENTES
		
		
		
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("a", "a", "a", "a", "a", "a", "a", "a", "a"));
		personas.add(new Persona("b", "a", "1234", "a", "a", "a", "a", "a", "a"));

		return personas;
	}
	
	public class Persona {

		private String nombre;
		private String apellido;
		private String email;
		private String dni;
		private String telefono;
		private String nacimiento;
		private String obraSocial;
		private String plan;
		private String activo;

		private Persona(String nombre, String apellido, String email, String telefono, String dni,
				String nacimiento, String obraSocial, String plan, String activo) {
			
			
			this.nombre = nombre;
			this.apellido = apellido;
			this.email = email;
			this.dni = dni;
			this.telefono = telefono;
			this.nacimiento = nacimiento;
			this.obraSocial = obraSocial;
			this.plan = plan;
			this.activo = activo;
			
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getNacimiento() {
			return nacimiento;
		}

		public void setNacimiento(String nacimiento) {
			this.nacimiento = nacimiento;
		}

		public String getObraSocial() {
			return obraSocial;
		}

		public void setObraSocial(String obraSocial) {
			this.obraSocial = obraSocial;
		}

		public String getPlan() {
			return plan;
		}

		public void setPlan(String plan) {
			this.plan = plan;
		}

		public String getActivo() {
			return activo;
		}

		public void setActivo(String activo) {
			this.activo = activo;
		}

		
	}
}
