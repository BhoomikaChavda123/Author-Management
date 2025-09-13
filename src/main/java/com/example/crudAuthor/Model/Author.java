package com.example.crudAuthor.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="Bhumi")
public class Author {  
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;  
	
	@Column()
	private String name;
	
	@Column
	private String book_name;

	public Author() {
		super();
	}

	public Author(int id, String name, String book_name) {
		super();
		this.id = id;
		this.name = name;
		this.book_name = book_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", book_name=" + book_name + "]";
	} 
	
	
	

}
