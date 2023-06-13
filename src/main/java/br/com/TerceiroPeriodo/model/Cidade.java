package br.com.TerceiroPeriodo.model;

import lombok.Data;
import lombok.extern.java.Log;

import javax.persistence.*;

@Data
@Entity
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    String nome;
    @ManyToOne
    @JoinColumn(name = "id_estado")
    Estado estado;
}
