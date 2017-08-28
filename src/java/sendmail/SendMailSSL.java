package sendmail;

import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;    
class Mailer{  
    public static void send(String from,String password,String to,String sub,String msg){  
          //Get properties object    
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(from,password);  
           }    
          });    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject(sub);
          
          // message.setText(msg); 
           message.setContent(
              "<div align='center'><h1 style='background-color:yellow; color:red'><br/><br/>OTP -> <i>"+msg+"</i><br/><br/>" +
                      "  PLEASE ENTER THE OTP IN VERIFICATION LINK->  http://localhost:8084/Powwow/register%20pages/linklogin.jsp </h1> </div>",
             "text/html");
         
           //send message  
           Transport.send(message);    
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}    
             
    }  

  
}  
public class SendMailSSL{    
    public  int verification(String tomail, String botp) {    
     //from,password,to,subject,message  
//     RegisterServlet forotp=new RegisterServlet();
//     String tomail=forotp.mailcopy;
//     String b=forotp.otpval;
       
        
     Mailer.send("powwow.ips@gmail.com","Powwow@1234",tomail,"Thanks for Registration" , botp );  
     
     //change from, password and to  
     
    return 0;
    
   }    
    
    
    
   
}    