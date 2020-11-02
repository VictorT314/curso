package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
