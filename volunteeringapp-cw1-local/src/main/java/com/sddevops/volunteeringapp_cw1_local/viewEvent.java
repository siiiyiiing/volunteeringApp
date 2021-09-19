package com.sddevops.volunteeringapp_cw1_local;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class viewEvent
 */
@WebServlet("/viewEvent")
public class viewEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/volunteeringapp";
	private String jdbcUsername = "root";
	private String jdbcPassword = "";
	
	private static final String INSERT_EVENTS_SQL = "INSERT INTO events" + " (date, location, eventDescription, commitment, endDate) VALUES " + " (?,?,?,?,?);";
	
	private static final String SELECT_EVENTS_BY_DATE = "select date,location,eventDescription,commitment,endDate from events";
	private static final String SELECT_ALL_EVENTS = "select * from events";
	private static final String DELETE_EVENTS_SQL = "delete from events where date = ?;";
	private static final String UPDATE_EVENTS_SQL = "update events set date = ?,location= ?, eventDescription =?,commitment =?, endDate =? where date = ?;";

	
	protected Connection getConnection() {   
		Connection connection = null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return connection;
	}
}
