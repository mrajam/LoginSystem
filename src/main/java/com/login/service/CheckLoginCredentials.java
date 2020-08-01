package com.login.service;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component
public class CheckLoginCredentials {

	public boolean check(String uName, String pass) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/loginapp";
		String conName = "root";
		String conPass = "12345";
		String query = "select password from credentials where name='" + uName + "'";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, conName, conPass);
		Statement st = con.createStatement();
		ResultSet resultSet = st.executeQuery(query);
		while (resultSet.next()) {
			if (pass.equalsIgnoreCase(resultSet.getString("password"))) {
				return true;
			}
		}
		return false;
	}

}
