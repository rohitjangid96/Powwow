<%-- 
    Document   : EditProfile
    Created on : May 2, 2017, 4:06:31 AM
    Author     : Lenovo
--%>

<%@page import="model.FacultyModel"%>
<%@page import="model.StudentModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
        
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css">
         <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"></script>
          <link rel="icon" type="image/png" href="../images/logo.png" />
         
        
        
    </head>
   <%
        int type=(int) session.getAttribute("u-type");
                   String creator_id = null;
                   String uname = null ; String branch=null;
                   String utype2=null;
                   String imgpath=null;
                   String password=null;
                   String sem=null;String sec=null;
                   
                     if(type==1)
                   { 
                  StudentModel user;
                  user=(StudentModel) session.getAttribute("suser");
                  creator_id=user.getCcode();
                  uname=user.getName();
                  branch=user.getBranch();
                  password=user.getPass();
                  sem=user.getSem();
                  sec=user.getSec();
                  
                  utype2="Student";
                  imgpath=(String)session.getAttribute("profileimgpath");
            
                    }else if(type==2)
                    {
                       FacultyModel user;
                       user=(FacultyModel) session.getAttribute("fuser");
                        creator_id=user.getCcode();
                        uname=user.getName();
                        branch=user.getDept();
                        password=user.getPass();
                        utype2="Faculty";
                        imgpath=(String)session.getAttribute("profileimgpath");
                      }
   
   %>
    
    
    
    <body>
        
       
       <div class="ui modal">
 
  <div class="header">
    Edit Profile
  </div>
  <div class="image content">
    <div class="ui medium image">
      <img src="<%="../BookImageLoader?bcover="+imgpath%>" style="width: 200px;height: 200px">
    </div>
    <form action="../UpdateInfo" method="post" >
    <div class="description">
      
        <div class="ui labeled input">
  <div class="ui label">
    Name
  </div>
            <input type="text" name="name" value="<%=uname%>" disabled="">
&nbsp;&nbsp;    
  <div class="ui label">
   Computer Code
  </div>
  <input type="text" name="ccode" value="<%=creator_id%>" disabled="">
</div>
<br><br>

<%if(type==1)
{%>

<div class="ui labeled input">
  <div class="ui label">
    Branch
  </div>
            <input type="text" name="branch" value="<%=branch%>" disabled="">
&nbsp;&nbsp;    
<select id="selsem"  onchange="showSub()"  name="sem"  class="ui selection dropdown" required>
                  <option  disabled selected>SEMESTER</option>
                 <option value="1">I</option>
                 <option value="2">II</option>
                 <option value="3">III</option>
                 <option value="4">IV</option>
                 <option value="5">V</option>
                 <option value="6">VI</option>
                 <option value="7">VII</option>
                 <option value="8">VIII</option>
                     </select>
</div>
<br><br>

<div class="ui labeled input">
  <div class="ui label">
    Section
  </div>
            <input type="text" name="sec" value="<%=sec%>" disabled="">
&nbsp;&nbsp;    
  <div class="ui label">
   Password
  </div>
<input type="password" name="password" placeholder="edit password" required>
</div>
<br><br>





<% }


else
{%>
<div class="ui labeled input">
  <div class="ui label">
    Department
  </div>
            <input type="text" name="department" value="<%=branch%>" disabled="">
&nbsp;&nbsp;    
  <div class="ui label">
   Password
  </div>
  <input type="password" name="passwordf" value="<%=password%>">
</div>

<%}%>
        
      
        
        
        
<input type="submit" id="submitid" style="display: none">
    </div>
    </form>
  </div>
  <div class="actions">
     <a href="../MyProfile" style="text-decoration: none">
    <div class="ui black deny button">
        Nope
    </div></a>
     <button id="b6" onclick="submission()" class="ui  animated blue button"  >
                <span class="visible content">Okay</span>
                <span class="hidden content"><i class="pointing right icon"></i></span>
                </button>
      
  </div>
</div>
    </body>
    
    <script>
        $('.ui.modal').modal('setting', 'closable', false)
  .modal('show')
;

$('#selsem').dropdown();



function submission()
            { 
//                if(document.getElementById('imggg1').value==" ")
//                    document.write("yes");
//                
//                
//                
//                
//               document.write("nooo");
               $('#submitid').click();
            }
    </script>
</html>
