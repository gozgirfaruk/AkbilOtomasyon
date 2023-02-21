

package com.MYSQL.Util;

import java.sql.*;


public class VeritabaniUtil {
	static Connection conn=null;
	
	public static Connection baglan() {
		try {
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost/akbil_otomasyon_database","root","mysql");
			return conn;
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			return null;
			
		}
	}

}
