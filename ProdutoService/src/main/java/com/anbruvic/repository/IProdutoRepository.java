package com.anbruvic.repository;

import com.anbruvic.domain.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProdutoRepository extends MongoRepository<Produto, String> {

    Optional<Produto> findByCodigo(String codigo);

    Page<Produto> findAllByStatus(Pageable pageable, Produto.Status status);
}
