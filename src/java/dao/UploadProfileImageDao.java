/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import model.FacultyModel;
import model.StudentModel;

/**
 *
 * @author Lenovo
 */
public class UploadProfileImageDao {
    Connection con;
    public boolean updatefaculty(String pass, ServletContext context,HttpSession session) 
    {
        try {
            con=(Connection) context.getAttribute("datacon");
            FacultyModel user=(FacultyModel) session.getAttribute("fuser");
                        String id=user.getCcode();
            
            String qrt="update facultyreg set pass=? where ccode=? ";
            PreparedStatement pst;
            pst=con.prepareStatement(qrt);
            pst.setString(1, pass);
            pst.setString(2, id);
             pst.executeUpdate();
            
           
            
            return true;
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(UploadProfileImageDao.class.getName()).log(Level.SEVERE, null, ex);
        }
          return false;
    }
    
    
    
    public boolean updatestudent(String pass,String sem, ServletContext context,HttpSession session) 
    {
        try {
            con=(Connection) context.getAttribute("datacon");
            StudentModel user=(StudentModel) session.getAttribute("suser");
                        String id=user.getCcode();
            
            String qrt="update studentreg set sem=?, pass=? where ccode=? ";
            PreparedStatement pst;
            pst=con.prepareStatement(qrt);
            pst.setString(1, sem);
            pst.setString(2, pass);
            pst.setString(3, id);
             pst.executeUpdate();
            
//            String ccode=(String) session.getAttribute("logeduserccode");
//            String query="update users set profileimgpath=? where ccode=?";
//            PreparedStatement ps;
//            ps=con.prepareStatement(query);
//            ps.setString(1, imgpath);
//            ps.setString(2, ccode);
//            ps.executeUpdate();
//            
//            
//            String query2="update allusers set imgpath=? where uid=?";
//            PreparedStatement ps2;
//            ps2=con.prepareStatement(query2);
//            ps2.setString(1, imgpath);
//            ps2.setString(2, ccode);
//            ps2.executeUpdate();
            
            
            return true;
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(UploadProfileImageDao.class.getName()).log(Level.SEVERE, null, ex);
        }
          return false;
    }
    
    
    
     public boolean updateimage(String imgpath, ServletContext context,HttpSession session) 
    {
        try {
            con=(Connection) context.getAttribute("datacon");
            
            
            String ccode=(String) session.getAttribute("logeduserccode");
            String query="update users set profileimgpath=? where ccode=?";
            PreparedStatement ps;
            ps=con.prepareStatement(query);
            ps.setString(1, imgpath);
            ps.setString(2, ccode);
            ps.executeUpdate();
            
            
            String query2="update allusers set imgpath=? where uid=?";
            PreparedStatement ps2;
            ps2=con.prepareStatement(query2);
            ps2.setString(1, imgpath);
            ps2.setString(2, ccode);
            ps2.executeUpdate();
            
             session.setAttribute("profileimgpath", imgpath);
            return true;
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(UploadProfileImageDao.class.getName()).log(Level.SEVERE, null, ex);
        }
          return false;
    }
}
