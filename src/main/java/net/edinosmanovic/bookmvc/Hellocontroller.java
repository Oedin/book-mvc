package net.edinosmanovic.bookmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by eo on 6/28/17.
 */

@Controller
public class Hellocontroller {

    @RequestMapping(value = "")
    @ResponseBody
    public String index(){
        return "Welcome to our bookstore";
    }
    @RequestMapping(value = "bye")
    @ResponseBody
    public String goodBye(){
        return "Good Bye";
    }
}
