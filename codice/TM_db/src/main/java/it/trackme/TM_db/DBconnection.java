package it.trackme.TM_db;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconnection {

	public static String DB_REL_FILE = "../db";
	public static String DB_URL = "jdbc:sqlite:" + DB_REL_FILE;
	
	public static void main(String[] args) {
	
		try {			
		 Connection conn = DriverManager.getConnection(DB_URL);
		 if (conn != null) {
		   DatabaseMetaData meta = conn.getMetaData();
		   System.out.println("The driver name is " + meta.getDriverName());
		   System.out.println("A new database has been created.");
		 }
		 // controllo che il file esista a questo punto
		 System.out.println("il file esiste? " + new File(DB_REL_FILE).exists());
		} catch (SQLException e) {
		  System.out.println(e.getMessage());
		}
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DB_URL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
