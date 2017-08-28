<%@page import="model.questionanswermodel.RelatedQuestionModel"%>
<%@page import="model.questionanswermodel.UserModel"%>
<%@page import="model.questionanswermodel.QuestionModel"%>
<%@page import="model.questionanswermodel.QuestionAnswerModel"%>
<%@page import="model.questionanswermodel.AnswerModel"%>
<%@page import="model.questionanswermodel.AllBlogModel"%>
<%@page import="model.questionanswermodel.BlogModel"%>
<%@page import="model.questionanswermodel.DomainModel"%>


<%@page import="java.util.ArrayList"%>


<%@page import="model.questionanswermodel.AllAnswerModel"%>


<!doctype html>
<%
    UserModel mymodel=(UserModel)session.getAttribute("mymodel");
    RelatedQuestionModel rqm=(RelatedQuestionModel)session.getAttribute("myquestions");
    QuestionAnswerModel qam=(QuestionAnswerModel)session.getAttribute("myanswers");
    AllBlogModel abm=(AllBlogModel)session.getAttribute("myblogs");
    ArrayList<AnswerModel> alam=qam.getAlam();
    DomainModel dm=(DomainModel)session.getAttribute("myworkspaces");
    RelatedQuestionModel rqm1=new RelatedQuestionModel() ;
    rqm1.setRelatedque(qam.getAlqm());
    session.setAttribute("relques",rqm);
    session.setAttribute("relques1",rqm1);
