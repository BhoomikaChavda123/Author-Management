package com.example.crudAuthor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudAuthor.Model.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer> {

}
