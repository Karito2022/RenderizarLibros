package com.karitoreyes.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.karitoreyes.project.models.Book;
import com.karitoreyes.project.services.BookService;

@Controller
public class BookController {
	@Autowired
	BookService bookservice;
	
	@RequestMapping("/books/{id}")
	public String index(Model model, @PathVariable("id") Long id) {
		Book book = bookservice.findBook(id);
		model.addAttribute("book", book);
        return "index.jsp";
    }
}