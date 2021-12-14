package com.pluralsight.blog.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pluralsight.blog.model.Author;
import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pluralsight.blog.model.Author;

@RepositoryRestResource(exported = false)
public interface AuthorRepository extends JpaRepository<Author, Long> {}