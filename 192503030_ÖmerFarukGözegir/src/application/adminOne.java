package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class adminOne {
	
	
	String sql;
    Connection baglanti=null;
    PreparedStatement sorgu=null;
    ResultSet cevap=null;
    
    public  adminOne() {
    	
    	
    }
    
    
	private int kart_no;
	private String t�r;
	private String kategori;
	private String mesaj;
	
	
	
	
	public int getKart_no() {
		return kart_no;
	}

	public void setKart_no(int kart_no) {
		this.kart_no = kart_no;
	}

	
	
	public String getT�r() {
		return t�r;
	}

	public void setT�r(String t�r) {
		this.t�r = t�r;
	}

	public String getKategori() {
		return kategori;
	}

	public void setKategori(String kategori) {
		this.kategori = kategori;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	
	
	
	adminOne(int kartno,String t�r,String kategori,String mesaj){


		this.kart_no=kartno;
		this.t�r=t�r;
		this.kategori=kategori;
		this.mesaj=mesaj;
		
		
		
		
		
	}
	
	
}
