package com.linecorp.kotlinjdsl.example.jpql.spring.jpa.repository.author

import com.linecorp.kotlinjdsl.example.jpql.spring.jpa.entity.author.Author
import com.linecorp.kotlinjdsl.support.spring.data.jpa.repository.KotlinJdslJpqlExecutor
import org.springframework.data.jpa.repository.JpaRepository

interface AuthorRepository : JpaRepository<Author, Long>, KotlinJdslJpqlExecutor
