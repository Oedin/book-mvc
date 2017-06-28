package net.edinosmanovic.bookmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by eo on 6/28/17.
 */

@Controller
public class Hellocontroller {

    @RequestMapping(value = "")
    @ResponseBody
    public String index(HttpServletRequest request){

        String name = request.getParameter("name");
        if (name == null){
            name = "Guest";
        }

        return name + ", welcome to our bookstore ";
    }

    @RequestMapping(value = "hello")
    @ResponseBody
    public String helloForm(){
        String html = "<form method = 'post'>"+
                "<input type = 'text' name = 'name' />"+
                "<input type ='submit' value = 'Greet me!'/>"+
                "</form>";

        return html;
    }

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(HttpServletRequest request){

        String name = request.getParameter("name");

        if (name == null){
            name = "Guest";
        }
        return name + ", welcome to our bookstore";

    }

    @RequestMapping(value = "hello/{name}")
    @ResponseBody
    public String helloUrl(@PathVariable String name){

        return name +", welcome to our bookstore";
    }


    @RequestMapping(value = "bye")
    public String goodBye(){
        return "redirect:/";
    }
}