%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
	 <link rel="icon" type="image/png" href="../images/logo.png" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Profile Page</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />

	<!--     Fonts and icons     -->
	<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" />
    <link rel="stylesheet" href="new css js/MDB Free/font-awesome-4.7.0/css/font-awesome.min.css" />

	<!-- CSS Files -->
        <link href="new css js/dashboard/css/bootstrap.min.css" rel="stylesheet" />
    <link href="new css js/dashboard/css/material-kit.css" rel="stylesheet"/>
    
     <script src="https://cdn.quilljs.com/1.2.3/quill.js"></script>
     <script src="https://cdn.quilljs.com/1.2.3/quill.min.js"></script>
     <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
     <link href="https://cdn.quilljs.com/1.1.3/quill.snow.css" rel="stylesheet">
     <link href="https://cdn.quilljs.com/1.1.3/quill.bubble.css" rel="stylesheet">
	
	 <style type="text/css">
    	
        .limittext {
    white-space: nowrap; 
    width: 100%; 
    overflow: hidden;
    text-overflow: ellipsis; 

    </style>
    
     

</head>

<body class="profile-page">
         <div id="toolbarque" style="display: none"></div>
         <div id="editorque" style="display: none"></div>
         
         <script>
            var toolbarOptions =[
                ['bold','italic','underline','strike'], 
                ['blockquote','code-block'],
                [{'header' : [1,2,3,4,5,6,false] }],
                [{'list': 'ordered'},{'list': 'bullet'}],
                [{'script': 'sub'},{'script': 'super'}],
                [{'indent': '-1'},{'indent': '+1'}],
                [{'direction': 'rtl'}],
                [{'size': ['large','huge']}],
                ['link','image','video','formula'],
                [{'align': []}]
            ];
            
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

            var configwithtool = {
                "theme": "snow",
                "modules": {
                "toolbar": toolbarOptions
               
  },
               "placeholder": 'Write your answer here...'
               
};
           
    
    $('#submit').click(function(){
        
        window.delta=quill.getContents();
        
        $.ajax({
        url: "../UpdateMyAnswer?ansindex=",
        type: 'POST',
        dataType: 'json',
        
        data: JSON.stringify(delta),
        contentType: 'application/json',
        mimeType: 'application/json',
        success : function(data) {
            
	}
        });
        
      });
      
      
      function setArg(i){
        window.delta=quill.getContents();
         $.ajax({
        url: "../UpdateMyAnswer?ansindex="+i,
        type: 'POST',
        dataType: 'json',
        
        data: JSON.stringify(delta),
        contentType: 'application/json',
        mimeType: 'application/json',
        success : function(data) {
            location.reload();
            
	}
        });}
        
        var quill;
        function edit(i)
            {
            quill=new Quill('#editor'+i,config);
            console.log(quill);
        }
        
            function update(i)
            {
            quill=new Quill('#editor'+i,configwithtool);
            console.log(quill);
        }
        
    
    
            console.log(typeof toolbarOptions);
           
        var quillque;
            quillque=new Quill('#editorque',configque);
            console.log("quillque"+quillque);            
        
        </script>
        
        
         
	<nav class="navbar navbar-info navbar-transparent navbar-fixed-top navbar-color-on-scroll">
    	<div class="container">
        	<!-- Brand and toggle get grouped for better mobile display -->
        	<div class="navbar-header">
        		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation-example">
            		<span class="sr-only">Toggle navigation</span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
        		</button>
        		<a class="navbar-brand" href="#">Powwow</a>
        	</div>

        	<div class="collapse navbar-collapse" id="navigation-example">
        		<ul class="nav navbar-nav navbar-right">
					<li>
    					<a href="../MyFeed" >
    						Home
    					</a>
    				</li>
    				<li>
						
    				</li>
		            
        		</ul>
        	</div>
    	</div>
    </nav>

    <div class="wrapper">
		

		<div class="header header-filter" style="background-image: url('../images/background.jpg');">
		<div class="container">
		<br><br><br>
			<div class="col-md-4 text-center"><h2 style="font-weight: bold;color: #ffffff;">Questions Asked:</h2>
				<br><label class="label label-info" style="font-size: 50px;"><%= rqm.getRelatedque().size() %></label>
			</div>
			<div class="col-md-4 text-center"><h2 style="font-weight: bold;color: #ffffff;">Answers Written:</h2>
				<br><label class="label label-info" style="font-size: 50px;"><%= qam.getAlam().size() %></label>
			</div>
			<div class="col-md-4 text-center"><h2 style="font-weight: bold;color: #ffffff;">Blogs: </h2>
				<br><label class="label label-info" style="font-size: 50px;"><%= abm.getAbm().size() %></label>
			</div>
		</div>
</div>

		<div class="main main-raised">
			<div class="profile-content">
	            <div class="container">
	                <div class="row">
	                    <div class="profile">
	                        <div class="avatar">
	                            <img src="<%="../ImageLoader?uid="+ mymodel.getUid()  %>" alt="Circle Image" class="img-circle img-responsive img-raised">
	                        </div>
	                        <div class="name">
	                            <h3 class="title"><%= mymodel.getUname().toUpperCase() %></h3>
								<h6><%= mymodel.getUtype()+" | "+ mymodel.getDept() %></h6>
	                        </div>
	                    </div>
	                </div>
	                <div class="description text-center">
                        
	                </div>

					<div class="row">
						<div class="col-md-8 col-md-offset-2">
							<div class="profile-tabs">
			                    <div class="nav-align-center">
									<ul class="nav nav-pills nav-pills-info" role="tablist">
										<li class="active">
											<a href="#questions" role="tab" data-toggle="tab">
												<i class="material-icons">camera</i>
												Questions
											</a>
										</li>
										<li>
				                            <a href="#work" role="tab" data-toggle="tab">
												<i class="fa fa-pencil"></i>
				                                Answers
				                            </a>
				                        </li>

										<li>
				                            <a href="#shows" role="tab" data-toggle="tab">
												<i class="material-icons">palette</i>
												Workspaces
				                            </a>
				                        </li>
				                        <li>
				                            <a href="#blog" role="tab" data-toggle="tab">
												<i class="material-icons">favorite</i>
				                                Blogs
				                            </a>
				                        </li>
				                        
				                    </ul>

				                    <div class="tab-content gallery">
                                                        <div class="tab-pane active" id="questions">
                                                        <%if(rqm!=null){int i=0;for(QuestionModel qm: rqm.getRelatedque()){%>
				                        <div class="row">
										<div class="col-md-12">
										 <div class="card card-content" style="text-align: left;">
						                    <div class="category" style="margin-top: 15px;margin-left: 20px;"><a href="" style="color: #0099cc;"><%=mymodel.getUname() %></a> asked in 
						                    	<label class="label label-info"><a href="../WorkSpaceContent?did=<%= qm.getDomain()%>&dname=<%=qm.getdName()%>" style="color: #FFFFFF;"><%=qm.getdName()%></a></label> with 
						                       <%for(String tags:qm.getTags()){%>
                                                                        <label class="label" style="background-color: #ff5d00;"><%=tags%></label>
						                        <%}%>
						            		</div>
                                                                        <h3 style="margin-top: 10px;margin-bottom: 5px;margin-left: 20px; font-weight: bold;"><a href="../AllAnswer?id=<%=i %>" style=" color: black;"><%=qm.getQue() %></a></h3>

						            		<div class="row" style="padding-left: 5px;">

						            			<div class="col-md-1 col-sm-1"> 
						            				<img src="<%="../ImageLoader?uid="+ qm.getTopAnswerer()  %>" alt="Circle Image" class="img-circle img-responsive" style="margin-left: 10px;">
						            			</div>
						            			<div class="col-md-11 col-sm-11" style="padding-left: 1px;">
						            				<a href="" style="color: #0099cc;"><%= qm.getAnswererName() %></a> answered
                                                                                        <div class="limittext lead ans" style="margin-bottom: 1px;"></div>
													<a class="read" href="#no" style="color: #0099cc;" onclick="show('ans<%=i%>','read<%=i%>')">Read more</a>
											<script>
                                                                                            quillque.setContents(<%= qm.getMostUpvotedAnswer() %>); 
                                                                                            var htmlcontent=quillque.root.innerHTML;
                                                                                            var c=document.getElementsByClassName("ans");
                                                                                            c[<%=i%>].innerHTML=htmlcontent;
                                                                                            console.log(htmlcontent);
                                                                                        </script>	
                                                                                </div>
						            		</div>
					            		
						            		<div class="card-footer">
												<div class="stats">
													<i class="material-icons">update</i> <%=qm.getQuedate() %>
												</div>
											</div>
					        		    </div>
        		    		<!--card-1-->		
									</div>
								</div>
                                                        <hr>
                                                               <%i++;}%><script>
        var ansElements = document.querySelectorAll('.ans');
        var readElements = document.querySelectorAll('.read');
       
        for (var i = 0; i < ansElements.length; i++)
        {
            readElements[i].id = 'read' + i;
            ansElements[i].id = 'ans' + i;
        
         }</script><%}%>
				                        </div>
				                        <div class="tab-pane" id="work">
										<%if(qam!=null){int i=0;for(QuestionModel qm : qam.getAlqm()){%><div class="row">
										<div class="col-md-12">
										 <div class="card card-content" style="text-align: left;">
						                    <div class="category" style="margin-top: 15px;margin-left: 20px;"><a href="../GoToUserProfile?id=<%= qm.getUid() %>" style="color: #0099cc;"> <%= qm.getUname() %></a> asked in 
						                    	<label class="label label-info"><a href="../WorkSpaceContent?did=<%= qm.getDomain() %>&dname=<%= qm.getdName() %>" style="color: #FFFFFF;"><%= qm.getdName() %></a></label> with 
						                        <%for(String tags: qm.getTags()){%>
                                                                        <label class="label" style="background-color: #ff5d00;"><%=tags%></label>
						                        <%}%>
						            		</div>
                                                                        <h3 style="margin-top: 10px;margin-bottom: 5px;margin-left: 20px; font-weight: bold; color: black;"><a href="../QuestionForYou?id=<%=i%>" style="color: black;"><%= qm.getQue() %></a></h3>

						            		<div class="row" style="padding-left: 5px;">

						            			<div class="col-md-1 col-sm-1"> 
						            				<img src="<%="../ImageLoader?uid="+ mymodel.getUid()  %>" alt="Circle Image" class="img-circle img-responsive" style="margin-left: 10px;">
						            			</div>
						            			<div class="col-md-11 col-sm-11" style="padding-left: 1px;">
                                                                                    <a href="" style="color: #0099cc;"> <%= mymodel.getUname() %></a> answered
						            				<div class="lead" style="margin-bottom: 1px;"> <button class="btn btn-info btn-sm" onclick="showAns(<%=i%>)"><i class="fa fa-pencil"></i></button>
        <center>
        <form class="edittext">
        <div class="toolbarmyans"></div>
        <div class="editormyans"></div>
        <input type="button" class="btn btn-info btn-sm updatebtn" value="update" style="display: none" onclick="setArg(<%=i%>)"/>

        </form>
        </center>
                                                                                        </div>
						            			</div>
						            		</div>
					            		
						            		<div class="card-footer">
												<div class="stats">
                                                                                                    <i class="material-icons">update</i> <%= alam.get(i).getAnsDate() %>
												</div>
											</div>
					        		    </div>
        		    		<!--card-1-->		
									</div>
        </div><hr><%i++;}}%>
												</div>
			                        <div class="tab-pane" id="blog">

                                                                        <%if(abm!=null){int i=0;for(BlogModel bm : abm.getAbm()){%>
										<div class="row">
										<div class="col-md-12">
										 <div class="card card-content" style="text-align: left;">
						                    <div class="category" style="margin-top: 15px;margin-left: 20px;"><a href="" style="color: #0099cc;"> <%= mymodel.getUname() %> </a>wrote in 
						                    	<label class="label label-info"><a href="../WorkSpaceContent?did=<%= bm.getDid() %>&dname=<%= bm.getDname() %>" style="color: #FFFFFF;"> <%= bm.getDname() %></a></label>
						            		</div>
						                        <h3 style="margin-top: 10px;margin-bottom: 5px;margin-left: 20px; font-weight: bold;"><%= bm.getTitle() %></h3>
                                                                        

                                                                        <div class="lead" style="margin-bottom: 1px;margin-left: 20px;">
<!--                                                                         <button onclick="showmyblog(<%=i%>)" class="btn btn-info btn-sm"><i class="fa fa-pencil"></i></button>-->
        <div class="myblogtool"></div>
        <div class="myblogeditor"></div>
<!--        <input type="button" class="btn btn-info btn-sm updateblog" value="update" style="display: none" onclick="setblogarg(<%=i%>)"/>   -->
                                                                        </div>
						            		
						            		<div class="card-footer">
												<div class="stats">
													<i class="material-icons">update</i> <%= bm.getTimestamp() %>
												</div>
											</div>
					        		    </div>
        		    		<!--card-1-->		
									</div>
								</div><hr><% i++;}}%>
												</div>
										<div class="tab-pane text-center" id="shows">
											<div class="row">
												 <table class="table">
                                                                                            <% for(int i=0;i<dm.getDomainList().size();i++) {%>
                                                                                            <tr>
                                                                                                <td> <img src="imagesdomain/<%= dm.getDomainImg().get(i) %>" class="img-rounded" style="width: 150px; height: 150px"/></td>
                                                                                                
                                                                                                
                                                                                                <td>  <h2> <button class="btn btn-info btn-lg"><a href="../WorkSpaceContent?did=<%= dm.getDomainIdList().get(i) %>&dname=<%= dm.getDomainList().get(i) %>" style="text-decoration: none;color: white;font-size: 16px"><%= dm.getDomainList().get(i) %></a></button></h2></td>
                                                                                                
                                                                                    </tr>
                                                                                    
                                                                                               <%}%>
                                                                                    </table>  
											</div>
				                        </div>

				                    </div>
								</div>
							</div>
							<!-- End Profile Tabs -->
						</div>
	                </div>

	            </div>
	        </div>
		</div>

    </div>
    <footer class="footer">
        <div class="container">
            <nav class="pull-left">
				<ul>
					<li>
						<a href="#">
							Powwow
						</a>
					</li>
					<li>
						<a href="#">
						   About Us
						</a>
					</li>
					<li>
						<a href="#">
						   Blog
						</a>
					</li>
					
				</ul>
            </nav>
            <div class="copyright pull-right">
                &copy; 2017, made with <i class="fa fa-heart heart"></i> by Team Powwow
            </div>
        </div>
    </footer>
                                                       




                 <script src="new css js/dashboard/js/jquery.min.js" type="text/javascript"> </script>
	<script src="new css js/dashboard/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="new css js/dashboard/js/material.min.js"></script>

	<!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
	<script src="new css js/dashboard/js/nouislider.min.js" type="text/javascript"></script>


	<!-- Control Center for Material Kit: activating the ripples, parallax effects, scripts from the example pages etc -->
	<script src="new css js/dashboard/js/material-kit.js" type="text/javascript"></script>
        <script src="new css js/MDB Free/js/limittext.js"></script>
        
        
        <script>
        var toolbarElements = document.querySelectorAll('.toolbarmyans');
        var editorElements = document.querySelectorAll('.editormyans');
        var formElements = document.querySelectorAll('.edittext');
        for (var i = 0; i < editorElements.length; i++)
        {
            toolbarElements[i].id = 'toolbar' + i;
            editorElements[i].id = 'editor' + i;
            formElements[i].id=i;
            
        }
        
        <%for(int i=0;i<alam.size();i++){%>
        edit(<%=i%>);
        quill.setContents(<%=alam.get(i).getAnswer()%>);
        quill.enable(false);
        <%}%>
        </script>
        
        <script>
            function showAns(i)
            {
                var btn=document.getElementsByClassName("updatebtn");
                 
        if(btn[i].style.display==="block")
        {
            btn[i].style.display="none";
            var id='toolbar'+i;
    
            var elems = document.getElementsByClassName("ql-toolbar ql-snow");
    for (var k = elems.length - 1; k >= 0; k--) {
        var parent = elems[k].parentNode;
        parent.removeChild(elems[k]);
    }
            
            edit(i);
            quill.enable(false);
        }
        else if(btn[i].style.display==="none")
        {
            btn[i].style.display="block";
            update(i);
            var id='editor'+i;
            document.getElementById(id).className = "editormyans ql-container ql-snow";
        }
    }
        </script>
        
       
       <script>
            var toolbarOptionsBlog =[
                ['bold','italic','underline','strike'], 
                ['blockquote','code-block'],
                [{'header' : [1,2,3,4,5,6,false] }],
                [{'list': 'ordered'},{'list': 'bullet'}],
                [{'script': 'sub'},{'script': 'super'}],
                [{'indent': '-1'},{'indent': '+1'}],
                [{'direction': 'rtl'}],
                [{'size': ['small',false,'large','huge']}],
                ['link','image','video','formula'],
                [{'align': []}]
            ];
            
            var configblog = {
                "theme": "snow",
                "modules": {
                "toolbar": toolbarOptionsBlog
               
  },
               "placeholder": 'Write your blog here...'
};

            var configforshowblog = {
                "theme": "snow",
                "modules": {
                "toolbar": false
               
  },
               "placeholder": 'Write your blog here...'
};

            console.log(typeof toolbarOptionsBlog);
            var quillblog;
            quillblog=new Quill('#blogeditor',configblog);
            
            function instantiatequill()
            {
            var quillblog1;
            quillblog1=new Quill('#blogeditor',configblog);
            }
//            function showBlog()
//            {
//            if(document.getElementById("blogform").style.display==="none")
//            document.getElementById("blogform").style.display="block";
//        
//            else if(document.getElementById("blogform").style.display="block")
//            document.getElementById("blogform").style.display="none";    
//            //quill.enable(false);
//            }
      
      var TT;
      
//       function postBlog(){
//        window.delta=quillblog.getContents();
//        console.log(delta);
//         $.ajax({
//        url: "PostBlog?did="+document.getElementById("blogdid").value+"&title="+document.getElementById("blogtitle").value,
//        type: 'POST',
//        dataType: 'json',
//        
//        data: JSON.stringify(delta),
//        contentType: 'application/json',
//        mimeType: 'application/json',
//        success : function(data) {
//            location.reload();
//            
//	}
//        });
//        
//    }
    
    function setblogarg(i){
        window.delta=quillForShowBlog.getContents();
         $.ajax({
        url: "../UpdateMyBlog?blogindex="+i,
        type: 'POST',
        dataType: 'json',
        
        data: JSON.stringify(delta),
        contentType: 'application/json',
        mimeType: 'application/json',
        success : function(data) {
            location.reload();
            
	}
        });
    }  
    
    var quillForShowBlog;
    
     function editblog(i)
            {
            quillForShowBlog=new Quill('#editorblog'+i,configforshowblog);
            
        }
        
         function updateblog(i)
            {
            quillForShowBlog=new Quill('#editorblog'+i,configblog);
            console.log(quill);
        }
        </script>
        
        <script>
        var toolbarblogElements = document.querySelectorAll('.myblogtool');
        var editorblogElements = document.querySelectorAll('.myblogeditor');

        for (var i = 0; i < editorblogElements.length; i++)
        {
            toolbarblogElements[i].id = 'toolbarblog' + i;
            editorblogElements[i].id = 'editorblog' + i;
        }
        
        <%for(int i=0;i<abm.getAbm().size();i++){%>
        editblog(<%=i%>);
        quillForShowBlog.setContents(<%=abm.getAbm().get(i).getBlogContent()%>);
        quillForShowBlog.enable(false);
        <%}%>
        </script>
        
     <script>
            function showmyblog(i)
            {
                var btn=document.getElementsByClassName("updateblog");
                 
        if(btn[i].style.display==="block")
        {
            btn[i].style.display="none";
            var id='toolbarblog'+i;
    
            var elems = document.getElementsByClassName("ql-toolbar ql-snow");
    for (var k = elems.length - 1; k >= 0; k--) {
        var parent = elems[k].parentNode;
        parent.removeChild(elems[k]);
    }
            instantiatequill();
            editblog(i);
            quillForShowBlog.enable(false);
        }
        else if(btn[i].style.display==="none")
        {
            btn[i].style.display="block";
            updateblog(i);
            var id='editorblog'+i;
            document.getElementById(id).className = "myblogeditor ql-container ql-snow";
        }
    }
        </script>   
        
        
</body>
</html>
