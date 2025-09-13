package com.example.crudAuthor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudAuthor.Model.Author;
import com.example.crudAuthor.Service.AuthorService;

@RestController
public class AuthorController {  
	
	@Autowired
	AuthorService service; 
	
	@GetMapping("/all") 
	private List<Author> getauthor(){
     List<Author> auth=service.getall(); 
     return auth;
	}  
	
	@PostMapping("/addthis") 
	private String create(@RequestBody Author auth) {
		service.add(auth); 
		return "done";
	}
	
	@PutMapping("/update/{id}")
	private String updateauth(@RequestBody Author auth,@PathVariable Integer id) {
		service.update(auth,id);
		return "update done";
	}
	
	@DeleteMapping("/delete/{id}")
	private String deleteauth(@PathVariable Integer id) {
		service.delete(id);
		return "deleted ";
	}

}
