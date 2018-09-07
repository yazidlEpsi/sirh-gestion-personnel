package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		if(matricule == null || prenom == null || nom == null || titre == null){
			resp.sendError(resp.SC_BAD_REQUEST, "un matricule est attendu");
		}
		else{
			resp.setStatus(resp.SC_ACCEPTED);
			resp.getWriter().write(" matricule = "+matricule+",titre = "+prenom+", nom = "+nom+ "titre ="+titre);;
			
		}

	}

}
