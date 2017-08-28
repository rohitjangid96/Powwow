package sendmail;


import java.util.Random;


public class otp {
   public int otpgenerator() {    
      
     
    
     Random rand=new Random();
      int randomNum = rand.nextInt((999999 - 100000) + 1) + 100000;
      System.out.println(randomNum);
      return randomNum;
 }    
}
