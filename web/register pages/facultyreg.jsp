
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FACULTY REGISTRATION</title>
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css">
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js">
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js">

        <style>
            p{
                font-size: 24px;
                
                color: black;
                
            }
            body{
               /*   background-color: black;*/
                  
                background-image: url("../images/background.jpg");
                   
                background-size: cover;
              
                    background-repeat: no-repeat;
            }
            input[type]{
                background: black;
                /* width: 50%;*/
                width: 230px;
                 height: 40px;
                 padding: 10px;
                 font-size: 36px;
               /* border: chartreuse*/
                border: 2px dashed #D1C7AC;
	          padding-right: 50px;
                box-shadow: inset 1px 1px 2px 0 #707070;
              transition: box-shadow 0.9s, border 0.9s;
            }
           .select1{
                width: 50%; 
             /*  align-content: center;
               align-items: center;*/
                 font-size: 24px; 
                 padding: 1px;
              /*  border: solid 1px red;*/
                margin: auto;
/*                box-shadow: inset 1px 1px 2px 0 #707070;*/
              /*transition: box-shadow 0.3s, border 0.3s;*/
            }
            
            button{
                
                
            }
            
            .qwe1{
                background-color: skyblue;
                width: 100px;
                height: 50px;
                
                box-shadow: inset 0 0 0 1px;
               
                
                
                
            }
            .box{
                 
                /*position:absolute;*/
                 height:100%;
                 width:100%;
                 font-family:Helvetica;
                 color:#fff;
                 background:rgba(0,0,0,0.3);
                /* background-color: gray;*/
                backface-visibility: hidden;
/*                 background-color: #A9D0F5;*/
                 padding:30px 0px;
            }
            
            .box input{
  display:block;
  width:300px;
  margin:20px auto;
  padding:15px;
  background:rgba(0,0,0,0.2);
  color:#fff;
  border:0;
}
            
        </style>
           
    </head>
    <body >
        
     <div align="center" class="select1" >
          <div class="ui container" >
            
<!--              <h1  style="font-size: 48px" ><b>POWWOW</b></h1>-->
<img src="../images/logo.png" style="width: 350px; height: 220px; ">
        <div id="d0" > 
        
