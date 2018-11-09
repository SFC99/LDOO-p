/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Usuario
 */
public class FormularioControl extends HttpServlet {

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
            
                String oculto = request.getParameter("pista");
                
            if (oculto.equals("holi")){
                
                String nombre = request.getParameter("nombre");
                String primap = request.getParameter("primap");
                String segap = request.getParameter("segap");
                String cumple = request.getParameter("cumple");
                String correo = request.getParameter("mail");
                String pass = request.getParameter("pass");
                
                Usuario user = new Usuario();
                
                    user.setNombre(nombre);
                    user.setPrimap(primap);
                    user.setSegap(segap);
                    user.setCumple(cumple);
                    user.setMail(correo);
                    user.setPass(pass);  
               
                HttpSession sesion = request.getSession();
                    sesion.setAttribute("nombre", nombre);
                    sesion.setAttribute("id", correo);
                    sesion.setAttribute("passus", pass);
                    sesion.setAttribute("user", nombre);
                    
                DataBase data = new DataBase();
                data.getUrl();
                DbActualizar refresh  = data.Actualizar();
                DbInsertar agregar = data.Insertar();
                    
                   
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Fomulario Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Hola,  " + user.getNombre() + " " + user.getPrimap() + user.getSegap()+ " !<p>");
            out.println("<p>Naciste en : " + user.getCumple()+ "<p>");
            out.println("<p>Tu correo: " + user.getMail()+ "<p>");
            out.println("<p>Te recordamos la contraseña: " + user.getPass() + "<p>");
            out.println("<a href=Login.jsp>Iniciar Sesion</a> <br>");
            out.println("</body>");
            out.println("</html>");
             
            }else{
            HttpSession sesion = request.getSession();
            
                String correo = request.getParameter("user");
                String pass = request.getParameter("pass");
                String nombre = (String)sesion.getAttribute("nombre");
                String vmail = (String)sesion.getAttribute("id");
                String vclave = (String)sesion.getAttribute("passus");
                
           
                String query = "select * from ROOT.UNTITLED"; 
                request.getParameter("user");
                request.getParameter("pass");
                
            Validador v = new Validador();
                v.setPass(pass);
                v.setCorreo(correo);
                String nombre1 = null;
                String APP1 = null;
                String APM1 = null;
                String BDY1 = null;
                    
          
                    
             if (v.getCheck()){
                out.println("<br><br><br><br><br>Bienvenido " + nombre);
                out.println("<br><a href='index.html'>Cerrar sesion</a>");
                
                Cookie cookie = new Cookie("<br><br><br>Galletita",nombre);
                        cookie.setMaxAge(300);
                                
                        out.println(cookie.getName() + ":" + cookie.getValue());
                        response.addCookie(cookie);
            } else { 
                out.println("<br><br><br><br><br>Usuario y contraseña incorrectos"+" <br> <a href='Login.jsp'>Ingresar</a>"); 
            }
           }
    
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
