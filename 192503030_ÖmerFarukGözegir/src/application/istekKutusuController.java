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
    private Button btn_gönder;

    @FXML
    private ComboBox<String> combo_katgori;

    @FXML
    private ComboBox<String> combo_tür;

    @FXML
    private TextArea txt_area_mesaj;

    @FXML
    private TextField txt_kart;
    Connection baglanti=null;
    PreparedStatement sorgu=null;
    ResultSet cevap=null;
    String sql;

    @FXML
    void btn_gönder_Clicked(MouseEvent event) {
    	
    	
    	if(combo_katgori.getSelectionModel().getSelectedIndex()!=-1 && combo_tür.getSelectionModel().getSelectedIndex()!=-1 && txt_kart.getText().length() !=0 && txt_area_mesaj.getText().length()!=0 ) {
    		 {
    			
    			Alert  alert=new Alert(AlertType.INFORMATION);
    	    	alert.setTitle("Görüþ Bildir");
    	    	alert.setHeaderText("Gönderiminiz Basarý Ýle Gerceklestirildi. ");
    	    	alert.setContentText("Talebinize ile ilgili en kýsa sürede ilgilenilecektir! ");
    	    	alert.showAndWait();
    	    	
        	}
    	}
    	
    	else {
    		Alert  alert=new Alert(AlertType.WARNING);
	    	alert.setTitle("Görüþ Bildir");
	    	alert.setHeaderText("Gönderiminiz Basarýsýz Oldu..!");
	    	alert.setContentText("Lütfen Boþ Alan Býrakmadýðýnýzdan Emin Olunuz.");
	    	alert.showAndWait();
    		
    	}
    	
    	
    	txt_kart.clear();
    	txt_area_mesaj.clear();
    	

    	
    	

    }

    @FXML
    void initialize() {
    	
    	
    	combo_tür.setPromptText("Tür Seçin");
    	String tür[]= {"Ýstek","Þikayet","Yorum"};
    	combo_tür.getItems().addAll(tür);
    	combo_katgori.setPromptText("Kategori Seçin");
    	String kato[]={"Giriþ","Ödeme","Yolcu Bilgilendirme","Kart","Diðer"};
    	combo_katgori.getItems().setAll(kato);
    	
    	
    	

    }

}
