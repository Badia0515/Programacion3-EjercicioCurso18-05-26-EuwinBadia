import javafx.fxml.FXML;

import java.lang.classfile.Label;
import java.util.Scanner;

import Javafx.scene.control.label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField TXTNumero;

    private ComboBox<String> Moneda;

    @FXML
    private Label Resultado;

    @FXML
    private void numero() {

        int Numero = Integer.parseInt(TXTNumero.getText());
        int Dolares = 59;
        int Euros = 59;
        int ResultadoDolar = Numero * Dolares;
        int ResultadoEuro = Numero * Euros;

    }

}
