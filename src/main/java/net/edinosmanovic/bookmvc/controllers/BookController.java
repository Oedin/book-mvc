package net.edinosmanovic.bookmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.edinosmanovic.bookmvc.models.Book;
import java.util.ArrayList;
import java.util.Date;


/**
 * Created by eo on 6/30/17.
 */




@Controller
@RequestMapping(value = "bookstore")
public class BookController {

    static ArrayList<Book> books = new ArrayList<>();


    @RequestMapping(value ="")

    public String index(Model model){

        model.addAttribute("books", books);
        model.addAttribute("naslov", "Our Books: ");
        return "book/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddBookForm(Model model){
        model.addAttribute("naslov", "Add Book");
        return "book/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddBookForm(@RequestParam String title,
                                     @RequestParam String author,
                                     @RequestParam String genre,
                                     @RequestParam String bookFormat,
                                     @RequestParam Date publishingDate,
                                     @RequestParam Double price){
        Book aBook = new Book(title, author, genre, bookFormat, publishingDate, price);
        books.add(aBook);

        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveBookForm(Model model){
        model.addAttribute("books", books);
        model.addAttribute("naslov", "Remove Books");
        return "books/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveBookForm(){


        return "redirect";
    }
}
