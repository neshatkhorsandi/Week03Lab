<%-- 
    Document   : editnote
    Created on : Sep 19, 2019, 12:31:43 PM
    Author     : 784789
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form action="note" method="post">
        Title: <input type="text" name="showTitle" size="15" value="${note.title}"><br>
        Contents: ​<input type="text" name="showContent" size="50" value="${note.content}" style="width: 200px;height:200px">
        <br>
         <input type="submit" value="Save">
        </form>
    </body>
</html>
