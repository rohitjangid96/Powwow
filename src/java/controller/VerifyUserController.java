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
public class VerifyUserController extends HttpServlet {

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
            LoginModel lm= new  LoginModel();
            
            System.out.println("login k controller me ayaa");
            lm.setEmail(request.getParameter("email"));
            lm.setPass(request.getParameter("pass"));
            
            
            HttpSession session=request.getSession();
            
            
            
            LinkLoginDao ld=new LinkLoginDao();
            boolean flag=false;
            try {
                System.out.println("verifylogin call hua login k time");
                flag=ld.verifylogin(lm, context,session);
            } catch (SQLException ex) {
                Logger.getLogger(VerifyUserController.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(flag)
                response.sendRedirect("MyFeed");
            else
                out.println("INVALID USER");
//            String isRemember=request.getParameter("isRemember");
//            LinkLoginDao ld=new LinkLoginDao ();
//            try {
//                boolean verifylogin = ld.verifylogin(lm, context);
//                if(verifylogin)
//                {   if(isRemember!=null)
//                { Cookie ck1 = new Cookie("email",lm.getEmail());
//                    Cookie ck2= new Cookie("pass",lm.getPass());
//                    
//                    ck1.setMaxAge(60*60*24*30);
//                    ck2.setMaxAge(60*60*24*30);
//                    response.addCookie(ck1);
//                    response.addCookie(ck2);
//                }
//                    response.sendRedirect("index.jsp");
//                }
//                else
//                { out.println("windows.alert('invalid user')");
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(VerifyUserController.class.getName()).log(Level.SEVERE, null, ex);
//            }
            
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
