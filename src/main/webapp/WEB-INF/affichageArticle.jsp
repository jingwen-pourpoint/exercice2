<%@page import="beans.Article"%>
<%@page import="java.util.List"%>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Blog</title>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/inc/style.css" />
    </head>
    <body>
    	<%@ include file="header.jsp" %>
    
	    <% List<Article> articles = (List<Article>) session.getAttribute("articles");
	
	    if (articles != null) {
			for(Article article : articles){ %>
			<div class="article">
		        
				Article<br>
				Auteur : <%=article.getAuteur().afficher() %><br>
				Titre : <%=article.getTitre() %><br>
				Description : <%=article.getDescription()%><br>
				Contenu: <%=article.getContenu() %><br>
				
		   </div>
			<% }
		} else {
			out.println("<em>Aucun article à afficher</em>");
		}%>
        
        
        <div>
        	<a href="${pageContext.request.contextPath}/article/creation">Créer un article</a>
        </div>
    </body>
</html>