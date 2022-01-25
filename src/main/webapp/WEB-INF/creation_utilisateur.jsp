<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Création d'un utilisateur</title>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/inc/style.css" />
    </head>
    <body>
        <div>
            <form method="post" action="${pageContext.request.contextPath}/utilisateur/creation">
                <fieldset>
                    <legend>Informations utilisateur</legend>
    
                    <label for="nom">Nom <span class="requis">*</span></label>
                    <input type="text" id="nom" name="nom" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="prenom">Prénom </label>
                    <input type="text" id="prenom" name="prenom" value="" size="20" maxlength="20" />
                    <br />
    
                    
                    <label for="email">Adresse email</label>
                    <input type="email" id="email" name="email" value="" size="20" maxlength="60" />
                    <br />
                </fieldset>
                <input type="submit" value="Valider"  />
            </form>
        </div>
    </body>
</html>