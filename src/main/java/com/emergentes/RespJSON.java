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
@WebServlet(name = "RespJSON", urlPatterns = {"/RespJSON"})
public class RespJSON extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        try{
            out.println("{\"empleados\":[");
            out.println("{\"nombre\":\"SADAM JOSE\",\"apellidos\"\"QUISPE CHINO\"},");
            out.println("{\"nombre\":\"Juan Jose\",\"apellidos\"\"Luna\"},");
            out.println("{\"nombre\":\"Dolores\",\"apellidos\"\"Fuertez\"}");
            out.println("]}");
        }finally{
            out.close();
        }
        }
 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
    }

 
}
