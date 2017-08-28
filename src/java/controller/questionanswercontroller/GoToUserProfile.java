/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.questionanswercontroller;

import dao.questionanswerdao.AnswerDao;
import dao.questionanswerdao.BlogDao;
import dao.questionanswerdao.DomainDao;
import dao.questionanswerdao.QuestionDao;
import dao.questionanswerdao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.questionanswermodel.AllBlogModel;
import model.questionanswermodel.DomainModel;
import model.questionanswermodel.QuestionAnswerModel;
import model.questionanswermodel.RelatedQuestionModel;

/**
 *
 * @author Lenovo
 */
public class GoToUserProfile extends HttpServlet {

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
         
            HttpSession session=request.getSession();
            ServletContext context=getServletContext();
            String uid=request.getParameter("id");
                
                UserDao ud=new UserDao();
                ud.getdetails(uid, context, session);
                
                RelatedQuestionModel rqm=new RelatedQuestionModel();
                QuestionDao qd=new QuestionDao();
                qd.myQuestions(rqm, uid, context);
                session.setAttribute("myquestions",rqm);
                
                QuestionAnswerModel qam=new QuestionAnswerModel();
                AnswerDao ad=new AnswerDao();
                ad.myAnswers(qam,uid,context);
                session.setAttribute("myanswers",qam);
                
                AllBlogModel abm=new AllBlogModel();
                BlogDao bd=new BlogDao();
                bd.getMyBlogs(abm,uid,context);
                session.setAttribute("myblogs",abm);
                
                DomainModel dm=new DomainModel();
                DomainDao dd=new DomainDao();
                dd.getMyWorkSpaces(dm,uid,context);
                session.setAttribute("myworkspaces",dm);
                
                response.sendRedirect("question-answer/profilepage.jsp");
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
