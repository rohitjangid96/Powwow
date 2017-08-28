/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.questionanswerdao;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import model.questionanswermodel.KeywordModel;

/**
 *
 * @author Lenovo
 */
public class KeywordDao {
    Connection con;
    public ArrayList<KeywordModel> getkeyworddomain(KeywordModel km,ServletContext context)
    {
       
        try {
            con=(Connection)context.getAttribute("datacon");
            String qr="select kid,kname from keyword where did=?";    
            PreparedStatement ps;
            ps=con.prepareStatement(qr);
            ps.setInt(1, km.getDid());
            ResultSet rs=ps.executeQuery();
            
            ArrayList<KeywordModel> kam=new ArrayList<>();
            while(rs.next())
            {
               int kid=rs.getInt(1);
               String kname=rs.getString(2);
               
               km=new KeywordModel();
               km.setKid(kid);
               km.setKname(kname);
               
               kam.add(km);
               
            }
            return kam;
        } catch (SQLException ex) {
            Logger.getLogger(KeywordDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    
    
       return null;
    }  


 public boolean insertuserkeyword(ArrayList<Integer> kal,ServletContext context,HttpSession session)
    {

           for(int i: kal)
           {
               try {
                   System.out.println(i);
                   String query="insert into userkeyword values(?,?)";
                   PreparedStatement ps;
                   con=(Connection)context.getAttribute("datacon");
                   ps=con.prepareStatement(query);
                   ps.setString(2,(String)session.getAttribute("id"));
                   ps.setInt(1, i);
                   ps.executeUpdate();
                   return true;
               } catch (SQLException ex) {
                   Logger.getLogger(KeywordDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        return false;
    }
}
