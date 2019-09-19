/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 784789
 */
public class NoteServlet extends HttpServlet 
{

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
               
        String path = getServletContext().getRealPath("/WEB-INF/note.txt"); 
        // to read file
         BufferedReader br = new BufferedReader(new FileReader(new File(path)));
         String titleDisplay = br.readLine();
         String contentDisplay = br.readLine();
         
         Note n = new Note(titleDisplay,contentDisplay);
         
         request.setAttribute("note", n);
         request.setAttribute("note", n);
         
         getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
         br.close();
         
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
         
         String path = getServletContext().getRealPath("/WEB-INF/note.txt");
           
         BufferedWriter bw = new BufferedWriter(new FileWriter(path, false));
         // to write to file
         PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
                  
       //  pw.println(titleText);
       //  pw.println(contentText);
         
         pw.close();

    }
}
