package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.junit.Test;

public class DBTest {
	
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:log4jdbc:postgresql://119.196.16.194/sonax_dev";
	private static final String USER = "sonax";
	private static final String PW = "sonax2020!@";

	@Test
	public void dbTest() {
		try {
			Class.forName(DRIVER);
			try {
				Connection conn = DriverManager.getConnection(URL, USER, PW);
				System.out.println("==========>" + conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
