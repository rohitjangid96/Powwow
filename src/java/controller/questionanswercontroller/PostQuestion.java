/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.questionanswercontroller;

import dao.questionanswerdao.QuestionDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.FacultyModel;
import model.StudentModel;
import model.questionanswermodel.QuestionModel;

/**
 *
 * @author Lenovo
 */
public class PostQuestion extends HttpServlet {

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
           
            HttpSession session=request.getSession();
           ServletContext context=getServletContext();
           QuestionModel qm=new QuestionModel();
            qm.setDomain(Integer.parseInt(request.getParameter("domain")));
           qm.setQue((String)request.getParameter("askedquestion"));
           String tagstring=request.getParameter("tags");
           
//            System.out.println("tags"+ tags);
           String tags[] = tagstring.split(",");
           ArrayList<String> tagsarraylist = new ArrayList<String>(Arrays.asList(tags));
           
           for(String ab: tagsarraylist)
                System.out.println("ab"+ab);
           
           String utype=(String)session.getAttribute("utype");
           StudentModel sm;
           FacultyModel fm;
           
           if(utype.equals("student"))
           { 
               sm=(StudentModel)session.getAttribute("userModel");
               qm.setUid(sm.getCcode());
               qm.setUname(sm.getName());
           }
           
           else if(utype.equals("faculty"))
           { 
               fm=(FacultyModel)session.getAttribute("userModel");
               qm.setUid(fm.getCcode());
               qm.setUname(fm.getName());
           }
           
//           ArrayList<String> tags=new ArrayList<>();
//           tags.add("dataaaaaaaaaaa");
//           tags.add("cppppppppppppp");
//           tags.add("boooooooooooook");
//           tags.add("rohan");
//           tags.add("sarthak");
//           tags.add("java");
           
//           qm.setDomain(Integer.parseInt(request.getParameter("domain")));
//           qm.setQue((String)request.getParameter("askedquestion"));
           qm.setTags(tagsarraylist);
           
           QuestionDao qd=new QuestionDao();
           qd.insertQuestion(qm, context, session);
          response.sendRedirect("MyFeed");
           
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
