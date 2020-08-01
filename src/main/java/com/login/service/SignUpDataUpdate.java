package com.login.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

@Component
public class SignUpDataUpdate {
	String url = "jdbc:mysql://localhost:3306/loginapp";
	String dbName = "root";
	String dbPass = "12345";
	/**
	 * @param uname
	 * @param pass
	 * @param mob
	 * @return
	 * @throws Exception
	 */
	public boolean storeData(String uname, String pass, String mob)  throws Exception {
		
		String query="INSERT INTO credentials values('"+uname+"','"+pass+"','"+mob+"')";
		
		 boolean status = false;
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection(url,dbName,dbPass);
		 Statement st = con.createStatement();
		 boolean res = st.execute(query);
		 if(!res){
			 status = true;
		 }
		 st.close();
		 con.close();
		 
		return status;
	}
	/**
	 * @param uName
	 * @return
	 * @throws SQLException
	 */
	public boolean userNamePersistance(String uName) throws SQLException{
		String query = "select Name from credentials where name='"+uName+"'";
		Connection con = DriverManager.getConnection(url,dbName,dbPass);
		Statement st = con.createStatement();
		ResultSet res = st.executeQuery(query);
		boolean status = res.first();
		return status;
	}
}
