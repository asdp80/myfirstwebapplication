package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

//사용자 인증
@Service
public class AuthenticationService {

    //둘 다 유효할 시, true 반환
    public boolean authenticate(String username, String password){
        boolean isValidUserName =  username.equals("in28minutes");
        boolean isValidPassword = password.equals("12345");

        return isValidUserName && isValidPassword;
    }
}
