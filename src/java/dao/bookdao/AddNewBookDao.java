/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.bookdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import model.FacultyModel;
import model.StudentModel;
import model.bookmodel.BookAdvisoryModel;

/**
 *
 * @author Lenovo
 */
public class AddNewBookDao {
    Connection con;
    public boolean  insertbook(BookAdvisoryModel bm, ServletContext context,HttpSession session) throws SQLException 
    {
        System.out.println("ADD NEW BOOK DAO");
       con=(Connection) context.getAttribute("datacon");
           boolean flag=false;
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
          
             int subcode=(int) session.getAttribute("subcodesession");
             
              System.out.println("subcde=="+subcode);
              float a=(float) 0;
              String qr="insert into bookdetail values(?,?,?,?,?,?,?,?,?)";
             PreparedStatement ps;
            ps=con.prepareStatement(qr);
            ps.setString(1, ccode);
            ps.setString(2, null);
            ps.setInt(3, subcode);
            ps.setString(4, bm.getBookname());
            ps.setString(5, bm.getBookauthor());
            ps.setInt(6, bm.getBookprice());
            
           ps.setString(7, bm.getBookcover());
            
            ps.setFloat(8, a);
            ps.setString(9, bm.getBookdesc());
            System.out.println(ps);
            ps.executeUpdate();
            flag =true;
           
           return flag;
           
    }      
}
