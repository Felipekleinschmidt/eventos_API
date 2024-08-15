package com.hellow.eventos.classes.Midia;


import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "midia")
@Table(name = "midia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id_midia;
    private String formato;
    private String duracao;
    private String tamanho;
    private String  link;
    private String evento_id;
    private String  tipo_id;

    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo;
}
