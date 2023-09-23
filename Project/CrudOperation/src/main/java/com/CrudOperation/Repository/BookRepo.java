package com.CrudOperation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CrudOperation.Model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
