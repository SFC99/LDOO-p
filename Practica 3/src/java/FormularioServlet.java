/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class FormularioServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Practica_3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=\"FormularioServlet\" method=\"Post\">");
            out.println("<h1>Registra tus datos :) </h1>");
            out.println("Nombre: <input type=\"text\" name=\"nombre\"><br>");
            out.println("Primer Apellido: <input type=\"text\" name=\"primap\"><br>");
            out.println("Segundo Apellido: <input type=\"text\" name=\"segap\"><br>");
            out.println("Fecha de Nacimiento: <input type=\"date\" name=\"cumple\"><br>");
            out.println("Correo: <input type=\"email\" name=\"mail\"><br>");
            out.println("Contraseña: <input type=\"password\" name=\"pass\"><br>");
            out.println("<input type=\"submit\" value=\"Registrar\"><br>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                PrintWriter out = response.getWriter();
                String nombre = request.getParameter("nombre");
                String primap = request.getParameter("primap");
                String segap = request.getParameter("segap");
                String cumple = request.getParameter("cumple");
                String correo = request.getParameter("mail");
                String pass = request.getParameter("pass");
                
                out.println("<html>");
                out.println("<head><title>Respuesta</title></head>");
                out.println("<body>");
                out.println("<h2>Informacion registrada</h2>");
                out.println("Hola, " + nombre+ " " + primap+ " " + segap + "!<br>");
                out.println("Naciste en " + cumple + " :0 <br>");
                out.println("Tu correo: " + correo + "<br>");
                out.println("Te recordamos tu contraseña: " + pass + "<br>");
                out.println("</body></html>");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
 
	private void response(HttpServletResponse resp)
			throws IOException {
        }
    

}
