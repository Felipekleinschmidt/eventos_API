package com.hellow.eventos.classes.Cliente;

import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="cliente")
@Table(name="cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cliente { @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private Integer id_cliente;
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private String cpf;

    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo;

}
