package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import beans.Utilisateur;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CreationUtilisateur extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/creation_utilisateur.jsp").forward(req, resp);	

	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom= req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String email = req.getParameter("email");
        
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(nom);
        utilisateur.setPrenom(prenom);
        utilisateur.setEmail(email);
        
    	HttpSession session = req.getSession();
    	List<Utilisateur> utilisateurs = (List<Utilisateur>) session.getAttribute("utilisateurs");
    	if (utilisateurs == null) {
    		utilisateurs = new ArrayList<>();
    	}
    	utilisateurs.add(utilisateur);
    	session.setAttribute("utilisateurs", utilisateurs);
		resp.sendRedirect(req.getContextPath() + "/connection");

	}
}
