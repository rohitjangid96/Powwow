<%-- 
    Document   : linklogin
    Created on : Mar 22, 2017, 4:29:07 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Link Login</title>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css">
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js">
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js">

          <style>
              body{
               /*   background-color: black;*/
                  
                background-image: url("../images/background.jpg");
                  
                background-size: cover;
                
                    background-repeat: no-repeat;
            }
          </style>
    </head>
    <body>
       
       <img src="../images/logo.png" style="width: 400px; height: 270px; position: absolute; left: 500px;">
         <form action="../LinkLoginController" method="post">
        <div  style="position: absolute; left: 500px; top: 280px;">
            <div class="ui huge labeled input">
             <div class="ui huge blue label">
                              E-mail 
             </div>
    
                <input type="email" name="email" placeholder="powwow@powwow.com" style="width: 320px;">
            </div>
            
            <br/><br/>
             <div class="ui huge labeled input">
             <div class="ui huge blue label">
                              Password 
             </div>
    
                   <input type="password" name="pass" placeholder="password" style="width: 289.9px">
            </div>
            
            <br/><br/>
            <div class="ui huge labeled input">
             <div class="ui huge blue label">
                             OTP
             </div>
    
                   <input type="password" name="otpval" placeholder="One Time Password" style="width: 336px">
            </div>
            <input type="submit" value="Login" id="loginsubmit" style="display: none">
              <br/><br/>
              <button class="ui huge  black  button" onclick="sub()" style="position: relative; left: 150px;">Submit</button>

        </div> 
        
         </form>
       
             
<!--            <table align="center" cellpadding="20" cellspacing="15">
                
                
                
                
                
                            
                <tr>
                    <td>E_MAIL</td>
                    <td><input type="text" name="email"></td>
                </tr>

                
               
                <tr>
                    <td>PASSWORD</td>
                    <td><input type="password" name="pass"></td>
                </tr>
                
                 <tr>
                    <td>OTP</td>
                    <td><input type="string" name="otpval"></td>
                </tr>
                
                <tr>
                    <th colspan="5">
                        <input type="submit" value="Login">
                    </th>
                </tr>
                
            </table>-->
        
<script>
    function sub()
    {
//        document.write("ssmiamis");
        $('#loginsubmit').click();
    }
</script>
    </body>
</html>
