package com.barcsa.database.service;

import com.barcsa.database.DTO.AuthorDto;
import com.barcsa.database.entity.AuthorEntity;

import java.util.List;
import java.util.Optional;


public interface AuthorService {

    AuthorEntity save(AuthorEntity author);

    List<AuthorEntity> findAll();

    Optional<AuthorEntity> findOne(Long id);

    boolean isExists(Long id);

    AuthorEntity partialUpdate(Long id, AuthorDto authorDto);

    void delete(Long id);
}
