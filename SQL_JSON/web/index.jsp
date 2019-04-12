<%-- 
    Document   : index
    Created on : 25/03/2019, 04:56:23 PM
    Author     : sdist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body onload="loadNewContent('salida', 'DataExtractor')">
  
        <script>
            function loadNewContent(id, target) {
                var ajaxRequest;
                if (window.XMLHttpRequest) {
                    ajaxRequest = new XMLHttpRequest(); // IE7+, Firefox, Chrome, Opera, Safari
                } else {
                    ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP"); // IE6, IE5
                }

                ajaxRequest.onreadystatechange = function () {
                    if (ajaxRequest.readyState == 4 && ajaxRequest.status == 200) {

                        var JSONObject = JSON.parse(ajaxRequest.responseText);
                     
                        var txt = ""
                        txt+="<select id='nombre' onchange='leaveChange()' > "
                        for (var i = 0; i < JSONObject.addresses.length; i++) {
                            //concatenar valores
                            txt += "<option>" + JSONObject.addresses[i].name+  "</option> "
                            
                        }
                        txt+="</select>"
                       /* var txt = "field1: " + JSONObject.field1 +
                                " field2: " + JSONObject.field2 +
                                " field3: " + JSONObject.field3 +
                                " <br />";*/
                        //alert(txt)
                        document.getElementById(id).innerHTML = txt;
                    }
                }

                ajaxRequest.open("GET", target, true /*async*/);
                ajaxRequest.send();
            }
            
            
            function leaveChange(){
                var nom = document.getElementById("nombre").value;
           
                var ajaxRequest;
                if (window.XMLHttpRequest) {
                    ajaxRequest = new XMLHttpRequest(); // IE7+, Firefox, Chrome, Opera, Safari
                } else {
                    ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP"); // IE6, IE5
                }

                ajaxRequest.onreadystatechange = function () {
                    if (ajaxRequest.readyState == 4 && ajaxRequest.status == 200) {

                       var JSONObject = JSON.parse(ajaxRequest.responseText);
   
                        var txt = ""

                       var txt = "ID: " + JSONObject.id +" <br />"+
                                " Nombre: " + JSONObject.name +" <br />"+
                                " Balance: " + JSONObject.balance +
                                " <br />";
                        
                         
                        document.getElementById("masInfo").innerHTML = txt;
                    }
                }
                target = "Busca"+ "?nom=" +nom ;
//+ "?nom=" +nom 
                ajaxRequest.open("GET", target  , true /*async*/);
                ajaxRequest.send();
                
            }
        </script>
                


        <div id="salida">Hola Mundo</div>
        <div id="masInfo">Hola Mundo</div>
        
        
        </form>
    </body>
</html>
