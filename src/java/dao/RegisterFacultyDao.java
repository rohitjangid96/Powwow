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
import sendmail.SendMailSSL;

/**
 *
 * @author Lenovo
 */
public class RegisterFacultyDao {
Connection con;
    public boolean  insertfaculty(FacultyModel fm, ServletContext context,HttpSession session)
    {
        boolean flag =false;
    try {
        
        
        
        
        System.out.println("create dao me aagaya");
        con=(Connection) context.getAttribute("datacon");
        String qr1;
        qr1="insert into facultyreg values(?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement ps;
        ps=con.prepareStatement(qr1);
        ps.setString(1,fm.getName() );
        ps.setString(2,fm.getCcode());
        ps.setString(3,fm.getEmail() );
        ps.setString(4,fm.getDept());
        
        ps.setString(5,fm.getPass() );
        ps.setString(6,fm.getSecque() );
        ps.setString(7,fm.getSecans() );
        ps.setInt(8, fm.getStatus());
        ps.setString(9,fm.getOtpval() );
        ps.executeUpdate();
        
        
         FacultyModel fmsession=new FacultyModel();
                      fmsession.setName(fm.getName());
                      fmsession.setCcode(fm.getCcode());
                      fmsession.setEmail(fm.getEmail());
                      fmsession.setDept(fm.getDept());
                      
                      fmsession.setPass(fm.getPass());
                      
//                      System.out.println(name);
//                      System.out.println(email);
//                      System.out.println(branch);
                      int type=2;
                      String t="faculty";
                      session.setAttribute("u-type", type);
                      session.setAttribute("utype", t);
                      session.setAttribute("fuser", fmsession);
                      session.setAttribute("userModel", fmsession);
                      session.setAttribute("logeduserccode", fm.getCcode());
        
        session.setAttribute("id", fm.getCcode());
        SendMailSSL fml=new SendMailSSL();
        fml.verification(fm.getEmail(), fm.getOtpval());
        flag=true;
        return flag;
        
        
    } catch (SQLException ex) {
        Logger.getLogger(RegisterFacultyDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return flag;
}
}
