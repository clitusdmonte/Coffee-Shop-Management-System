/**
 *Connector class include a single method that will return a Connection object. 
 *The method can be called from any class needing to establish a connection to the papaserver 
 */
package model;

	

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * @author clitus dmonte
 *
 */
public class Connector {

	/**
	 * @return
	 * Establishes database connection.
	 */
	public static Connection connectDataBase() {
		// Creating Connection object.
		Connection connection = null;
		try {
			// loads the mysql driver using DriverManager class.
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());

		} catch (SQLException e) {
			System.out.println("Unable to load  jdbc driver class" + e);
		}
		// Saving database connections credentials into String objects.
		/*final String url = "jdbc:mysql://www.papademas.net:3306/510labs?autoReconnect=true&useSSL=false";
		final String userName = "db510";
		final String password = "510";*/
		
		final String url = "jdbc:mysql://www.papademas.net:3306/fp";
		final String userName = "dbfp";
		final String password = "510";

		try {
			// Establishing connection to mysql database server.
			connection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException err) {
			System.out.println("Unable to establish connection with database " + err);
		}

		// Return connection object.
		return connection;
	}

}
