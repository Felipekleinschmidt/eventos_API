package com.hellow.eventos.classes.Ingresso;


import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "ingresso")
@Table(name="ingresso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id_ingresso;
    private String  valor_base;
    private String meia;
    private String social;
    private String valor_pago;
    private String pago;
    private String vip;
    private String evento_id;
    private String tipo_id;

    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo;
}
