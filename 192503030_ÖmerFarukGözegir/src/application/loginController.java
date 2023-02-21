package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.MYSQL.Util.VeritabaniUtil;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.sql.*;

public class loginController {
	
	public loginController() {
		baglanti=VeritabaniUtil.baglan();
		
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_giriþ;

    @FXML
    private Button btn_kayýt;

    @FXML
    private RadioButton radio_admin;

    @FXML
    private TextField txt_sifre;

    @FXML
    private TextField txt_telefon;
    
    Connection baglanti=null;
    PreparedStatement sorgu=null;
    ResultSet cevap=null;
    String sql;
    

    @FXML
    void btn_giriþ_Clicked(MouseEvent event) {
    	
    	if(txt_telefon.getLength()==0 && txt_sifre.getLength()==0) {
    		
    		Alert  alert=new Alert(AlertType.ERROR);
        	alert.setTitle("Giriþ Baþaraýsýz...");
        	alert.setHeaderText("Boþ Alan Býrakýlamaz!");
        	alert.setContentText("Telefon veya Þifre Boþ Geçilemez. Lütfen Boþ Olmadýðýndan  emin olunuz. ");
        	alert.showAndWait();
    	}
    	
    	sql="select * from tbl_login where  Telefon=? and Sifre=?";
    	try {
    		sorgu=baglanti.prepareStatement(sql);
    		sorgu.setString(1, txt_telefon.getText().trim());
    		sorgu.setString(2, txt_sifre.getText().trim());
    		
    		
    		ResultSet cevap=sorgu.executeQuery();
    		
    		if(!cevap.next()) {
    			Alert  alert=new Alert(AlertType.ERROR);
            	alert.setTitle("Giriþ Baþaraýsýz...");
            	alert.setHeaderText("Telefon veya Þifre Yanlýþ!");
            	alert.setContentText("Telefon veya Þifrenizin Doðru Olduðundan Emin Olunuz ");
            	alert.showAndWait();
    			
    		}
    		else {
    			if(radio_admin.isSelected()) {
    				try {
    		    		Stage stage1= new Stage();
    					AnchorPane pane1 = (AnchorPane)FXMLLoader.load(getClass().getResource("admin.fxml"));
    					Scene scene1 = new Scene(pane1);
    					
    					
    					stage1.setScene(scene1);
    					stage1.show();
    				} catch(Exception e) {
    					e.printStackTrace();
    				}
    			}
    			
    			else {
    				try {
    		    		Stage stage1= new Stage();
    					AnchorPane pane1 = (AnchorPane)FXMLLoader.load(getClass().getResource("users.fxml"));
    					Scene scene1 = new Scene(pane1);
    					
    					
    					stage1.setScene(scene1);
    					stage1.show();
    				} catch(Exception e) {
    					e.printStackTrace();
    				}
    			}
    		}
    	
		} catch (Exception e) {
			txt_sifre.setText(e.getMessage().toString());
			
		}

    }

    @FXML
    void btn_kayýt_Clicked(MouseEvent event) {
    	if(txt_telefon.getLength()==0 && txt_sifre.getLength()==0) {
    		
        		Alert  alert=new Alert(AlertType.ERROR);
            	alert.setTitle("Kayýt Baþarýsýz...");
            	alert.setHeaderText("Boþ Alan Býrakýlamaz!");
            	alert.setContentText("Telefon veya Þifre Boþ Geçilemez. Lütfen Boþ Olmadýðýndan  emin olunuz. ");
            	alert.showAndWait();
        	}
    	
    	
    	else if(radio_admin.isSelected()) {
    		 
        		Alert  alert=new Alert(AlertType.ERROR);
            	alert.setTitle("Kayýt Baþarýsýz...");
            	alert.setHeaderText("Admin Seçili");
            	alert.setContentText("Admin için kayýt yapýlamamaktadýr. Lütfen admin seçeneðinin seçili olmadýðýndan  emin olunuz. ");
            	alert.showAndWait();
        	
    	}
    	
    	else {
    		//Kayýt
    	sql="insert into tbl_login(Telefon,Sifre)values (?,?)";
    	
    	try {
    		
    		sorgu=baglanti.prepareStatement(sql);
    		sorgu.setString(1, txt_telefon.getText().trim());
    		sorgu.setString(2, txt_sifre.getText().trim());
    		sorgu.executeUpdate();
    		
    		Alert  alert=new Alert(AlertType.ERROR);
        	alert.setTitle("Kayýt Baþarýlý...");
        	alert.setHeaderText("Kaydýnýz Tapýlmýþtýr");
        	alert.setContentText("Telefon Numaranýz ve Belirlediðiniz Þifre ile Giriþ Yapabilirsiniz. ");
        	alert.showAndWait();
			
		} catch (Exception e) {
			// TODO: handle exception
			txt_sifre.setText(e.getMessage().toString());
		}
    	}
    	
    	
    	
    	
    	
    	}
    	
    	
    	

    

    @FXML
    void radio_admin_Clicked(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }

}
