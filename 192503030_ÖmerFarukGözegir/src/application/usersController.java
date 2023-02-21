package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.MYSQL.Util.VeritabaniUtil;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import java.sql.*;


public class usersController {
	
	public usersController() {
		baglanti=VeritabaniUtil.baglan();
		
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_bitir;

    @FXML
    private ComboBox<String> combo_bakiye;

    @FXML
    private ComboBox<String> combo_odeme;

  

    @FXML
    private TextField txt_kartno;
    
    Connection baglanti=null;
    PreparedStatement sorgu=null;
    ResultSet cevap=null;
    String sql;
    
    	

    @FXML
    void btn_bitir_Clicked(MouseEvent event) {
    	
    	
    	
    	if(combo_bakiye.getSelectionModel().getSelectedIndex()!=-1 && combo_odeme.getSelectionModel().getSelectedIndex()!=-1 && txt_kartno.getText().length()!=0) {
    		
    		sql="select * from tbl_user where kart_no";
    		try {
    			sorgu=baglanti.prepareStatement(sql);
    			sorgu.setString(1, txt_kartno.getText().trim());
				
    			ResultSet cevap=sorgu.executeQuery();
    			if(!cevap.next()) {
    				Alert  alert=new Alert(AlertType.ERROR);
                	alert.setTitle("Bakiye Yükleme Baþarýsýz...");
                	alert.setHeaderText("Kart Numarasý Yanlýþ!");
                	alert.setContentText("Kart Numarasýnýn Doðru Olduðundan Emin Olunuz ");
                	alert.showAndWait();
    			}
    			else {
    				sql="insert into tbl_user(bakiye) values(?)";
    				try {
						sorgu.setString(2,combo_bakiye.getSelectionModel().getSelectedItem() );
						
					} catch (Exception e) {
						// TODO: handle exception
					}
    			}
    			
			} catch (Exception e) {
				// TODO: handle exception
			}
    		
    		
    		Alert  alert=new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Bakiye Yükleme");
	    	alert.setHeaderText("Bakiyeniz Oluþturulmuþtur.En yakýn þubeden Ödemenizi Yapabilirsiniz. ");
	    	alert.setContentText("Bakiye Kontrolünüzü Bakiye Sorgula Sayfasýndan Yapabilirsiniz. ");
	    	alert.showAndWait();
	    	
	    	
	    	
    	}
    	
    	else {
    		Alert  alert=new Alert(AlertType.WARNING);
	    	alert.setTitle("Bakiye Yükleme");
	    	alert.setHeaderText("Yükleme Basarýsýz Oldu..!");
	    	alert.setContentText("Lütfen Boþ Alan Býrakmadýðýnýzdan Emin Olunuz.");
	    	alert.showAndWait();
    	}
    	
    	
    }

    @FXML
    void initialize() {
    	
    	
    	String fiyat[]= {"5","10","15","20","50","100","200"};
    	combo_bakiye.getItems().addAll(fiyat);
    	
    	String yontem[]={"Havale","Banka Kartý"," Kredi Kartý","Mobil Ödeme","Papara","Diðer"};
    	combo_odeme.getItems().setAll(yontem);

    }

}
