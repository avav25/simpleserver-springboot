package net.avav25;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping("/net/avav25")
    public String hello() {

        return "hello";
    }

}
