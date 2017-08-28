/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.questionanswercontroller;

import dao.questionanswerdao.AnswerDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.FacultyModel;
import model.StudentModel;
import model.questionanswermodel.AnswerModel;

/**
 *
 * @author Lenovo
 */
public class UpDown extends HttpServlet {

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
            
            String uvote=request.getParameter("uvote");
            int qid=Integer.parseInt(request.getParameter("qid"));
            String uid=request.getParameter("uid");
            
          
            
            ServletContext context=getServletContext();
            HttpSession session=request.getSession();
            
            AnswerModel am=new AnswerModel();
            am.setQid(qid);
            am.setUid(uid);
            
           String utype=(String)session.getAttribute("utype");
           StudentModel sm;
           FacultyModel fm;
           String id="";
           if(utype.equals("student"))
           { 
               sm=(StudentModel)session.getAttribute("userModel");
               id=sm.getCcode();
           }
           
           else if(utype.equals("faculty"))
           { 
               fm=(FacultyModel)session.getAttribute("userModel");
               id=fm.getCcode();
           }
           
            
            AnswerDao ad=new AnswerDao();
            int votecount=0;
            if(uvote.equals("upvote"))
            {
            votecount=ad.incVote(am,context,id);
            }
            else
            {
            votecount=ad.decVote(am,context,id);
            }
            out.println(votecount);
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
