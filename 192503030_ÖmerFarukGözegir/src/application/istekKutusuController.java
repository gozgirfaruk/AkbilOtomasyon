package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.MYSQL.Util.VeritabaniUtil;
import java.sql.*;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class istekKutusuController {
	public istekKutusuController() {
		baglanti=VeritabaniUtil.baglan();
		
	}
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_g�nder;

    @FXML
    private ComboBox<String> combo_katgori;

    @FXML
    private ComboBox<String> combo_t�r;

    @FXML
    private TextArea txt_area_mesaj;

    @FXML
    private TextField txt_kart;
    Connection baglanti=null;
    PreparedStatement sorgu=null;
    ResultSet cevap=null;
    String sql;

    @FXML
    void btn_g�nder_Clicked(MouseEvent event) {
    	
    	
    	if(combo_katgori.getSelectionModel().getSelectedIndex()!=-1 && combo_t�r.getSelectionModel().getSelectedIndex()!=-1 && txt_kart.getText().length() !=0 && txt_area_mesaj.getText().length()!=0 ) {
    		 {
    			
    			Alert  alert=new Alert(AlertType.INFORMATION);
    	    	alert.setTitle("G�r�� Bildir");
    	    	alert.setHeaderText("G�nderiminiz Basar� �le Gerceklestirildi. ");
    	    	alert.setContentText("Talebinize ile ilgili en k�sa s�rede ilgilenilecektir! ");
    	    	alert.showAndWait();
    	    	
        	}
    	}
    	
    	else {
    		Alert  alert=new Alert(AlertType.WARNING);
	    	alert.setTitle("G�r�� Bildir");
	    	alert.setHeaderText("G�nderiminiz Basar�s�z Oldu..!");
	    	alert.setContentText("L�tfen Bo� Alan B�rakmad���n�zdan Emin Olunuz.");
	    	alert.showAndWait();
    		
    	}
    	
    	
    	txt_kart.clear();
    	txt_area_mesaj.clear();
    	

    	
    	

    }

    @FXML
    void initialize() {
    	
    	
    	combo_t�r.setPromptText("T�r Se�in");
    	String t�r[]= {"�stek","�ikayet","Yorum"};
    	combo_t�r.getItems().addAll(t�r);
    	combo_katgori.setPromptText("Kategori Se�in");
    	String kato[]={"Giri�","�deme","Yolcu Bilgilendirme","Kart","Di�er"};
    	combo_katgori.getItems().setAll(kato);
    	
    	
    	

    }

}
