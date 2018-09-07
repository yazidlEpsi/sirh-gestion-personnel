package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

public class ListerCollaborateursController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().write("yo la cladqzdsse");
		String avecPhotoParam = req.getParameter("avecPhoto");
		String departementParam = req.getParameter("departement");
		resp.setContentType("text/html");
		
resp.getWriter().write("<h1>liste des collabos </h1>" +"<ul> "+ "<li> avec photo" + avecPhotoParam+"</li>"+ "<li> dep" + departementParam+"</li>"+"</ul>");
	}
	
}
