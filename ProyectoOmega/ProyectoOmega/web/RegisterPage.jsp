<%-- 
    Document   : RegisterPage
    Created on : May 4, 2019, 1:06:39 PM
    Author     : pmeji
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Join Data Web Wizard</h1>
        Name:<input type="text" id="nameID" name="name" value="" />
        Password:<input type="password" id="passwordID" name="password" value="" />


        <input type="submit" value="Register"  id="RegisterID" onclick="callRESTfulWebService(
                        'myDiv',
                        'GET',
                        'http://localhost:8080/ProyectoOmerga/webresources/Operations',
                        document.getElementById('name').value,
                        document.getElementById('password').value" />

        <script>
            function callRESTfulWebService(id, method, target, cant, have, want) {
                var ajaxRequest;
                if (window.XMLHttpRequest) {
                    ajaxRequest = new XMLHttpRequest(); // IE7+, Firefox, Chrome, Opera, Safari
                } else {
                    ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP"); // IE6, IE5
                }
                ajaxRequest.onreadystatechange = function () {

                    if (ajaxRequest.readyState == 4 &&
                            (ajaxRequest.status == 200 || ajaxRequest.status == 404)) {

                        document.getElementById(id).innerHTML = ajaxRequest.responseText;
                    }
                }
                ajaxRequest.open(method, target + "?cantidad=" + cant + "&have=" + have + "&want=" + want, true /*async*/);
                ajaxRequest.setRequestHeader("Content-Type", "text/html");
                ajaxRequest.send();
            }
        </script>

    </body>
</html>
