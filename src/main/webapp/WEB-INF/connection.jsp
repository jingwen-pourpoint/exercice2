<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Connexion</title>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/inc/style.css" />
    </head>
    <body>
    	<h1>Connexion</h1>
    	<div class="error">${error}</div>
    
        <div>
            <form class="login" method="post" action="${pageContext.request.contextPath}/connection">
    
                    <label for="email">Email</label>
                    <input type="text" id="email" name="email" value="" />
                    <br />
          
                   
                <input type="submit" value="Valider"  />
              
            </form>
        </div>
        
        <div>
        	<a href="${pageContext.request.contextPath}/utilisateur/creation">Inscription</a>
        </div>
    </body>
</html>