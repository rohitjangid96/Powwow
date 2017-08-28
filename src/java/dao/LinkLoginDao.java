/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import model.FacultyModel;
import model.LoginModel;
import model.StudentModel;

/**
 *
 * @author Lenovo
 */
public class LinkLoginDao {
    Connection con;
    public boolean verifylinklogin(LoginModel lm, ServletContext context ,HttpSession session) throws SQLException
    { 
         
        boolean flag=false;  
        con=(Connection) context.getAttribute("datacon");
            int a=0;
            System.out.println("student");
            PreparedStatement ps1;
            String qr1="select email,pass,otpval,ccode,name,branch,sem,sec from studentreg where email=? and pass=? and otpval=?" ;
            ps1=con.prepareStatement(qr1);
             ps1.setString(1 , lm.getEmail());
            ps1.setString(2 , lm.getPass());
            
             ps1.setString(3 ,lm.getOtpval());
             System.out.println(ps1);
            ResultSet rs = ps1.executeQuery();
            
            
            System.out.println("querrrrrryyyy");
            if(rs.next())
            {
                
                    a=1;
                    
                    PreparedStatement ps;
                    ps=con.prepareStatement("UPDATE studentreg SET status=? where email=?");
                    ps.setInt(1,a );
                    ps.setString(2 , lm.getEmail());
                    ps.executeUpdate();
                    System.out.println(a);
                    System.out.println(lm.getEmail());
                    
                    String query="insert into users values(?,?,?)";
                    String imgpath="D:\\image\\stud.png";
                    PreparedStatement pst;
                    pst=con.prepareStatement(query);
                    pst.setString(1,rs.getString(4));
                     pst.setString(2,rs.getString(5));
                    pst.setString(3, imgpath);
                    pst.executeUpdate();
                    
                    String query2="insert into allusers values(?,?,?)";

                    PreparedStatement pst2;
                    pst2=con.prepareStatement(query2);
                    pst2.setString(1,rs.getString(4));
                     pst2.setString(2,rs.getString(5));
                    pst2.setString(3, imgpath);
                    pst2.executeUpdate();
                    flag=true;
                    
                     session.setAttribute("profileimgpath", imgpath);
                    return flag;
                    
                    
                
                
                 
            }
            
            
            if(a==0)
            {
                System.out.println("faculty");
                   PreparedStatement ps2;
                  String qr2="select email,pass,otpval,ccode,name from facultyreg where email=? and pass=? and otpval=?" ;
                  ps2=con.prepareStatement(qr2);
                  ps2.setString(1 , lm.getEmail());
                  ps2.setString(2 , lm.getPass());
                  ps2.setString(3 , lm.getOtpval());
                  System.out.println(ps2);
                  ResultSet rs2 = ps2.executeQuery(); 
                  System.out.println("facut    querrrrrryyyy");
            if(rs2.next())
            {
          
                a=1;
                    
                    PreparedStatement ps;
                    ps=con.prepareStatement("UPDATE facultyreg SET status=? where email=?");
                    ps.setInt(1,a );
                    ps.setString(2 , lm.getEmail());
                    ps.executeUpdate();
                    System.out.println(a);
                    System.out.println(lm.getEmail());
                    
                    
                    String query="insert into users values(?,?,?)";
                    String imgpath="D:\\image\\fac.png";
                    PreparedStatement pst;
                    pst=con.prepareStatement(query);
                    pst.setString(1,rs2.getString(4));
                     pst.setString(2,rs2.getString(5));
                    pst.setString(3, imgpath);
                    pst.executeUpdate();
                    
                    String query2="insert into allusers values(?,?,?)";
                    
                    PreparedStatement pst2;
                    pst2=con.prepareStatement(query2);
                    pst2.setString(1,rs2.getString(4));
                     pst2.setString(2,rs2.getString(5));
                    pst2.setString(3, imgpath);
                    pst2.executeUpdate();
                   
                    session.setAttribute("profileimgpath", imgpath);
                    
                    flag=true;
                    return flag;
                
                
                 
            }
              
          }
            return flag;
  }
    
    
    
    
    
    
    
