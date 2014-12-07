

import java.io.IOException;

import javafx.fxml.FXMLLoader;

/**
 *	Clase para controlador la navegación entre las vistas.
 */
public class VistaNavegador {

    /**
     * Los fxml layouts manejados por el navegador.
     */
	
    public static final String MAIN    = "FXML/main.fxml";
    public static final String VISTA_1 = "FXML/vistaInicio.fxml";
    public static final String VISTA_2 = "FXML/vista2.fxml";
    public static final String VISTA_3 = "FXML/vistaAltaPaciente.fxml";
    public static final String VISTA_4 = "FXML/vistaAltaHistoriaClinica.fxml";
    public static final String VISTA_5 = "FXML/vistaListarPacientes.fxml";
    public static final String VISTA_6 = "FXML/vistaAdministracionPacientes.fxml";
    public static final String VISTA_7 = "FXML/vistaAltaOdontograma.fxml";
    public static final String VISTA_8 = "FXML/vistaListarOdontologos.fxml";
    public static final String VISTA_9 = "FXML/vistaAnalisisPredictivo.fxml";

    
    private static VistaPrincipalControlador mainController;

    
    public static void setMainController(VistaPrincipalControlador mainController) {
        VistaNavegador.mainController = mainController;
    }

    /**
     * Loads the vista specified by the fxml file into the
     * vistaHolder pane of the main application layout.
     *
     * Previously loaded vista for the same fxml file are not cached.
     * The fxml is loaded anew and a new vista node hierarchy generated
     * every time this method is invoked.
     *
     * A more sophisticated load function could potentially add some
     * enhancements or optimizations, for example:
     *   cache FXMLLoaders
     *   cache loaded vista nodes, so they can be recalled or reused
     *   allow a user to specify vista node reuse or new creation
     *   allow back and forward history like a browser
     *
     * @param fxml the fxml file to be loaded.
     */
    public static void loadVista(String fxml) {
        try {
            mainController.setVista(
                FXMLLoader.load(
                    VistaNavegador.class.getResource(
                        fxml
                    )
                )
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}