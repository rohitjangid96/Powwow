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
import model.StudentModel;
import sendmail.SendMailSSL;

/**
 *
 * @author Lenovo
 */
public class RegisterStudentDao {
      Connection con;
    public boolean  insertstudent(StudentModel sm, ServletContext context,HttpSession session)
    {
        
             boolean flag =false;
          try {
             
              
              
              System.out.println("create dao me aagaya");
              con=(Connection) context.getAttribute("datacon");
              String qr1;
              qr1="insert into studentreg values(?,?,?,?,?,?,?,?,?,?,?)";
              
              PreparedStatement ps;
              ps=con.prepareStatement(qr1);
              ps.setString(1,sm.getName() );
              ps.setString(2,sm.getCcode());
              ps.setString(3,sm.getEmail() );
              ps.setString(4,sm.getBranch() );
              ps.setString(5,sm.getSem() );
              ps.setString(6,sm.getSec() );
              ps.setString(7,sm.getPass() );
              ps.setString(8,sm.getSecque() );
              ps.setString(9,sm.getSecans() );
              ps.setInt(10, sm.getStatus());
              ps.setString(11,sm.getOtpval() );
              ps.executeUpdate();
              
              session.setAttribute("id", sm.getCcode());
              
              
              StudentModel smsession=new StudentModel();
                      smsession.setName(sm.getName());
                      smsession.setCcode(sm.getCcode());
                      smsession.setEmail(sm.getEmail());
                      smsession.setBranch(sm.getBranch());
                      smsession.setSem(sm.getSem());
                      smsession.setSec(sm.getSec());
                      smsession.setPass(sm.getPass());
                      
//                      System.out.println(name);
//                      System.out.println(email);
//                      System.out.println(branch);
                      int type=1;
                      String t="student";
                      session.setAttribute("u-type", type);
                      session.setAttribute("utype", t);
                      session.setAttribute("suser", smsession);
                      session.setAttribute("userModel", smsession);
                      session.setAttribute("logeduserccode", sm.getCcode());
              
              
              
              SendMailSSL sml=new SendMailSSL();
              sml.verification(sm.getEmail(), sm.getOtpval());
              flag=true;
              return flag;
             } catch (SQLException ex) {
              Logger.getLogger(RegisterStudentDao.class.getName()).log(Level.SEVERE, null, ex);
             }
            
           return flag; 
    }
}