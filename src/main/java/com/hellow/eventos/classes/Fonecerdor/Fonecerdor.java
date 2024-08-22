package com.hellow.eventos.classes.Fonecerdor;


import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Table(name="fonecerdor")
@Entity(name="fonecerdor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Fonecerdor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Fonecerdor_id;

    private String nome;
    private String cnpj;
    private String ativo;
    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco_id;
    @ManyToOne
    @JoinColumn(name="tipo_id")
    private Tipo tipo;
}
