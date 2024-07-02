package com.in28minutes.springboot.myfirstwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    //"say-hello" => "Hello! What are you learning today?"

    //문자열 리턴한다.
    //http://localhost:8080/say-hello
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){

        return "Hello! What are you learning today?";
    }

    //여러 가지 주소가 생길 수 있다. 그러면 우리는 일정 반복되는 부분을 프로퍼티에 저장할 수 있다.
    // src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    // src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
    //src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJSP() {
        return "sayHello";
    }

}
