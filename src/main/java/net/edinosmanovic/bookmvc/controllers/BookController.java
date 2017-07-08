package net.edinosmanovic.bookmvc.controllers;

import net.edinosmanovic.bookmvc.models.BookData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.edinosmanovic.bookmvc.models.Book;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;


/**
 * Created by eo on 6/30/17.
 */




@Controller
@RequestMapping(value = "bookstore")
public class BookController {




    @RequestMapping(value ="")

    public String index(Model model){

        model.addAttribute("books", BookData.getAll());
        model.addAttribute("naslov", "Our Books: ");
        return "book/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddBookForm(Model model){
        model.addAttribute("naslov", "Add Book");
        model.addAttribute("book", new Book());
        return "book/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddBookForm(@ModelAttribute @Valid Book newBook,
                                     Errors errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("naslov", "Add Book");
            return "book/add";
        }
        BookData.add(newBook);

        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveBookForm(Model model){
        model.addAttribute("books", BookData.getAll());
        model.addAttribute("naslov", "Remove Book");
        return "book/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveBookForm(@RequestParam int[] bookIds){

        for(int bookId : bookIds) {
            BookData.remove(bookId);

        }
            return "redirect:";

    }
}
