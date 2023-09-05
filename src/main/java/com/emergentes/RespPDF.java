/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

@WebServlet(name = "RespPDF", urlPatterns = {"/RespPDF"})
public class RespPDF extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "inline; filename=generated.pdf");

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();

            // Utiliza una fuente por defecto (Helvetica Bold)
            Font font = new Font(FontFamily.HELVETICA, 12, Font.BOLD);

            Paragraph paragraph = new Paragraph("Sesan muy bienvenidos s El curso "
                    + "de emergentes donde aprenderemos a manejor MIME", font);
            Paragraph paragraph1 = new Paragraph("REALIZADO POR: SADAM JOSE QUISPE CHINO"+" Son muy complicadas enfocate y lograras vamos solo confia en ti", font);
            document.add(paragraph);
            document.add(paragraph1);
            
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
            response.getWriter().println("Error generando el PDF.");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
