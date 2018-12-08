package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {

	private AuthorRepository authorRepository;
	
	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository=authorRepository;
	}
	
	
	@RequestMapping("/authors")
	public String getAuthor(Model model) {
		Iterable<Author> authors=authorRepository.findAll();
		model.addAttribute("authors", authors);
		return "authors"; 
	}
}
