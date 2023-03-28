package com.epicode.mainproject;

import java.sql.SQLException;

import com.epicode.connector.DBConnection;
import com.epicode.model.User;

public class GestioneDb {

	public static void main(String[] args) {
		
		try {
			DBConnection db = new DBConnection();
			User u = new User("Mario","Rossi", 25, "m.rossi@example.com");
			db.createUser(u);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
