/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.RegisterStudentDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.StudentModel;
import sendmail.otp;

/**
 *
 * @author Lenovo
 */
public class StudentRegisterController extends HttpServlet {

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
           
            StudentModel sm=new StudentModel();
           sm.setName(request.getParameter("name"));
           sm.setCcode(request.getParameter("ccode"));
           sm.setEmail(request.getParameter("email"));
           sm.setBranch(request.getParameter("branch"));
           sm.setSem(request.getParameter("sem"));
           sm.setSec(request.getParameter("sec"));
           sm.setPass(request.getParameter("pass"));
           sm.setSecque(request.getParameter("secque"));
           sm.setSecans(request.getParameter("secans"));
           
           int status=0;
         otp a=new otp();
         int ot=a.otpgenerator();
             String otpval;
              otpval = String.format("%d",ot);
              
              sm.setStatus(status);
              sm.setOtpval(otpval);
              
              RegisterStudentDao rsd=new RegisterStudentDao();
              boolean check;
              HttpSession session;
              session=request.getSession();
              
              check=rsd.insertstudent(sm, context,session);
              if(check)
                   response.sendRedirect("register pages/linklogin.jsp");
              else
                  System.out.println("ERRORRRRRR");
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
