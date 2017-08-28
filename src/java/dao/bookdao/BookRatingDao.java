/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.bookdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import model.FacultyModel;
import model.StudentModel;
import model.bookmodel.BookAdvisoryModel;

/**
 *
 * @author Lenovo
 */
public class BookRatingDao {
    Connection con;
    public float  setrating( int rate,ServletContext context,HttpSession session) 
    {
       
        try {
            con=(Connection) context.getAttribute("datacon");
            
            System.out.println("BOOK RATING DAO");
            
            
            int type=(int) session.getAttribute("u-type");
            String ccode = null;
            if(type==1)
            {
                StudentModel sm;
                sm=(StudentModel) session.getAttribute("suser");
                ccode=sm.getCcode();
                System.out.println("session se ccode value"+sm.getCcode());
                
            }else if(type==2)
            {
                FacultyModel fm;
                fm=(FacultyModel) session.getAttribute("fuser");
                ccode=fm.getCcode();
            }
            
             BookAdvisoryModel bam=(BookAdvisoryModel) session.getAttribute("readmorebook");
            
             int usercount=0;
            float averagebookrating = (float) 0.0;
            String qr2="select count(bookid) from bookratingcount where bookid=?";
            PreparedStatement ps1;
            ps1=con.prepareStatement(qr2);
            ps1.setInt(1,bam.getBookid());
            ResultSet rs= ps1.executeQuery();
            if(rs.next())
            { usercount=rs.getInt(1);
                
            }
             
             
            String qr="insert into bookratingcount values (?,?,?)";
            PreparedStatement ps;
            ps=con.prepareStatement(qr);
            ps.setString(1, ccode);
            ps.setInt(2, bam.getBookid());
            ps.setInt(3, rate);
            ps.executeUpdate();
            
            
            
            String qr3="select bookrating from bookdetail where bookid=?";
            
            ps1=con.prepareStatement(qr3);
            ps1.setInt(1,bam.getBookid());
             ResultSet rs1= ps1.executeQuery();
            if(rs1.next())
            { averagebookrating=rs.getInt(1);
              averagebookrating=((averagebookrating*usercount)+rate)/(usercount+1);
            }
            System.out.println("usercount="+usercount);
            System.out.println("averagebookrating="+averagebookrating);
            
            
            String qr4="update bookdetail set bookrating = ? where bookid=?";
            
            ps1=con.prepareStatement(qr4);
            ps1.setFloat(1,averagebookrating);
            ps1.setInt(2,bam.getBookid());
            ps1.executeUpdate();
            
            return averagebookrating;
           
        } catch (SQLException ex) {
            Logger.getLogger(BookRatingDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }   
}
