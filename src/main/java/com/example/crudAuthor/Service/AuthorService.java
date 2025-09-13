package com.example.crudAuthor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudAuthor.Model.Author;
import com.example.crudAuthor.Repository.AuthorRepo;

@Service
public class AuthorService {
 
	@Autowired
	AuthorRepo Repo;    
	
	public List<Author> getall(){
		
		
		List<Author> auth=Repo.findAll(); 
		return auth;
	}   
	
	public String add(Author auth) {
		Repo.save(auth); 
		return "sent to controlle";
	}   
	
	public String update(Author auth, Integer id) {
	    Author existingAuthor = Repo.findById(id).orElse(null);

	        existingAuthor.setName(auth.getName());
	        existingAuthor.setBook_name(auth.getBook_name());
	        Repo.save(existingAuthor);
	        return "Author updated successfully"; 
	     
	} 
	
	public String delete(Integer id) {
		Repo.findById(id).orElse(null);  
		Repo.deleteById(id);
		return "done";
		 
	}

	
}
