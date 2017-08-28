/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.questionanswerdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import model.questionanswermodel.UserModel;


/**
 *
 * @author rohan
 */
public class UserDao {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public ArrayList<String> getAllUsers(String input,ServletContext context)
    {
        try {
            ArrayList<String> allUsersList=new ArrayList<>();
            con=(Connection)context.getAttribute("datacon");
            
            String qr="select * from allusers where uname like ?";
            ps=con.prepareStatement(qr);
            ps.setString(1,input.substring(1)+"%");
            rs=ps.executeQuery();
            
            String utype;
            while(rs.next())
            {
                utype=rs.getString(1);
                
                allUsersList.add("@"+rs.getString(2)+" ("+utype+")");
              
            }
            
             
            return allUsersList;
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public void getdetails(String ccode,ServletContext context,HttpSession session)
    {
        int a=0;
        try {
            UserModel um=new UserModel();
            con=(Connection)context.getAttribute("datacon");
            String qr1="select name,email,branch from studentreg where ccode=?";
            PreparedStatement ps1;
            ps1=con.prepareStatement(qr1);
            ps1.setString(1,ccode);
            ResultSet  rs1=ps1.executeQuery();
            
            if(rs1.next())
            {
                String type="Student";
                um.setUid(ccode);
              um.setUname(rs1.getString(1));
              um.setEmail(rs1.getString(2));
              um.setDept(rs1.getString(3));
              um.setUtype(type);
              session.setAttribute("mymodel", um);
              a=1;
            }
            
            if(a==0)
            {
               String qr2="select name,email,dept from facultyreg where ccode=?";
            PreparedStatement ps2;
            ps2=con.prepareStatement(qr2);
            ps2.setString(1,ccode);
            ResultSet  rs2=ps2.executeQuery();
            
            if(rs2.next())
            {
                String type="Faculty";
                um.setUid(ccode);
              um.setUname(rs2.getString(1));
              um.setEmail(rs2.getString(2));
              um.setDept(rs2.getString(3));
              um.setUtype(type);
              session.setAttribute("mymodel", um);
              
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public String getimagepath(String ccode,ServletContext context)
    {
        try {
            con=(Connection)context.getAttribute("datacon");
            String qr1="select imgpath from allusers where uid=?";
            PreparedStatement ps1;
            ps1=con.prepareStatement(qr1);
            ps1.setString(1,ccode);
            ResultSet  rs1=ps1.executeQuery();
            
            if(rs1.next())
            {
                System.out.println(rs1.getString(1));
            return rs1.getString(1);
                    }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
