/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author intel
 */
@WebServlet(name = "RespHTML", urlPatterns = {"/RespHTML"})
public class RespHTML extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>HTML resp</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Usted esta genreando un"
                    + "HTML desde un <i>Servlet</i> con Java</h1>");
            out.println("<p>REALIZADO POR: SADAM JOSE QUISPE CHINO</p>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }
        
   

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


}
