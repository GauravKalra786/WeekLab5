/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sait.services;

import ca.servlets.models.User;

/**
 *
 * @author kalra
 */
public class AccountService {
    public AccountService(){
        
    }
    public User login(String username , String password){
      if("abe".equals(username) && ("password").equals(password)){
          
          User user =  new User(username , password); 
          return user;
      } else if("barb".equals(username) && ("password").equals(password)){
          User user =  new User(username , password); 
          return user;
      }  else{
          return null;
      }
        
    }
}
