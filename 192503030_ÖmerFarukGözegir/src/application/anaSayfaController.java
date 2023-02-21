package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class anaSayfaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView btn_ara;

    @FXML
    private ImageView img_bakiye;

    @FXML
    private ImageView img_exit;

    @FXML
    private ImageView img_hat;

    @FXML
    private ImageView img_kart;

    @FXML
    private ImageView img_pop;

    @FXML
    private ImageView img_posta;

    @FXML
    private TextField txt_ara;

    @FXML
    void btn_ara_Clicked(MouseEvent event) {

    }

    @FXML
    void img_bakiye_Clicked(MouseEvent event) {
    	try {
    		Stage stage1= new Stage();
			AnchorPane pane1 = (AnchorPane)FXMLLoader.load(getClass().getResource("bakiyeSorgu.fxml"));
			Scene scene1 = new Scene(pane1);
			
			
			stage1.setScene(scene1);
			stage1.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

    }

    @FXML
    void img_exit_Clicked(MouseEvent event) {
    	System.exit(1);

    }

    @FXML
    void img_hat_Clicked(MouseEvent event) {
    	try {
    		Stage stage1= new Stage();
			AnchorPane pane1 = (AnchorPane)FXMLLoader.load(getClass().getResource("hatlar.fxml"));
			Scene scene1 = new Scene(pane1);
			
			
			stage1.setScene(scene1);
			stage1.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

    }

    @FXML
    void img_kart_Clicked(MouseEvent event) {
    	try {
    		Stage stage1= new Stage();
			AnchorPane pane1 = (AnchorPane)FXMLLoader.load(getClass().getResource("login.fxml"));
			Scene scene1 = new Scene(pane1);
			
			
			stage1.setScene(scene1);
			stage1.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
    	


    }

    @FXML
    void img_pop_Clicked(MouseEvent event) {try {
		Stage stage1= new Stage();
		AnchorPane pane1 = (AnchorPane)FXMLLoader.load(getClass().getResource("populer.fxml"));
		Scene scene1 = new Scene(pane1);
		
		
		stage1.setScene(scene1);
		stage1.show();
	} catch(Exception e) {
		e.printStackTrace();
	}

    	


    }

    @FXML
    void img_posta_Clicked(MouseEvent event) {
    	try {
    		Stage stage1= new Stage();
			AnchorPane pane1 = (AnchorPane)FXMLLoader.load(getClass().getResource("istekKutusu.fxml"));
			Scene scene1 = new Scene(pane1);
			
			
			stage1.setScene(scene1);
			stage1.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

    }

    @FXML
    void initialize() {

}
}
