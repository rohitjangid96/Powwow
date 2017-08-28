/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.questionanswercontroller;

import dao.questionanswerdao.KeywordDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.questionanswermodel.KeywordModel;

/**
 *
 * @author Lenovo
 */
public class GetKeyword extends HttpServlet {

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
           
           
           ServletContext context=getServletContext();
           
           int did=Integer.parseInt(request.getParameter("did"));
           
            KeywordModel km=new KeywordModel();
            km.setDid(did);
            
            
            String colorrr[]={"red","green","blue","orange","violet","yellow"};
            int i=0;
            KeywordDao kd=new KeywordDao();
            
            ArrayList<KeywordModel> kam=new ArrayList<>();
            kam=kd.getkeyworddomain(km, context);
            
            for(KeywordModel s:kam)
           {
               i=i%6;
               out.println("<div class=\"item\" data-value="+s.getKid() +">\n" +
"        <div class=\"ui "+colorrr[i]+" empty circular label\"></div>\n" +s.getKname() +"\n" +
"      </div>");
               i++;
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
