package kr.ac.hansung.cse.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String sayHello(){
        return "index"; // view 관련된 template name
        // 예전엔 jsp 를 썼는데 Thymeleaf 쓸 생각
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "index"
    }

}
