package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.MYSQL.Util.VeritabaniUtil;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.sql.*;

public class adminController {
	   public adminController() {
		   baglanti=VeritabaniUtil.baglan();
		   
	   }

	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_görüntüle;

    @FXML
    private Button btn_sil;

    @FXML
    private TableColumn<adminOne, Integer> c_kart;

    @FXML
    private TableColumn<adminOne, String> c_kategori;

    @FXML
    private TableColumn<adminOne, String> c_mesaj;

    @FXML
    private TableColumn<adminOne, String> c_tür;

    @FXML
    private TableView<adminOne> table_gorus;
    
    String sql;
    Connection baglanti=null;
    PreparedStatement sorgu=null;
    ResultSet cevap=null;
    


    @FXML
    void btn_sil_Click(MouseEvent event) {
    	
     sql="delete from  tbl_gorus where kart_no=?";
     try {
    	 sorgu=baglanti.prepareStatement(sql);
    	sorgu.setInt(1, c_kart.getCellData(table_gorus.getSelectionModel().getSelectedIndex()));
    	sorgu.executeUpdate();
    	
    	goster(table_gorus,"select * from tbl_gorus");
    
    	
    	
    	
    	
		
	} catch (Exception e) {
		// TODO: handle exception
	}
    	
    	
    	

    }
    
    public void goster(TableView tablo , String sql) {
    	
    	sql="select*from tbl_gorus";
    	 ObservableList<adminOne> adminIstek=FXCollections.observableArrayList();
    	
    
    		
    	    	adminIstek = FXCollections.observableArrayList();
    	    	try {
    	    		sorgu=baglanti.prepareStatement(sql);
    	        	ResultSet cevap=sorgu.executeQuery();
    	        	
    	    		
    	    		while(cevap.next())
    	    		{
    	    			adminIstek.add(new adminOne (cevap.getInt("kart_no"),cevap.getString("tür"),cevap.getString("kategori"),cevap.getString("mesaj")));
    	    		}
    	    		
    	    		c_kart.setCellValueFactory(new PropertyValueFactory<>("kart_no"));
    	    		c_kategori.setCellValueFactory(new PropertyValueFactory<>("kategori"));
    	    		c_tür.setCellValueFactory(new PropertyValueFactory<>("tür"));
    	    		c_mesaj.setCellValueFactory(new PropertyValueFactory<>("mesaj"));
    	    		table_gorus.setItems(adminIstek);
    	    	} catch(Exception e) {
    	    		System.out.println(e.getMessage().toString());
    	    	
    
    	    	}
    	    }

    @FXML
    void initialize() {
    	goster(table_gorus, "select * from tbl_gorus");
    }

}
