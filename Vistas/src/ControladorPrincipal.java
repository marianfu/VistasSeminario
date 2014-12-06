
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

//import org.controlsfx.control.PopOver;

/**
 * Main controller class for the entire layout.
 */
public class ControladorPrincipal {

	/** Holder of a switchable vista. */
	@FXML
	private StackPane vistaHolder;
	
	/**
	 * Replaces the vista displayed in the vista holder with a new vista.
	 *
	 * @param node
	 *            the vista node to be swapped in.
	 */
	public void setVista(Node node) {
		vistaHolder.getChildren().setAll(node);
	}

	public void seleccionarPrincipal(ActionEvent event) {
		VistaNavegador.loadVista(VistaNavegador.VISTA_1);

	}

	public void seleccionarVistaAltaPaciente(ActionEvent event) {
		VistaNavegador.loadVista(VistaNavegador.VISTA_3);

	}

	public void seleccionarVistaAltaFichaPeriodontal(ActionEvent event) {
		VistaNavegador.loadVista(VistaNavegador.VISTA_4);

	}

	public void seleccionarVistaListarPacientes(ActionEvent event) {
		VistaNavegador.loadVista(VistaNavegador.VISTA_5);
	}

	public void seleccionarSalir(ActionEvent e) {
		System.exit(0);
	}

	public void seleccionarVistaAdministracionPacientes(ActionEvent event) {
		VistaNavegador.loadVista(VistaNavegador.VISTA_6);
	}

	public void seleccionarBotonHome(ActionEvent event) {
		VistaNavegador.loadVista(VistaNavegador.VISTA_1);
	}
	
	public void seleccionarVistaAltaOdontograma(ActionEvent event) {
		VistaNavegador.loadVista(VistaNavegador.VISTA_7);
	}
	
	public void seleccionarVistaListarOdontologos(ActionEvent event) {
		VistaNavegador.loadVista(VistaNavegador.VISTA_8);
	}
	
	public void seleccionarVistaAnalisisPredictivo(ActionEvent event) {
		VistaNavegador.loadVista(VistaNavegador.VISTA_9);
	}

	

	// public void testing(MouseEvent event) {
	//
	// tablaListarPacientes.setOnMouseClicked(new EventHandler<MouseEvent>() {
	//
	// @Override
	// public void handle(MouseEvent mEvent) {
	// if (mEvent.getClickCount() == 2) {
	// PopOver popOver;
	//
	// popOver = new PopOver();
	// popOver.show(tablaListarPacientes);
	// popOver.setContentNode(new Label("Test"));
	// popOver.setAutoHide(true);
	// }
	// }
	// });

}
