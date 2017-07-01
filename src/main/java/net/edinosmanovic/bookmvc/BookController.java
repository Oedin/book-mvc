package net.edinosmanovic.bookmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by eo on 6/30/17.
 */
@Controller
@RequestMapping(value = "bookstore")
public class BookController {

    @RequestMapping(value ="")
    public String index(Model model){


        model.addAttribute("naslov", "My Books: ");
        return "book/index";
    }
}
