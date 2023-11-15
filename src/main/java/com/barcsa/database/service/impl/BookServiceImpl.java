package com.barcsa.database.service.impl;

import com.barcsa.database.DTO.BookDto;
import com.barcsa.database.entity.BookEntity;
import com.barcsa.database.repositories.BookRepository;
import com.barcsa.database.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createUpdateBook(String isbn, BookEntity book) {
        book.setIsbn(isbn);
        return bookRepository.save(book);
    }

    @Override
    public List<BookEntity> findAll() {
        return StreamSupport.stream(bookRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }



    @Override
    public Optional<BookEntity> findOne(String isbn) {
        return bookRepository.findById(isbn);
    }

    @Override
    public boolean isExists(String isbn) {
        return bookRepository.existsById(isbn);
    }

    @Override
    public BookEntity partialUpdate(String isbn, BookDto bookDto) {
        bookDto.setIsbn(isbn);

        return bookRepository.findById(isbn).map(existingBook ->{
            Optional.ofNullable(bookDto.getTitle()).ifPresent(existingBook::setTitle);
            Optional.ofNullable(bookDto.getIsbn()).ifPresent(existingBook::setIsbn);
//            Optional.ofNullable(bookDto.getAuthor()).ifPresent(existingBook::setAuthor);
            return bookRepository.save(existingBook);
        }).orElseThrow(()-> new RuntimeException("Book does not exist"));
    }

    @Override
    public void deleteBook(String isbn) {
        bookRepository.deleteById(isbn);
    }
}
