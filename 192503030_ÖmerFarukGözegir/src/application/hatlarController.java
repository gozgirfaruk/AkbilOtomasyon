package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class hatlarController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView img_alti;

    @FXML
    private ImageView img_bes;

    @FXML
    private ImageView img_bir;

    @FXML
    private ImageView img_dort;

    @FXML
    private ImageView img_hat;

    @FXML
    private ImageView img_iki;

    @FXML
    private ImageView img_uc;

    @FXML
    private ImageView img_yedi;

    @FXML
    void img_alti_Clicked(MouseEvent event) {
    	Alert  alert=new Alert(AlertType.INFORMATION);
    	alert.setTitle("Güneþ Mah.-Sefaþehir Otobüsü");
    	alert.setHeaderText("Hareket Saatleri");
    	alert.setContentText("13:00"+"-14:00"+"-15:00"+"\n"+"16:00"+"-17:00"+"-18:00"+"-19:00");
    	alert.showAndWait();
    
    }

    @FXML
    void img_bes_Clicked(MouseEvent event) {
    	Alert  alert=new Alert(AlertType.INFORMATION);
    	alert.setTitle("Ýncilikaya-Grand Hotel. Otobüsü");
    	alert.setHeaderText("Hareket Saatleri");
    	alert.setContentText("06:00"+"-06:45"+"-07:30"+"\n"+"08:15"+"-09:00"+"-09:45"+"\n"+"10:30"+"-11:15"+"-12:00"+"-13:00");
    	alert.showAndWait();

    }

    @FXML
    void img_bir_Clicked(MouseEvent event) {
    	Alert  alert=new Alert(AlertType.INFORMATION);
    	alert.setTitle("Gazikent-Ensar Otobüsü");
    	alert.setHeaderText("Hareket Saatleri");
    	alert.setContentText("05:50"+"-06:00"+"-06:30"+"-07:00"+"\n"+"12:30"+"-13:30"+"-16:00"+"-18:45");
    	alert.showAndWait();

    	

    }

    @FXML
    void img_dort_Clicked(MouseEvent event) {
    	Alert  alert=new Alert(AlertType.INFORMATION);
    	alert.setTitle("Ýncilikaya-Çocuk Hast. Otobüsü");
    	alert.setHeaderText("Hareket Saatleri");
    	alert.setContentText("13:00"+"-14:00"+"-15:00"+"\n"+"16:00"+"-17:00"+"-18:00"+"-19:00");
    	alert.showAndWait();

    }

    @FXML
    void img_iki_Clicked(MouseEvent event) {
    	Alert  alert=new Alert(AlertType.INFORMATION);
    	alert.setTitle("Mavikent-Ýstasyon Otobüsü");
    	alert.setHeaderText("Hareket Saatleri");
    	alert.setContentText("06:00"+"-06:30"+"-07:00"+"-07:30"+"-08:00"+"\n"+"12:30"+"-13:30"+"-16:00"+"-18:30"+"-19:15"+"-19:45"+"-20:20");
    	alert.showAndWait();

    }

    @FXML
    void img_uc_Clicked(MouseEvent event) {
    	Alert  alert=new Alert(AlertType.INFORMATION);
    	alert.setTitle("Ýncilikaya-Çocuk Hast. Otobüsü");
    	alert.setHeaderText("Hareket Saatleri");
    	alert.setContentText("13:30"+"-14:30"+"-15:30"+"\n"+"16:30"+"-17:30"+"-18:30"+"-19:30");
    	alert.showAndWait();


    }

    @FXML
    void img_yedi_Clicked(MouseEvent event) {
    	Alert  alert=new Alert(AlertType.INFORMATION);
    	alert.setTitle("Güzelyurt Konutlarý-Grand Hotel Otobüsü");
    	alert.setHeaderText("Hareket Saatleri");
    	alert.setContentText("06:00"+"-06:30"+"-07:00"+"-07:30"+"-08:00"+"\n"+"12:30"+"-13:30"+"-16:00"+"-18:30"+"-19:15"+"\n"+"19:45"+"-20:20");
    	alert.showAndWait();


    }

    @FXML
    void initialize() {

    }

}
