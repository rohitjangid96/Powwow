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
import model.questionanswermodel.AllBlogModel;
import model.questionanswermodel.BlogModel;

/**
 *
 * @author rohan
 */
public class BlogDao {
    Connection con;
    PreparedStatement ps;
    String qr;
    ResultSet rs;
    
    public boolean insertBlog(BlogModel bm,ServletContext context)
    {
        try {
            con=(Connection)context.getAttribute("datacon");
            ArrayList<String> dlist=(ArrayList<String>)context.getAttribute("dlist");
            bm.setDname(dlist.get(bm.getDid()-1));
            
            qr="insert into blogs(uid,blogcontent,timestamp,upvote,did,blogtitle) values(?,?,?,?,?,?)";
            ps=con.prepareStatement(qr);
            ps.setString(1,bm.getUid());
            ps.setString(2,bm.getBlogContent());
            ps.setString(3,bm.getTimestamp());
            ps.setInt(4,bm.getUpvotes());
            ps.setInt(5,bm.getDid());
            ps.setString(6,bm.getTitle());
            
            return (ps.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(BlogDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void getMyBlogs(AllBlogModel abm,String id,ServletContext context)
    {
        qr="select blogid,blogs.uid,blogcontent,timestamp,upvote,did,blogtitle,allusers.uname from blogs natural join allusers where uid=? order by blogid desc";
        con=(Connection)context.getAttribute("datacon");
        ArrayList<String>dlist=(ArrayList<String>)context.getAttribute("dlist");
        BlogModel bm;
        ArrayList<BlogModel> albm=new ArrayList<>();
        
        try {
            ps=con.prepareStatement(qr);
            ps.setString(1,id);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
             bm=new BlogModel();
             bm.setBlogId(rs.getInt(1));
             bm.setUid(rs.getString(2));
             bm.setBlogContent(rs.getString(3));
             bm.setTimestamp(rs.getString(4));
             bm.setUpvotes(rs.getInt(5));
             bm.setDid(rs.getInt(6));
             bm.setTitle(rs.getString(7));
             bm.setUname(rs.getString(8));
             bm.setDname(dlist.get(rs.getInt(6)-1));
             
             albm.add(bm);
            }
            abm.setAbm(albm);
        } catch (SQLException ex) {
            Logger.getLogger(BlogDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void updateBlog(BlogModel bm,ServletContext context)
    {
        
        try {
            con=(Connection)context.getAttribute("datacon");
            qr="update blogs set blogcontent=? where blogid=?";
            ps=con.prepareStatement(qr);
            ps.setString(1,bm.getBlogContent());
            ps.setInt(2,bm.getBlogId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BlogDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
