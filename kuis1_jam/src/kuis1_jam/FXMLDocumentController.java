package kuis1_jam;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button btn_submit;

    @FXML
    private ComboBox<?> cb_jenis;

    @FXML
    private DatePicker dp_tanggal;

    @FXML
    private TextField tf_harga;

    @FXML
    private TextField tf_merek;

    @FXML
    private TextField tf_nama;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        //label.setText("Hello World!");
        System.out.println(tf_merek.getText());
        System.out.println(tf_nama.getText());
        System.out.println(cb_jenis.getValue().toString());
        System.out.println(dp_tanggal.getValue().toString());
        System.out.println(tf_harga.getText());
        System.out.println(btn_submit.getText());
        System.out.println(label.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
        ArrayList <String> list = new ArrayList<String>();
        list.add("Quartz");
        list.add("Automatic");
        list.add("Chronograph");
        list.add("Digital");
        ObservableList items = FXCollections.observableArrayList(list);
        cb_jenis.setItems(items);
    }    
    
}
