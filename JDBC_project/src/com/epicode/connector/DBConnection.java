package com.epicode.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.epicode.model.User;

public class DBConnection {
	
	private String url ="jdbc:postgresql://localhost:5432/";
	private String dbname="JDBC_Java";
	private String usernamedatabase="postgres";
	private String password="qwertyuiopè+";
	Statement st;
	public DBConnection() throws SQLException{
		Connection conn = DriverManager.getConnection(url+dbname,usernamedatabase,password);
		 st = conn.createStatement();
		 createTabUser();
	}
	
	
	public void createTabUser() throws SQLException {
		
		String sql = "CREATE TABLE IF NOT EXISTS Users ("
				+ "id_user SERIAL PRIMARY KEY,"
				+ "nome VARCHAR NOT NULL,"
				+ "cognome VARCHAR NOT NULL,"
				+ "anni INT2 NOT NULL,"
				+ "email VARCHAR NOT NULL UNIQUE)";
		this.st.executeUpdate(sql);
		
	}
	
	public void createUser(User u) throws SQLException  {
		String sql = "INSERT INTO Users (nome, cognome, anni, email) "
				+ "VALUES ('"+u.getNome()+"', '"+u.getCognome()+"', "+u.getAnni()+", '"+u.getEmail()+"')";
		this.st.executeUpdate(sql);
	}
	
	public User findUser(Integer id) {
		String sql = "SELECT * FROM users WHERE id_user = "+ id;
		ResultSet rs = this.st.executeQuery(sql);
		
	}

}
