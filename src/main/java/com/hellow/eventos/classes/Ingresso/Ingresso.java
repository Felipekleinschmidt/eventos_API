package com.hellow.eventos.classes.Ingresso;


import com.hellow.eventos.classes.evento.Evento;
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
    private Integer ingresso_id;
    private String  valor_base;
    private String meia;
    private String social;
    private String valor_pago;
    private String pago;
    private String vip;

    @ManyToOne
    @JoinColumn( name = "evento_id")
    private Evento evento_id;

    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private Tipo tipo_id;
}
