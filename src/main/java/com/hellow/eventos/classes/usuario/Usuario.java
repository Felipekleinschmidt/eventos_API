package com.hellow.eventos.classes.usuario;


import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "usuario")
@Entity(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private Integer id_usuario;
    private String nome;
    private String sobrenome;
    private String login;
    private String senha;
    private String dt_nacimento;
    private String dt_criacao;
    private String dt_filacao;
    private String email;
    private String telefone;
    private String cpf;

    @ManyToOne
    @JoinColumn(name="tipo_id")
    private Tipo tipo;

}
