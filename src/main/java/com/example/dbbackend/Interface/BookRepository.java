package com.example.dbbackend.Interface;

import com.example.dbbackend.Model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
