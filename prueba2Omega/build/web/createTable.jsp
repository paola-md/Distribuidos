<!DOCTYPE html>
<html>
    <head lang="en">
        <meta charset="utf-8">
        <title>Create table</title>
        <script>

            // Wait until the window finishes loaded before executing any script
            window.onload = function () {
                // Initialize the activityNumber
                var activityNumber = 3;
                // Select the add_activity button
                var addButton = document.getElementById("add_activity");
                // Select the remove_activity button
                var removeButton = document.getElementById("remove_activity");
                // Select the table element
                var tracklistTable = document.getElementById("tracklist");
                // Attach handler to the button click event
                addButton.onclick = function () {
                    // Add a new row to the table using the correct activityNumber
                    tracklistTable.innerHTML += '<tr><td>' + activityNumber +
                            '</td><td><label>Field name: </label><br/><input type="text" name="actlog'
                            + activityNumber + '" class="required"></td>\n\
                            <td>  <label>Type: </label><br/>  <select name="time' + activityNumber +
                            '"  class="required"><option>Integer</option><option>Double</option> <option>Varchar</option> </select> </td>';
                    // Increment the activityNumber
                    activityNumber += 1;
                };

                removeButton.onclick = function () {
                    var table = document.getElementById("tracklist");
                    var rowCount = table.rows.length;
                    table.deleteRow(rowCount - 1);
                    activityNumber -= 1;

                }
                ;


            };





            function loadNewContent(id, target) {
                var ajaxRequest;
                if (window.XMLHttpRequest) {
                    ajaxRequest = new XMLHttpRequest(); // IE7+, Firefox, Chrome, Opera, Safari
                } else {
                    ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP"); // IE6, IE5
                }
                ajaxRequest.onreadystatechange = function () {
                    if (ajaxRequest.readyState == 4 && ajaxRequest.status == 200) {
                        document.getElementById(id).innerHTML = ajaxRequest.responseText;
                    }
                }
                ajaxRequest.open("GET", target, true /*async*/);
                ajaxRequest.send();
            }



        </script>

    </head>

    <body>
        <div class="container">
            <div class="row">
                <div class="leftcol">
                    <form name='mainForm' id='mainForm' method="get" action="#">
                        <fieldset>
                            <legend>Table Builder</legend>
                            <table id="tracklist">
                                <tr>
                                    <th colspan="3">Fields List: </th>
                                </tr>

                                <tr >
                                    <td>1</td>
                                    <td><label>Field name: </label><br/><input type="text" name="actlog1" class="required"></td>
                                    <td>
                                        <label>Type: </label><br/>
                                        <select name="time1" class="required">
                                            <option>Integer</option>
                                            <option>Double</option>
                                            <option>Varchar</option>
                                        </select>
                                    </td>
                                </tr>

                                <tr >
                                    <td>2</td>
                                    <td><label>Field name: </label><br/><input type="text" name="actlog2" class="required"></td>
                                    <td>                                                                               
                                        <label>Type: </label><br/>
                                        <select name="time2" class="required">
                                            <option>Integer</option>
                                            <option>Double</option>
                                            <option>Varchar</option>
                                        </select>
                                    </td>
                                </tr>
                            </table>
                            <input type="submit" value="Create table" />
                        </fieldset>
                    </form>
                    <button id="add_activity">Add Field</button>
                    <button id="remove_activity">Remove Field</button>
                </div>
            </div>
        </div>
    </body>
</html>