    public boolean verifylogin(LoginModel lm, ServletContext context,HttpSession session) throws SQLException
    {
        boolean flag=false;  
        con=(Connection) context.getAttribute("datacon");
            int a=0;
            PreparedStatement ps1;
            String qr1="select * from studentreg where email=? and pass=? and status=1" ;
              ps1=con.prepareStatement(qr1);
            ps1.setString(1 , lm.getEmail());
            ps1.setString(2,lm.getPass() );
            
          
            ResultSet rs = ps1.executeQuery();
            
           if(rs.next())
            {
                a=1;
                  String name=rs.getString(1);
                  String ccode=rs.getString(2);
                  String email=rs.getString(3);
                  String branch=rs.getString(4);
                  String sem=rs.getString(5);
                  String sec=rs.getString(6);
                  String pass=rs.getString(7);
                  
                   StudentModel smsession=new StudentModel();
                      smsession.setName(name);
                      smsession.setCcode(ccode);
                      smsession.setEmail(email);
                      smsession.setBranch(branch);
                      smsession.setSem(sem);
                      smsession.setSec(sec);
                      smsession.setPass(pass);
                      
                      System.out.println(name);
                      System.out.println(email);
                      System.out.println(branch);
                      int type=1;
                      String t="student";
                      session.setAttribute("u-type", type);
                      session.setAttribute("utype", t);
                      session.setAttribute("suser", smsession);
                      session.setAttribute("userModel", smsession);
                      session.setAttribute("logeduserccode", ccode);
                      
                      
                      String query1="select profileimgpath from users where ccode=?";
                      PreparedStatement pst1;
                      pst1=con.prepareStatement(query1);
                      pst1.setString(1, ccode);
                      ResultSet rst1=pst1.executeQuery();
                      if(rst1.next())
                      {
                         session.setAttribute("profileimgpath", rst1.getString(1));
                      }
                      
                    flag=true;
                    return flag;
                } 
        
            if(a==0)
            {
                   PreparedStatement ps2;
                  String qr2="select * from facultyreg where email=? and pass=? and status=1" ;
                  ps2=con.prepareStatement(qr2);
                    ps2.setString(1 , lm.getEmail());
                    ps2.setString(2,lm.getPass() );
            System.out.println(ps2);
                  ResultSet rs2 = ps2.executeQuery();      
            if(rs2.next())
            {
                
                    String name=rs2.getString(1);
                  String ccode=rs2.getString(2);
                  String email=rs2.getString(3);
                  String branch=rs2.getString(4);
                  
                  String pass=rs2.getString(5);
                  
                   FacultyModel fmsession=new FacultyModel();
                      fmsession.setName(name);
                      fmsession.setCcode(ccode);
                      fmsession.setEmail(email);
                      fmsession.setDept(branch);
                      
                      fmsession.setPass(pass);
                      
                      System.out.println(name);
                      System.out.println(email);
                      System.out.println(branch);
                      int type=2;
                      String t="faculty";
                      session.setAttribute("u-type", type);
                      session.setAttribute("utype", t);
                      session.setAttribute("fuser", fmsession);
                      session.setAttribute("userModel", fmsession);
                      session.setAttribute("logeduserccode", ccode);
                      
                      
                       String query1="select profileimgpath from users where ccode=?";
                      PreparedStatement pst1;
                      pst1=con.prepareStatement(query1);
                      pst1.setString(1, ccode);
                      ResultSet rst1=pst1.executeQuery();
                      if(rst1.next())
                      {
                         session.setAttribute("profileimgpath", rst1.getString(1));
                      }
                      
                    flag=true;
                    return flag;
                 
            }
              
          }
            return flag;
  }
    
}