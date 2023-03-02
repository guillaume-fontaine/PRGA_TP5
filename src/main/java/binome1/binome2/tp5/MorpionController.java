package binome1.binome2.tp5;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MorpionController implements Initializable {

    @FXML
    public GridPane grille;
    @FXML
    public Label labelEtatJeu;
    @FXML
    public Label labelNbCoups;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}