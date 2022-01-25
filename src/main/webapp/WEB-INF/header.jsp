<%@page import="beans.Utilisateur"%>
<% Utilisateur utilisateurConnecte = (Utilisateur) session.getAttribute("utilisateurConnecte"); %>

<header>
	Bienvenue ${utilisateurConnecte.afficher()} - <a href="${pageContext.request.contextPath}/deconnexion">Déconnexion</a>
</header>