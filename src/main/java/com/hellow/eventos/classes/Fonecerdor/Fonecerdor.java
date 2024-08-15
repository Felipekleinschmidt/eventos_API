package com.hellow.eventos.classes.Fonecerdor;


import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Table(name="Fonecedor")
@Entity(name="Fonecedor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Fonecerdor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Fonecerdor;

    private String id;
    private String nome;
    private String cnpj;
    private String ativo;
    private String endereco_id;


    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo_id;
}
