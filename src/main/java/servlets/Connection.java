package servlets;

import java.io.IOException;
import java.util.List;

import beans.Utilisateur;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Connection extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/connection.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		HttpSession session = req.getSession();
		List<Utilisateur> utilisateurs = (List<Utilisateur>) session.getAttribute("utilisateurs");
		
		Utilisateur utilisateurConnecte = verification(email,utilisateurs);

		if(utilisateurConnecte != null) {
			session.setAttribute("utilisateurConnecte", utilisateurConnecte);
			resp.sendRedirect(req.getContextPath() + "/article/affichage");
		}else {
			req.setAttribute("error", "Utilisateur non trouvé");
			this.getServletContext().getRequestDispatcher("/WEB-INF/connection.jsp").forward(req, resp);
		}

	}

	public Utilisateur verification(String email, List<Utilisateur> utilisateurs) {
		if (utilisateurs == null) {
			return null;
		}
		for (Utilisateur utilisateur : utilisateurs) {
			if(utilisateur.getEmail().equals(email)) {
				return utilisateur;
			}
		}
		return null;
	}

}
