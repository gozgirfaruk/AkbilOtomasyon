package application;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userOne {
	

	String sql;
    Connection baglanti=null;
    PreparedStatement sorgu=null;
    ResultSet cevap=null;
    
    
    private  String gecmis;


	public String getGecmis() {
		return gecmis;
	}


	public void setGecmis(String gecmis) {
		this.gecmis = gecmis;
	}
    
  
	
	userOne(String gecmis){
		this.gecmis=gecmis;
		
	}
    
    
    

}
