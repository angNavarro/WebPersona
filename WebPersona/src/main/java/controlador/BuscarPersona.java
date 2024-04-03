/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;

import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;
import modelo.PersonaDAO;

/**
 *
 * @author angel
 */
public class BuscarPersona extends HttpServlet {

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
        
        //Incluimos en la llegada que sea encondign utf-8
        request.setCharacterEncoding("utf-8");
        
        
        //Primer apartado, recoger los campos y hacer algun tratamiento. 
        //En este caso entra un string y no hay que hacer ningun try catch. 
        
        String apellido =request.getParameter("apellido");
        
        //Creamos un arraylist que contenga ese apellido. 
        //Importamos arraylist, Persona y PersonaDAO. 
        ArrayList<Persona> resultado =PersonaDAO.buscarPorApellido(apellido);
        
        //Para que la pagina de resultado pueda disponer de los datos le pasamos un arraylist. 
        //Es necesario establecer un atributo para el apellido que estamos buscando.
        //Es necesario establecer otro atributo con el arraylist de resultados. 
        request.setAttribute("apellido", apellido);
        request.setAttribute("lista",resultado);
        request.getRequestDispatcher("resultados.jsp").forward(request,response);
        
        
        
        
        
        
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
