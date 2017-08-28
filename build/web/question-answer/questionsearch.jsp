<%-- 
    Document   : questionsearch
    Created on : 17 Mar, 2017, 5:19:40 PM
    Author     : rohan
--%>

<%@page import="model.questionanswermodel.RelatedQuestionModel"%>
<%@page import="model.questionanswermodel.QuestionModel"%>

<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%RelatedQuestionModel rqm=(RelatedQuestionModel)session.getAttribute("relques");
ArrayList<QuestionModel>alqm=null;

if(rqm!=null)
alqm=rqm.getRelatedque();

String utype=session.getAttribute("utype").toString();
%>
<!DOCTYPE html>
<html>
    
    <head>
 
    <style>
    

</style>
        
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Ask question here...</title>
        <script src="../js/jquery-1.10.2.js"></script>
        <script src="../js/jquery-ui.js"></script>
        <script src="../js/autocompleter.js"></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
        
        
        <script>
    var utype="<%=utype%>";
    
    function setReportButton(x)
{
    var repClass=document.getElementsByClassName("reportque");
    if(utype==="faculty")
    {repClass[x].innerHTML="DELETE";}
}
            
    function getXmlHttpRequestObject()
    {
    var xmlHttpReq;

    if(window.XMLHttpRequest){
    request=new window.XMLHttpRequest();
    }
    else if(window.ActiveXObject){
    request=new window.ActiveXObject();
    }
    else{
    request=null;
    }
    return request;
    }
    
    function reportque(x)
    {
    
    var rep=document.getElementsByClassName("reportque");
    var val=rep[x].value;
    var type;
    request=getXmlHttpRequestObject();
    request.onreadystatechange=showAlert;
    request.open("post","../ReportQuestion",true);
    request.setRequestHeader ("Content-Type", "application/x-www-form-urlencoded");
    if(rep[x].innerHTML==="DELETE")
        type="faculty";
    
    else if(rep[x].innerHTML==="REPORT ABUSE")
        type="student";
    
    val=val+"&type="+type+"&index="+x;
    var data=val;
    request.send(data);
    
}


    function showAlert()
{
    if(request.readyState===4 && request.status===200){
       alert(request.responseText);
       location.reload();
    }
    
}
        </script>
    </head>
    <body>

        <a href="../MyFeed">feed</a>
        
         <h1>SEARCH</h1> 
        <form action="../AskQuestion">
        <input type="text" id="search" name="search" style="width: 40%" class="search" placeholder="SEARCH YOUR QUESTION HERE.." onfocus="inputFocus(this)" onblur="inputBlur(this)"/>
        <input type="submit" value="Search" />
        </form>
        <br>
        <a href="questionmodal.jsp"><button id="myBtn">Ask Question</button></a>
        <br><br>
        <%if(rqm!=null && alqm!=null){%>
        <h1>RELATED QUESTIONS ARE</h1><br><br>
        <%int i=0; 
        for(QuestionModel q : alqm){%>
        <%=q.getUname()+" asked on "+q.getQuedate() %> <br>
        <a href="../AllAnswer?id=<%=i%>"><%=q.getQue()%></a><button value="qid=<%=q.getQid()%>" class="reportque" onclick="reportque(<%=i%>)">REPORT ABUSE</button><br>
        <script>setReportButton(<%=i%>);</script>
        DOMAIN :<%=q.getdName()%><br>
        Tags   :
        <%for(String tag:q.getTags())
            out.println(tag+" ");%>
            <br><%if(q.getMostUpvotedAnswer()!=null && q.getMostUpvotedAnswer().length()>=150){%><%= "ANSWER:  "+q.getMostUpvotedAnswer().substring(0,149)+"..."%><a href="../AllAnswer?id=<%=i%>">Read More</a><%
            }
            else if(q.getMostUpvotedAnswer()!=null){%><%= "ANSWER:  "+q.getMostUpvotedAnswer().substring(0,q.getMostUpvotedAnswer().length())%><%}%><hr>
        <%
          i++;
        }
        }%>
       
 




    </body>
</html>
