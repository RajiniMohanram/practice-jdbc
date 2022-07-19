package com.srt.project.app.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {
	private static Connection connection;

	private DbUtil() {
	}

	static {
		try {
			InputStream is = new FileInputStream("src/main/resources/db.properties");
			Properties prop = new Properties();
			prop.load(is);
			
			String driverUrl = prop.getProperty("db.driver");
			String dbUrl = prop.getProperty("db.url");
			String user = prop.getProperty("db.user");
			String password =prop.getProperty("db.password");
			
			Class.forName(driverUrl);
			connection = DriverManager.getConnection(dbUrl, user, password);
			
		} catch (SQLException ex) {
			System.out.println("SQL State: " + ex.getSQLState());
			System.out.println("Error Code: " + ex.getErrorCode());
			System.out.println("Message: " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("Unable to load/process DB properties. " + ex.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found. " + e.getMessage());
		}
	}

	public static Connection getConnection() {
		return connection;
	}

}
