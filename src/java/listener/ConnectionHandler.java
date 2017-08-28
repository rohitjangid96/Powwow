/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import dbinit.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author Lenovo
 */
public class ConnectionHandler implements ServletContextListener {

    Connection con; 
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            //To change body of generated methods, choose Tools | Templates.

            
            System.out.println("handler---> dbinit jara");
            con=DbConnection.getDbConnection();
            System.out.println("dbinit se wapas handler me");
            ServletContext context=sce.getServletContext(); 
            
            System.out.println("Connection handler me he abhi");
            
            context.setAttribute("datacon",con);
            
            ignoreWordList(sce);
        allDomains(sce);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
     public void ignoreWordList(ServletContextEvent sce)
    {
    HashSet<String> il=new HashSet();
    String arr[]={  "what",
                    "where",
                    "when",
                    "whom",
                    "who",
                    "whose",
                    "in",
                    "is",
                    "am",
                    "are",
                    "has",
                    "have",
                    "will",
                    "shall",
                    "was",
                    "were",
                    "had",
                    "how",
                    "can",
                    "i",
                    "you",
                    "we",
                    "me"};
    for(String i : arr)
    {
        il.add(i);
    }
    sce.getServletContext().setAttribute("ignorelist",il);
    }
    
    
    
     
      public void allDomains(ServletContextEvent sce)
    {
        try {
            ArrayList<String> dlist=new ArrayList();
            PreparedStatement ps;
            String qr="select dname from domain";
            ps=con.prepareStatement(qr);
            ResultSet rs;
            rs=ps.executeQuery();
            while(rs.next())
            {
            dlist.add(rs.getString(1));
            }
            sce.getServletContext().setAttribute("dlist", dlist);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
     
     

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
