/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.bookdao;

import java.sql.Connection;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.*;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import model.FacultyModel;
import model.StudentModel;
import model.bookmodel.BookCommentModel;

/**
 *
 * @author Lenovo
 */
public class BookCommentDao {
   Connection con;
    public boolean  insertComment(BookCommentModel bcm, ServletContext context,HttpSession session) throws SQLException 
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
                            String date1;
       date1 = (DateFormat.getDateInstance().format(new Date()));
       date1=date1.toString();


              Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat (" 'at' hh:mm a");

     // System.out.println("Current Date: " + ft.format(dNow));

String date=ft.format(dNow);
date="on "+date1+date;
        System.out.println("DATE"+dNow);
                String qr="insert into bookcomments values(?,?,?,?,?)";
                        PreparedStatement ps;
                        ps=con.prepareStatement(qr);
                        ps.setString(1,ccode);
                        ps.setInt(2, (int) session.getAttribute("commentbookid"));
                        ps.setString(3,bcm.getComment());
                        ps.setString(4,null);
                        ps.setString(5,date);
                        ps.executeUpdate();
                        
                        flag=true;
 return flag;   
} 
}
