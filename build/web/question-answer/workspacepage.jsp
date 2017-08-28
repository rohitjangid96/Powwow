<%-- 
    Document   : workspacepage
    Created on : 26 Apr, 2017, 4:30:04 PM
    Author     : rohan
--%>
<%@page import="model.questionanswermodel.DomainContentModel"%>
<%@page import="model.questionanswermodel.QuestionModel"%>

<%DomainContentModel dcm=(DomainContentModel)session.getAttribute("workspacecontent");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <h1> <%=dcm.getDname()%> </h1>
        
        FOLLOWERS       <%= dcm.getFollowersCount() %><br>
        TAGS            <%= dcm.getTagCount() %><br>
        TOP-USERS       <%for(String users : dcm.getTopUsers()) {%>
                        <%=users+"   "%>
                        <%}%><br>
        TRENDING TAGS   <%for(String tags : dcm.getTrendingTags() ){%>
                        <%=tags+"   "%>
                        <%}%><br>
                        QUESTIONS       <%=dcm.getQuestionsCount() %><br>
        
        <hr>
        <%for(QuestionModel q : dcm.getAlqm()){%>
        <%=q.getUname()+" asked on "+q.getQuedate() %> <br>
        <a href=""><%=q.getQue()%></a><br>
        Tags   :
        <%for(String tag:q.getTags())
            out.println(tag+" ");%>
            <br><%if(q.getMostUpvotedAnswer()!=null && q.getMostUpvotedAnswer().length()>=150){%><%= "ANSWER:  "+q.getMostUpvotedAnswer().substring(0,149)+"..."%><a>Read More</a><%
            }
            else if(q.getMostUpvotedAnswer()!=null){%><%= "ANSWER:  "+q.getMostUpvotedAnswer().substring(0,q.getMostUpvotedAnswer().length())%><%}%><hr>
        <%
        }
        
        %>
        
    </body>
</html>
