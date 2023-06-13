package br.com.TerceiroPeriodo.repository;

import br.com.TerceiroPeriodo.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Long> {

    List<Estado> findByNomeAndAtivo(String nome, Boolean status);

}
