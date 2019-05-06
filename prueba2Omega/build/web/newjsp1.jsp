<%-- 
    Document   : llamaConexion
    Created on : Apr 22, 2019, 4:27:34 PM
    Author     : pmeji
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <script type="text/javascript">
            function add() {
                var element = document.createElement("input");
                element.setAttribute("type", "text");
                element.setAttribute("name", "mytext");
                var spanvar = document.getElementById("myspan");
                spanvar.appendChild(element);
            }

            function addElement(parentId, elementTag, elementId, html) {
                // Adds an element to the document
                var p = document.getElementById(parentId);
                var newElement = document.createElement(elementTag);
                newElement.setAttribute('id', elementId);
                newElement.innerHTML = html;
                p.appendChild(newElement);
            }


            function removeElement(elementId) {
                // Removes an element from the document
                var element = document.getElementById(elementId);
                element.parentNode.removeChild(element);
            }


            var fileId = 0; // used by the addFile() function to keep track of IDs
            function addFile() {
                fileId++; // increment fileId to get a unique ID for the new element
                var html = '<input type="file" name="uploaded_files[]" /> ' +
                        '<a href="" onclick="javascript:removeElement('file - ' + fileId + ''); return false;">Remove</a>';
                        addElement('files', 'p', 'file-' + fileId, html);
            }

        </SCRIPT>
        <form enctype="multipart/form-data" action="" method="post">
            <p>Upload file(s)</p>
            <div id="files">
                <p><input type="file" name="uploaded_file[]" /></p>
            </div>
            <p><input type="button" value="Add File" onclick="addFile();" /></p>
        </form>
    </body>
</html>


