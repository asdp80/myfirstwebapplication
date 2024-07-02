package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final AuthenticationService authenticationService;

    //우리가 생성자를 만들면 spring은 생성자 주입을 하고, 주입을 하기 위해 스프링은 빈을 만들어야 한다.
    @Autowired
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        //if()에서 괄호 안의 값이 true가 되어야 실행이 된다. false가 되면 그대로 login 페이지 실행한다.
        if (authenticationService.authenticate(name, password)) {

            model.put("name", name);
            model.put("password", password);

            return "welcome";

        }
        else {
            model.put("errorMessage", "Invalid Credentials. Try again.");
            return "login";
        }
    }
}
