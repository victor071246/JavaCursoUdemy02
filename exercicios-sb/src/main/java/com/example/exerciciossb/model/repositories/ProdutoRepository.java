package com.example.exerciciossb.model.repositories;

import com.example.exerciciossb.model.entidades.Produto;
import org.jboss.logging.annotations.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

    //findByNomeContaining
    //findByNomeIsContaining
    //findByNomeContains
    //
    //findByNomeStartsWith
    //findByNomeEndsWith
    //
    // findByNomeNotContaining

    @Query("SELECT p FROM Produto p Where p.nome LIKE %:nome%")
    public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}


