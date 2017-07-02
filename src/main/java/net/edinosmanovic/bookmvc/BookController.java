package net.edinosmanovic.bookmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


/**
 * Created by eo on 6/30/17.
 */




@Controller
@RequestMapping(value = "bookstore")
public class BookController {

    static ArrayList<String> books = new ArrayList<>();


    @RequestMapping(value ="")

    public String index(Model model){

        model.addAttribute("books", books);
        model.addAttribute("naslov", "My Books: ");
        return "book/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddBookForm(Model model){
        model.addAttribute("naslov", "Add Book");
        return "book/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddBookForm(@RequestParam String bookName){
        books.add(bookName);
        return "redirect:";
    }
}
