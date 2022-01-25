<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Création des articles</title>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/inc/style.css" />
    </head>
    <body>
    	<%@ include file="header.jsp" %>
    
        <div>
            <form method="post" action="${pageContext.request.contextPath}/article/creation">
                <fieldset>
                    <legend>Article</legend>
    
                    <label for="titre">titre</label>
                    <input type="text" id="titre" name="titre" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="description">Description </label>
                    <input type="text" id="description" name="description" value="" size="20" maxlength="20" />
                    <br />
    
                    
                    <label for="contenu">Contenu</label>
                    <input type="text" id="contenu" name="contenu" value="" size="20" maxlength="60" />
                    <br />
                </fieldset>
                <input type="submit" value="Valider"  />
            </form>
        </div>
    </body>
</html>