<!--                
            <button id="i1" onclick="f1()"  value="Show Div" style="width: 350px" class="massive ui button" style="height:50px" style="align:center " style="color:#A9D0F5">want to register</button>
            -->
            </div>
        <div id="box1" class="box" style="display:block">
        
            
        
  
        
        <div id="d1" style="display: block">
            <br/><br/><br/>
            <p style="font-size: 40px; color: white">What's Your First Name ?<font style="color: red">*</font></p>
            <input type="text" name="abc1" id="l1" onkeydown="if (event.keyCode === 13)
                document.getElementById('b1').click()" autofocus="autofocus" required >
            
            <button id="b1" onclick="z1()"  class="ui animated blue button" value="Show Div" >
                <span class="visible content">OK</span>
                <span class="hidden content"><i class="right arrow icon"></i></span>
           </button>
            <p id="wrong1" style="color: red"></p>
                    
        </div>
        
        <div id="d2" style="display: none">
            <br/><br/>
            <p style="font-size: 40px; color: white"> Hey! <u><b  style="color: red" id="p1"></b></u> <i class="smile icon"></i> nice to meet you. What's your last name ?<font style="color: red">*</font></p>
            <input type="text" name="abc2" id="l2" onkeydown="if (event.keyCode === 13)
                        document.getElementById('b2').click()">
            <p id="wrong2" style="color: red"></p>
            <button id="b2" onclick="z2()" class="ui animated blue button" value="Show Div" >
                <span class="visible content">OK</span>
                <span class="hidden content"><i class="right arrow icon"></i></span>
           </button>
         </div>
      
        
        <div id="d3" style="display: none">
            <br/><br/>
            <p style="font-size: 40px; color: white"> Hey! <u><b id="p2" style="color: red"> </b></u> What's your Computer Code? <font style="color: red">*</font></p>
            <input type="text" name="abc3" id="l3" onkeydown="if (event.keyCode === 13)
                        document.getElementById('b3').click()">
            <p id="wrong1"></p>
             <button id="b3" onclick="z3()" class="ui animated blue button" value="Show Div" >
                <span class="visible content">OK</span>
                <span class="hidden content"><i class="right arrow icon"></i></span>
           </button>
         </div>
        
        
        
        <div id="d4" style="display: none">
            <br/><br/>
            <p style="font-size: 40px; color: white">hey! <u><b id="p3" style="color: red"> </b></u> Which E-mail address shall we use?<font style="color: red">*</font></p>
                   <input type="email" name="abc4" id="l4" onkeydown="if (event.keyCode === 13)
                        document.getElementById('b4').click()">
                   <p id="wrong4" style="color: red"></p>
             <button id="b4" onclick="z4()" class="ui animated blue button" value="Show Div" >
                <span class="visible content">OK</span>
                <span class="hidden content"><i class="right arrow icon"></i></span>
           </button>
         </div>
        
        
        <div id="d5" style="display: none" >
            <br/><br/>
            <p style="font-size: 40px; color: white"> <u><b id="p4" style="color: red"> </b></u> What's your Branch</p>
                 <!--User-Type<input type="radio" name="ty" value="1" checked required id="l4">user<br>
                        <input type="radio" name="ty" value="2" required id="l4">editor
                   -->
                     <select name="ty1" id="l5" onkeydown="if (event.keyCode === 13)
                        document.getElementById('b5').click()" class="ui selection dropdown">
                 <option value="Computer Science">COMPUTER SCIENCE</option>
                 <option value="Electronis Communication">ElECTRONICS COMMUNICATION</option>
                 <option value="Civil">CIVIL</option>
                 <option value="Mechanical">MECHANICAL</option>
                 <option value="Fire Technology">FIRE TECHNOLOGY</option>
                 <option value="Chemical">CHEMICAL</option>
                 <option value="Electrical And Electronics">ElECTRICAL AND ELECTRONICS</option>
                 <option value="Accounts">ACCOUNTS</option>
                 <option value="Transport">TRANSPORT</option>
                 <option value="Training and Placement">TRAINING AND PLACEMENT</option>
                 <option value="Library">LIBRARY</option>
                     </select>
                     <button id="b5" onclick="z5()" class="ui animated blue button" value="Show Div" >
                <span class="visible content">OK</span>
                <span class="hidden content"><i class="right arrow icon"></i></span>
           </button>
         </div>
        
        <div id="d6" style="display: none" >
            <br/><br/>
            <p style="font-size: 40px; color: white"> <u><b id="p5" style="color: red"> </b></u> Please select Semester</p>
                 <!--User-Type<input type="radio" name="ty" value="1" checked required id="l4">user<br>
                        <input type="radio" name="ty" value="2" required id="l4">editor
                   -->
                     <select name="ty2" id="l6" onkeydown="if (event.keyCode === 13)
                         document.getElementById('b6').click()" class="ui selection dropdown">
                 <option value="1">I</option>
                 <option value="2">II</option>
                 <option value="3">III</option>
                 <option value="4">IV</option>
                 <option value="5">V</option>
                 <option value="6">VI</option>
                 <option value="7">VII</option>
                 <option value="8">VIII</option>
                     </select>
                     <button id="b6" onclick="z6()" class="ui animated blue button" value="Show Div" >
                <span class="visible content">OK</span>
                <span class="hidden content"><i class="right arrow icon"></i></span>
           </button>
         </div>
        
        
        <div id="d7" style="display: none" >
            <br/><br/>
            <p style="font-size: 40px; color: white"> <u><b id="p6" style="color: red"> </b></u> Please select Section</p>
                 
                     <select name="ty3" id="l7" onkeydown="if (event.keyCode === 13)
                        document.getElementById('b7').click()" class="ui selection dropdown">
                 <option value="1">1</option>
                 <option value="2">2</option>
                 <option value="3">3</option>
                 
                     </select>
                     <button id="b7" onclick="z7()" class="ui animated blue button" value="Show Div" >
                <span class="visible content">OK</span>
                <span class="hidden content"><i class="right arrow icon"></i></span>
           </button>
         </div>
        
        <div id="d8" style="display: none" onkeydown="if (event.keyCode === 13)
                        document.getElementById('b8').click()">
            <br/><br/>
            <p style="font-size: 40px; color: white"> <u><b id="p7" style="color: red"> </b></u> Enter your Password <font style="color: red">*</font></i></p>
            <input type="password" name="pas" id="l8">
                  <button id="b8" onclick="z8()" class="ui animated blue button" value="Show Div" >
                <span class="visible content">OK</span>
                <span class="hidden content"><i class="right arrow icon"></i></span>
           </button>
         </div>
        
        <div id="d9" style="display: none" onkeydown="if (event.keyCode === 13)
                        document.getElementById('b9').click()">
            <br/><br/>
            <p style="font-size: 40px; color: white"> <u><b id="p8" style="color: red"> </b></u> Retype your Password <font style="color: red">*</font></i></p>
            <input type="password" name="repa" id="l9">
            <p id="wrong9" style="color: red"></p>
                  <button id="b9" onclick="z9()" class="ui animated blue button" value="Show Div" >
                <span class="visible content">OK</span>
                <span class="hidden content"><i class="right arrow icon"></i></span>
           </button>
         </div>
        
        <div id="d10" style="display: none" onkeydown="if (event.keyCode === 13)
                        document.getElementById('b10').click()">
            <br/><br/>
            <p style="font-size: 40px; color: white"> <u><b id="p9" style="color: red"> </b></u> Set Security Question And Answer <font style="color: red">*</font></i></p>
            <select name="ty1" id="l10"  class="ui selection dropdown">
                 <option value="What's your Mother tongue ?">What's your Mother tongue ?</option>
                 <option value="What's your pet's name ?">What's your pet's name ?</option>
                 <option value="What's your favourite movie?">What's your favourite movie?</option>
                 <option value="Who was your first teacher ?">Who was your first teacher ?</option>
                 <option value="What's your best friend last name?">What's your best friend last name?</option>
                
                     </select>
            
            <input type="text" name="secque" id="l11">
            
            <p id="wrong9" style="color: red"></p>
                  <button id="b10" onclick="z10()" class="ui animated blue button" value="Show Div" >
                <span class="visible content">OK</span>
                <span class="hidden content"><i class="right arrow icon"></i></span>
           </button>
         </div>
        

        
        
        
        
         <form action="../FacultyRegisterController" method="post">
                  
        <div id="notshow1" style="display: none">
              NAME<input type="text" name="name" id="t1"><br/>
            
             ID<input type="text" name="ccode" id="t3">
             E-mail<input type="email" name="email" id="t4">
             dept<input type="text" name="dept" id="t5">
             
               password <input type="password" name="pass" id="t8">
               Secque <input type="text" name="secque" id="t10">
               secans <input type="text" name="secans" id="t11">
               
         
        </div>
                     
                      
                     
                     
                  
        
        <div id="d11" style="display: none">
          <br/><br/>
          <input type="submit" value="REGISTER" required style="height: 100px" >
            
           </div> 
                 </form>
        </div>
        </div> 
        </div>  
        
           <script>
              
               $('#l5').dropdown();
                function f1()
               {
                  
                   document.getElementById("d1").style.display="block";
                   document.getElementById("d0").style.display="none";
                    document.getElementById("box1").style.display="block";
              
               }
            
              
                 var input;
               function z1()
               {
                    input = document.getElementById("l1").value;
                    
                   if(/^[A-Za-z ]+$/.test(input))
                   {
                 //  document.getElementById("t1").value=input;
                   document.getElementById("p1").innerHTML=input;
                   document.getElementById("d2").style.display="block";
                   document.getElementById("d1").style.display="none";

                       document.getElementById("l2").focus();
                       document.getElementById("l2").select();
                   }else if(input.length<2)
                            document.getElementById("wrong1").innerHTML="Enter First Name";
                   else
                            document.getElementById("wrong1").innerHTML="No. not allowed";
                    
               }
               
               function z2()
               {
                   document.getElementById("p2").innerHTML=input;
                   var inp1 = document.getElementById("l2").value;
                   if(/^[A-Za-z ]+$/.test(inp1))
                   {
                   document.getElementById("t1").value=input+" "+inp1;
                    document.getElementById("d3").style.display="block";
                    document.getElementById("d2").style.display="none";
                     document.getElementById("l3").focus();
                       document.getElementById("l3").select(); 
                   }else if(inp1.length<2)
                            document.getElementById("wrong2").innerHTML="Enter Last Name";
                   else
                            document.getElementById("wrong2").innerHTML="No. not allowed";
                      
               }
               
               function z3()
               {
                   document.getElementById("p3").innerHTML=input;
                   var inp2 = document.getElementById("l3").value;
                   if(inp2.length>1)
                   {
                   document.getElementById("t3").value=inp2;
                    document.getElementById("d4").style.display="block";
                    document.getElementById("d3").style.display="none";
                        document.getElementById("l4").focus();
                       document.getElementById("l4").select();
                   }
               }
               
               function z4()
               {
                    document.getElementById("p4").innerHTML=input;
                   var inp3 = document.getElementById("l4").value;
                   if(/\S+@\S+\.\S+/.test(inp3))
                   {
                   document.getElementById("t4").value=inp3;
                    document.getElementById("d5").style.display="block";
                    document.getElementById("d4").style.display="none";
                     document.getElementById("l5").focus();
                       document.getElementById("l5").select();
                   }
                   else
                   {
                       document.getElementById("wrong4").innerHTML="E-mail Not Valid";
                   }
               }
               
               function z5()
               {   
                   document.getElementById("p5").innerHTML=input;
                   var inp4 = document.getElementById("l5").value;
                   if(inp4.length>=1)
                   {
                   document.getElementById("t5").value=inp4;
                    document.getElementById("d8").style.display="block";
                    document.getElementById("d5").style.display="none";
                    document.getElementById("l8").focus();
                       document.getElementById("l8").select();
                } 

               }
               
               
               
               function z6()
               {
                    document.getElementById("p6").innerHTML=input;
                   var inp5 = document.getElementById("l6").value;
                   
                   document.getElementById("t6").value=inp5;
                    document.getElementById("d7").style.display="block";
                    document.getElementById("d6").style.display="none";
                     document.getElementById("l7").focus();
                       document.getElementById("l7").select();
                  
               }
               
               function z7()
               {
                    document.getElementById("p7").innerHTML=input;
                   var inp6 = document.getElementById("l7").value;
                   if(inp6.length>=1)
                   {
                   document.getElementById("t7").value=inp6;
                    document.getElementById("d8").style.display="block";
                    document.getElementById("d7").style.display="none";
                     document.getElementById("l8").focus();
                       document.getElementById("l8").select();
                   }
               }
               var inp7;
               function z8()
               {
                    inp7 = document.getElementById("l8").value;
                   if(inp7.length>1)
                   {
                   document.getElementById("t8").value=inp7;
                    document.getElementById("d9").style.display="block";
                    document.getElementById("d8").style.display="none";
                    document.getElementById("l9").focus();
                       document.getElementById("l9").select();
                   }else
                            document.getElementById("wrong2").innerHTML="enter password";
                } 
                
               function z9()
               {
                   var inp8 = document.getElementById("l9").value;
                  if(inp7===inp8)
                  {
                  // document.getElementById("t9").value=inp8;
                    document.getElementById("d10").style.display="block";
                    document.getElementById("d9").style.display="none";
                    document.getElementById("l10").focus();
                       document.getElementById("l10").select();
                  }
                  else{
                       document.getElementById("wrong9").innerHTML="Password not match";
                      
                  }

               }
               
               function z10()
               {
                   var inp9 = document.getElementById("l10").value;
                   var inp10 = document.getElementById("l11").value;
                   if(inp10.length>1)
                   {
                   document.getElementById("t10").value=inp9;
                    document.getElementById("t11").value=inp10;
                  
                    document.getElementById("d11").style.display="block";
                    document.getElementById("d10").style.display="none";
                    
                   }else
                            document.getElementById("wrong2").innerHTML="enter answer";
                } 
               
           </script>
    </body>
</html>