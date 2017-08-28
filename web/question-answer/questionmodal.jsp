<%-- 
    Document   : questionmodal
    Created on : Apr 29, 2017, 1:19:54 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css">
          <link rel="icon" type="image/png" href="../images/logo.png" />
         <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"></script>
         
         
         <script>
   



      var request;
      var domain;
      function domainselect(){
         
       domain=$('.ui.scrolling.dropdown').dropdown('get value');
      
       
       request=new XMLHttpRequest();
       request.onreadystatechange=getkey;
       request.open("get", "../GetKeyword?did="+domain, true);
       request.send(null);
      }
      function getkey(){
        // if(request.readystate==4 && request.status==200){
            if(request.status==200 && request.readyState==4)
             document.getElementById("keywordhere").innerHTML=request.responseText;
         //}
      }
  
        </script>
    </head>
    <body>
       <div class="ui large modal">
  
  <div class="header">
    ASK QUESTION
    
    
    
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     
  
<span>
  Select Question Domain Field &nbsp;&nbsp;&nbsp;
  <div class="ui inline scrolling dropdown" onchange="domainselect()" >
      <input type="hidden" name="do">
    <div class="text">
     
        <b style="color: red">  ?</b>
    </div>
    <i class="dropdown icon"></i>
    <div class="menu" >
      <div class="item" data-value="1">
          <img class="ui avatar image" src="workspacesimages/ComputerScience(1).png">
        Computer Science
      </div>
      <div class="item" data-value="2">
          <img class="ui avatar image" src="workspacesimages/mechanical.png">
        Mechanical
      </div>
      <div class="item" data-value="3">
          <img class="ui avatar image" src="workspacesimages/it.png">
        Information Technology
      </div>
        <div class="item" data-value="4">
            <img class="ui avatar image" src="workspacesimages/electriccc.png">
        Electrical
      </div>
        <div class="item" data-value="5">
            <img class="ui avatar image" src="workspacesimages/electical.png">
        Electronics
      </div>
       <div class="item" data-value="6">
           <img class="ui avatar image" src="workspacesimages/fire-icon.jpg">
        Fire technology
      </div>
        <div class="item" data-value="7">
            <img class="ui avatar image" src="workspacesimages/chemical.png">
        Chemical
      </div>
        <div class="item" data-value="8">
            <img class="ui avatar image" src="workspacesimages/civil.png">
       Civil
      </div>
        <div class="item" data-value="9">
            <img class="ui avatar image" src="workspacesimages/library2.jpg">
        Library
      </div>
        <div class="item" data-value="10">
            <img class="ui avatar image" src="workspacesimages/sports2.png">
        Sports
      </div>
        <div class="item" data-value="11">
            <img class="ui avatar image" src="workspacesimages/placement.png">
        Placement Cell
      </div>
        <div class="item" data-value="12">
            <img class="ui avatar image" src="workspacesimages/accounts2.png">
        Accounts
      </div>
        <div class="item" data-value="13">
            <img class="ui avatar image" src="workspacesimages/admission.png">
        Admission Cell
      </div>
        <div class="item" data-value="14">
            <img class="ui avatar image" src="workspacesimages/scholarship2.png">
        Scholarship
      </div>
        <div class="item" data-value="16">
            <img class="ui avatar image" src="workspacesimages/college fest.jpg">
        Swaranjali
      </div>
        <div class="item" data-value="17">
            <img class="ui avatar image" src="workspacesimages/hostel2.png">
        Hostel
      </div>
        <div class="item" data-value="18">
            <img class="ui avatar image" src="workspacesimages/transportation2.jpg">
        Transportation
      </div>
        <div class="item" data-value="19">
            <img class="ui avatar image" src="workspacesimages/college fest.jpg">
        Umang Club
      </div>
        <div class="item" data-value="20">
            <img class="ui avatar image" src="workspacesimages/canteen2.jpg">
        Canteen
      </div>
        <div class="item" data-value="21">
            <img class="ui avatar image" src="../images/logo.png">
        Powwow
      </div>
        <div class="item" data-value="22">
            <img class="ui avatar image" src="workspacesimages/download.jpg">
       Others
      </div>
    </div>
  </div>
</span>
   </div>
           
           
           
           
    <div class="description">
   
    <br/><br/>
				<div class="ui labeled huge input">
                           <div class="ui huge label">
                               Question 
                                </div>
                                    <textarea type="text" id="fakeque" placeholder="Write you problem here...." style="width: 900px; height: 70px      "></textarea>
                                </div>      
      
          <br/><br/>
      
       <div class="ui huge label">
          
                               ADD TAGS
       </div>
      
       <div class="ui multiple dropdown">
  <input type="hidden" name="filters">
  <i class="plus icon"></i>
  <span class="text">ADD</span>
  <div class="menu">
    <div class="ui icon search input">
      <i class="search icon"></i>
      <input type="text" placeholder="Search tags...">
    </div>
    <div class="divider"></div>
    <div class="header">
      <i class="tags icon"></i>
      Tag Label
    </div>
    <div class="scrolling menu" id="keywordhere">
      
    </div>
  </div>
</div>
 </div>
           
           
   <br/>        
  <div class="actions">
      
       <a href="../MyFeed" style="text-decoration: none">
    <div class="ui black deny button">
        Nope
    </div></a>
       <button id="b6" onclick="submission()" class="ui  animated blue button"  >
                <span class="visible content">SAVE QUESTION</span>
                <span class="hidden content"><i class="pointing right icon"></i></span>
                </button>
<!--      <div class="ui positive right labeled icon button" >
      Proceed
      <i class="checkmark icon"></i>
    </div>-->
  </div>
</div>
        
        
        <form action="../PostQuestion" method="post" style="display: none">
    <input type="text" name="domain" id="domainid">
    <input type="text" name="askedquestion" id="askedquestionid">
    <input type="text" name="tags" id="tagsid">
    <input type="submit" id="submitid">
</form>
           
        
        
        <script>
           $('.ui.modal').modal('setting', 'closable', false).modal('show');
           $('.ui.dropdown')
  .dropdown()
;  
$('.ui.multiple.dropdown')
  .dropdown()
;  

var btn2 = document.getElementById("b6");

btn2.onclick= function (){
  
    var x= $('.ui.multiple.dropdown').dropdown('get value');
    
       
        var y=document.getElementById("fakeque").value;
         var z=$('.ui.scrolling.dropdown').dropdown('get value'); 
        document.getElementById("askedquestionid").value=y;
        document.getElementById("domainid").value=z;
        
        document.getElementById("tagsid").value=x;
          
         
        $('#submitid').click();
    
}
        </script>
    </body>
</html>
