package com.sddevops.volunteeringapp_cw1_local;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class addEvent
 */
@WebServlet("/addEvent")
public class addEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addEvent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Welcome!");
		//response.getWriter().append("Added at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String d = request.getParameter("date");
		String c = request.getParameter("location");
		String e = request.getParameter("eventDescription");
		String m = request.getParameter("commitment");
		String n = request.getParameter("endDate");
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/volunteeringapp", "root", "");
		PreparedStatement ps = con
		.prepareStatement("insert into EVENTS values(?,?,?,?,?)");
		ps.setString(1, d);
		ps.setString(2, c);
		ps.setString(3, e);
		ps.setString(4, m);
		ps.setString(5, n);
		int i = ps.executeUpdate();
		if (i > 0)
		out.print(" The event has been added successfully.");
		} catch (Exception e2) {
		System.out.println(e2);
		}
		out.close();
	}

}
