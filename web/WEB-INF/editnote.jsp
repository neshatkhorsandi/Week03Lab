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
        
        Title: <input type="text" name="showTitle" id="title" size="15" value="${note.title}"><br>
        Contents: ​<input type="text" name="showContent" id="content" size="50" value="${note.content}" style="width: 200px;height:200px">
        <br>
         <input type="submit" value="Save">
    </body>
</html>
