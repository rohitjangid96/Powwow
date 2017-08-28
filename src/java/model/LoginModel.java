/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lenovo
 */
public class LoginModel {
    private String email,pass,otpval;

    public String getOtpval() {
        return otpval;
    }

    public void setOtpval(String otpval) {
        this.otpval = otpval;
    }
    

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    
    
    
}
