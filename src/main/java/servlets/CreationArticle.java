package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import beans.Article;
import beans.Utilisateur;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CreationArticle extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/creation_article.jsp").forward(req, resp);	

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titre = req.getParameter("titre");
		String descrption = req.getParameter("description");
		String contenu = req.getParameter("contenu");
		
		HttpSession session = req.getSession();
		Utilisateur utilisateurConnecte = (Utilisateur) session.getAttribute("utilisateurConnecte");
    	
		Article article = new Article();
		article.setAuteur(utilisateurConnecte);
		article.setTitre(titre);
		article.setDescription(descrption);
		article.setContenu(contenu);
		
    	List<Article> articles = (List<Article>) session.getAttribute("articles");
    	if (articles == null) {
    		articles = new ArrayList<>();
    	}
    	articles.add(article);
    	session.setAttribute("articles", articles);
    	
		resp.sendRedirect(req.getContextPath() + "/article/affichage");

	}
}
