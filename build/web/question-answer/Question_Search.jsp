<%@page import="model.questionanswermodel.RelatedQuestionModel"%>
<%@page import="model.questionanswermodel.QuestionModel"%>
<%@page import="model.FacultyModel"%>
<%@page import="model.StudentModel"%>
<%
RelatedQuestionModel rlqm=(RelatedQuestionModel)session.getAttribute("relques");

%>
<!doctype html>
<html lang="en">
<head>
       <script src="js/jquery-1.10.2.js"></script>
        <script src="js/jquery-ui.js"></script>
        <script src="js/autocompleter.js"></script>
        <link rel="stylesheet" href="js/jquery-ui.css">
	<meta charset="utf-8" />
        <link rel="apple-touch-icon" sizes="76x76" href="img/apple-icon.png" />
	 <link rel="icon" type="image/png" href="../images/logo.png" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Question Search</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />
<!-- Font Awesome -->
    <link rel="stylesheet" href="MDB Free/font-awesome-4.7.0/css/font-awesome.min.css">

  
    <!-- Bootstrap core CSS     -->
    <link href="new css js/dashboard/css/bootstrap.min.css" rel="stylesheet" />

    <!--  Material Dashboard CSS    -->
    <link href="new css js/dashboard/css/material-dashboard.css" rel="stylesheet"/>

    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="new css js/dashboard/css/demo.css" rel="stylesheet" />
    
    <script src="https://cdn.quilljs.com/1.2.3/quill.js"></script>
     <script src="https://cdn.quilljs.com/1.2.3/quill.min.js"></script>
