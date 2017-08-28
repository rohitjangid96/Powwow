/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.LinkLoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginModel;

/**
 *
 * @author Lenovo
 */
public class LinkLoginController extends HttpServlet {

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
            HttpSession session=request.getSession();
            String email=request.getParameter("email");
            String pass=request.getParameter("pass");
            String otpval=request.getParameter("otpval");
            System.out.println(request.getParameter("otpval"));
            
            String abc=""+otpval;
            System.out.println("abc=" +abc);
            LoginModel lm=new LoginModel();
            lm.setEmail(email);
            lm.setPass(pass);
            lm.setOtpval(otpval);
            
            System.out.println(lm.getEmail());
            System.out.println(lm.getOtpval());
             System.out.println("link login controller ke andar"); 
            boolean check=false;
            LinkLoginDao ld=new LinkLoginDao();
            
            try {
                check= ld.verifylinklogin(lm, context,session);
                
                 if(check)
                response.sendRedirect("question-answer/chooseworkspace.jsp");
            else
                out.println("WRONG OTP OR PASSWORD");
            } catch (SQLException ex) {
                Logger.getLogger(LinkLoginController.class.getName()).log(Level.SEVERE, null, ex);
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
