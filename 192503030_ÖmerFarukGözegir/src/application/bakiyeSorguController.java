package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.MYSQL.Util.VeritabaniUtil;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import java.sql.*;


public class bakiyeSorguController {
	
	 public bakiyeSorguController() {
		   baglanti=VeritabaniUtil.baglan();
		   
	   }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_sorgula;

    @FXML
    private TableColumn<userOne, String> column_sorgu;

    @FXML
    private TableView<userOne> tbl_sorgu;

    @FXML
    private TextField txt_numara;
    
    String sql;
    Connection baglanti=null;
    PreparedStatement sorgu=null;
    ResultSet cevap=null;

    @FXML
    void btn_sorgula_Clicked(MouseEvent event) {
    	goster(tbl_sorgu);
    	

    }
    
    
public void goster(TableView tablo) {
    	sql="select bakiye from tbl_user";
    	 ObservableList<userOne> adminIstek=FXCollections.observableArrayList();
    	
    
    		
    	    	adminIstek = FXCollections.observableArrayList();
    	    	try {
    	    		sorgu=baglanti.prepareStatement(sql);
    	        	ResultSet cevap=sorgu.executeQuery();
    	        	
    	    		
    	    		while(cevap.next())
    	    		{
    	    			adminIstek.add(new userOne (cevap.getString(1)));
    	    		}
    	    		
    	    		column_sorgu.setCellValueFactory(new PropertyValueFactory<>("gecmis"));
    	    		
    	    	} catch(Exception e) {
    	    		System.out.println(e.getMessage().toString());
    	    	
    
    	    	}
    	    	tbl_sorgu.setItems(adminIstek);
    	    }


    @FXML
    void initialize() {
    	

    }

}
