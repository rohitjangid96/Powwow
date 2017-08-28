<%@page import="model.FacultyModel"%>
<%@page import="model.StudentModel"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Bootstrap core CSS     -->
    <link href="css/bootstrap.min.css" rel="stylesheet" />

    <!--  Material Dashboard CSS    -->
    <link href="css/material-dashboard.css" rel="stylesheet"/>

    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="css/demo.css" rel="stylesheet" />

    <!--     Fonts and icons     -->
    <link href="../MDB Free/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons' rel='stylesheet' type='text/css'>
    
    	<script src="js/jquery-3.1.0.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/material.min.js" type="text/javascript"></script>

	<!--  Charts Plugin -->
	<script src="js/chartist.min.js"></script>

	<!--  Notifications Plugin    -->
	<script src="js/bootstrap-notify.js"></script>

	<!-- Material Dashboard javascript methods -->
	<script src="js/material-dashboard.js"></script>
    </head>
    <body> 
<div class="sidebar" data-color="blue" data-image="img/sidebar-1.jpg" style="margin-top: 50px;">
			<!--
		        Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

		        Tip 2: you can also add an image using data-image tag
		    -->
                    <%
                        Integer type=((Integer)session.getAttribute("u-type"));
                   String creator_id = null;
                   String uname = null ; String branch=null;
                   String utype2=null;
                   String imgpath=null;
                     if(type.intValue()==1)
                   { 
                  StudentModel user;
                  user=(StudentModel) session.getAttribute("suser");
                  creator_id=user.getCcode();
                  uname=user.getName();
                  branch=user.getBranch();
                  utype2="Student";
                  imgpath=(String)session.getAttribute("profileimgpath");
            
                    }else if(type.intValue()==2)
                    {
                       FacultyModel user;
                       user=(FacultyModel) session.getAttribute("fuser");
                        creator_id=user.getCcode();
                        uname=user.getName();
                        branch=user.getDept();
                        utype2="Faculty";
                        imgpath=(String)session.getAttribute("profileimgpath");
                      }
                       
                    %>
	    	<div class="sidebar-wrapper">
	            <ul class="nav">
	            <li class="container-fluid">
                        <img src="../images/stud.png" alt="Circle Image" class="img-circle img-responsive" style="padding: 0px 35px;">
	            <div class="content text-center">
					<h6 class="category text-gray"><%=utype2%> / <%=branch%> </h6>
                                        <h4 class="card-title" style="font-size: 20px;font-weight: bold"><%=uname.toUpperCase() %></h4>
    			</div>
                        
                        <br/><br/><br/>
	            </li>
                    <li id="link1"  onclick="li1()" >
                        <a href="../MyFeed">
                                <i class="material-icons" >Q/A </i>
	                        <p>Question/Answer</p>
	                    </a>
	                </li>
	                <li  id="link2">
                            <a href="../poll/pollhome.jsp">
	                        <i class="material-icons" onclick="li2()">list</i>
	                        <p>Polling</p>
	                    </a>
	                </li>
	                <li id="link3">
                            <a href="../book advisory/bookhome.jsp">
	                        <i class="material-icons" onclick="li3()">book</i>
	                        <p>Book Advisory</p>
	                    </a>
	                </li>
	               
	            </ul>
	    	</div>
	    </div>
                        
                        
                        
                        <script>
                            var p;
                            function li1(){
                                
                                document.getElementById("link1").setAttribute("class","active");
                            }
                        </script>
         </body>
</html>