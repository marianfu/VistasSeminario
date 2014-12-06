
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class VistaAltaHistoriaClinicaControlador implements Initializable {

	@FXML
	private BorderPane panelFichaPeriodontal;
	@FXML
	private Label datosPaciente;
	@FXML
	private TextField filtrarFicha;
	@FXML
	private Button botonBuscar;
	@FXML
	private Button botonCancelar;
	@FXML
	private VBox fichaPeriodontal;
	@FXML
	private ComboBox<String> comboOdontologos;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		panelFichaPeriodontal.setDisable(true);
		panelFichaPeriodontal.getStylesheets().setAll(
				getClass().getResource("historiaClinica.css").toExternalForm());
		
		comboOdontologos.getItems().addAll("Odontologo 1");
		comboOdontologos.getItems().addAll("Odontologo 2");
		comboOdontologos.getItems().addAll("Odontologo 3");
		comboOdontologos.getItems().addAll("Odontologo 4");
	}

	public void presionarBuscarPaciente(ActionEvent event) {

		panelFichaPeriodontal.setDisable(false);
		datosPaciente.setText(filtrarFicha.getText());
	}

	public void mostrarPrevisualizacion(ActionEvent event) {

		this.generarPrevisualizacion(fichaPeriodontal).show();
	}
	
	private Stage generarPrevisualizacion(Node node){
		
		WritableImage imagen = node.snapshot(
				new SnapshotParameters(), null);
		ImageView imagenView = new ImageView();
		imagenView.setImage(imagen);

		StackPane snapLayout = new StackPane();
		snapLayout.getChildren().add(imagenView);

		Scene snapScene = new Scene(snapLayout, imagen.getWidth(),
				imagen.getHeight());

		Stage ventanaPrevisualizacion = new Stage();
		ventanaPrevisualizacion.setTitle("Previsualización");
		ventanaPrevisualizacion.setScene(snapScene);
		ventanaPrevisualizacion.initStyle(StageStyle.UNIFIED);

		return ventanaPrevisualizacion;
	}

}