<!--     <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>-->
     <link href="https://cdn.quilljs.com/1.1.3/quill.snow.css" rel="stylesheet">
     <link href="https://cdn.quilljs.com/1.1.3/quill.bubble.css" rel="stylesheet">
	
    
    <!--     Fonts and icons     -->
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons' rel='stylesheet' type='text/css'>
    <style type="text/css">
    	
        .limittext {
    white-space: nowrap; 
    width: 100%; 
    overflow: hidden;
    text-overflow: ellipsis; 

/*    a:hover{
        text-decoration: underline;
    }*/
    </style>
</head>

<body>
<div id="toolbarque" style="display: none"></div>
<div id="editorque" style="display: none"></div>
         
         <script>
            
            var configque = {
                "theme": "snow",
                "modules": {
                "toolbar": false
  }
  
};
            var config = {
                "theme": "snow",
                "modules": {
                "toolbar": false
  }
               
};
             var quillque;
            quillque=new Quill('#editorque',configque);
            console.log("quillque"+quillque);            
        
        </script>
            
<nav class="navbar navbar-fixed-top navbar-info" role="navigation">
	<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">Powwow</a>

					</div>
					<div class="collapse navbar-collapse">
						<ul class="nav navbar-nav">
							<li class="active"><a href="../MyFeed">Home</a></li>
			        		<li><a href="../MyProfile">profile</a></li>
                                                <li><a href="questionmodal.jsp">ask a question</a></li>
                                                <li><a href="../about us/aboutus.jsp">About Us</a></li>
				    		</ul>
						<ul class="nav navbar-nav navbar-right">
							
							
							<li class="dropdown">
			        			<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="material-icons">person</i></a>
			        			<ul class="dropdown-menu">
								  <li><a href="#">Action</a></li>
								  <li><a href="#">Another action</a></li>
								  <li><a href="#">Something else here</a></li>
								  <li class="divider"></li>
								  <li><a href="#">Separated link</a></li>
								  <li class="divider"></li>
							      <li><a href="#">One more separated link</a></li>
			        			</ul>
			        		</li>
										
						</ul>

                                            <form action="../AskQuestion" class="navbar-form navbar-right" role="search">
							<div class="form-group  is-empty">
                                                            <input type="text" id="search" name="search" class="form-control searchs" style="width:400px" placeholder="Search">
								<span class="material-input"></span>
							</div>
							<button type="submit" class="btn btn-white btn-round btn-just-icon">
								<i class="material-icons">search</i><div class="ripple-container"></div>
							</button>
						</form>
					</div>
				</div>
			</nav>
<!--	<div class="wrapper">-->

	
			<!--
		        Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

		        Tip 2: you can also add an image using data-image tag
		    -->

	    <div class="sidebar" data-color="blue" data-image="img/sidebar-1.jpg" style="margin-top: 50px;">
			<!--
		        Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

		        Tip 2: you can also add an image using data-image tag
		    -->
                    <%
                        int type=(int) session.getAttribute("u-type");
                   String creator_id = null;
                   String uname = null ; String branch=null;
                   String utype2=null;
                   String imgpath=null;
                     if(type==1)
                   { 
                  StudentModel user;
                  user=(StudentModel) session.getAttribute("suser");
                  creator_id=user.getCcode();
                  uname=user.getName();
                  branch=user.getBranch();
                  utype2="Student";
                  imgpath=(String)session.getAttribute("profileimgpath");
            
                    }else if(type==2)
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
	            	<img src="<%="../BookImageLoader?bcover="+imgpath%>" alt="Circle Image" class="img-circle img-responsive" style="padding: 0px 35px;">
	            <div class="content text-center">
					<h6 class="category text-gray"><%=utype2%> / <%=branch%> </h6>
                                        <h4 class="card-title" style="font-size: 20px;font-weight: bold"><%=uname%></h4>
    			</div>
                        
                        <br/><br/><br/>
	            </li>
                    <li id="link1"  onclick="li1()" >
                        <a href="../question-answer/questionsearch.jsp">
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
                   

	    <div class="main-panel">

			<div class="content" style="padding-top: 50px;margin-top: 20px;">
				<div class="container-fluid">
					<div class="row">
					<div class="col-md-9">
					
				<!--card-1-->		
          
        		    		<!--card-1-->	
                 <%if(rlqm!=null){int i=0;for(QuestionModel qm: rlqm.getRelatedque()){%>
                <div class="card animated fadeInDown">
                    <div class="card-content">
	                    <div class="category"><a href="../GoToUserProfile?id=<%= qm.getUid() %>" style="color: #0099cc;"> <%= qm.getUname() %></a> asked in 
	                    	<label class="label label-info"><a href="../WorkSpaceContent?did=<%= qm.getDomain() %>&dname=<%= qm.getdName() %>" style="color: #FFFFFF;"> <%= qm.getdName() %></a></label> with 
	                        <%for(String tags: qm.getTags() ){%>
                                <label class="label" style="background-color: #F80;"><%=tags%></label><%}%>
	            		</div>
                                <h3 style="margin-top: 5px;margin-bottom: 5px;font-weight: bold;"><a href="../AllAnswer?id=<%=i%>" style="text-decoration: none; color: black;"><%= qm.getQue() %></a></h3>

	            		<div class="row" style="padding-left: 5px;">

	            			<div class="col-md-1 col-sm-1"> 
	            				<img src="../ImageLoader?uid=<%= qm.getTopAnswerer() %>" alt="Circle Image" class="img-circle img-responsive">
	            			</div>
	            			<div class="col-md-11 col-sm-11" style="padding-left: 1px;">
	            				<a href="" style="color: #0099cc;"> <%= qm.getAnswererName() %></a> answered
	            				<div class="limittext lead ans" style="margin-bottom: 1px;"><%= qm.getMostUpvotedAnswer() %> </div>
                                                <a class="read" href="../AllAnswer?id=<%=i%>" style="color: #0099cc;" onclick="show('ans<%=i%>','read<%=i%>')">Read more</a>
                                                                                        <script>
                                                                                            quillque.setContents(<%= qm.getMostUpvotedAnswer() %>); 
                                                                                            var htmlcontent=quillque.root.innerHTML;
                                                                                            var c=document.getElementsByClassName("ans");
                                                                                            c[<%=i%>].innerHTML=htmlcontent;
                                                                                            console.log(htmlcontent);
                                                                                        </script>
                                        </div>
	            			
	            			
	            		</div>
            		</div>
	            		<div class="card-footer">
							<div class="stats">
								<i class="material-icons">update</i> <%=qm.getQuedate()%>
							</div>
						</div>
        		    </div>
                <%i++;}%>
                <script>
        var ansElements = document.querySelectorAll('.ans');
        var readElements = document.querySelectorAll('.read');
       
        for (var i = 0; i < ansElements.length; i++)
        {
            readElements[i].id = 'read' + i;
            ansElements[i].id = 'ans' + i;
        
         }</script> 
                <%}%>
				</div>
		
				
				
		
			
			</div>
		</div>

			</div>
			

			
	
	</div>

</body>

	<!--   Core JS Files   -->
<!--        <script src="new css js/dashboard/js/jquery-3.1.0.min.js" type="text/javascript"></script>-->
	<script src="new css js/dashboard/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="new css js/dashboard/js/material.min.js" type="text/javascript"></script>

	<!--  Notifications Plugin    -->
	<script src="new css js/dashboard/js/bootstrap-notify.js"></script>

	
	<!-- Material Dashboard javascript methods -->
	<script src="new css js/dashboard/js/material-dashboard.js"></script>

	<!-- Material Dashboard DEMO methods, don't include it in your project! -->
	<script src="new css js/dashboard/js/demo.js"></script>
        <script src="new css js/MDB Free/js/limittext.js"></script>
	 

</html>
