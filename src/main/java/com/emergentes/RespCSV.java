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

@WebServlet(name = "RespCSV", urlPatterns = {"/RespCSV"})
public class RespCSV extends HttpServlet {
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/csv");
        response.setHeader("content-Disposition","attachment;filename=archivo.csv");
        PrintWriter out = response.getWriter();
        try{
            out.println("Id;Nombre;Apellidos;Edad");
            out.println("1;Sadam Jose;Quispe Chino;20");
            out.println("2;Luna;Quinteroz;45");
            out.println("3;Noel;Lobo;30");
        }finally{
        out.close();
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        }

    
}
