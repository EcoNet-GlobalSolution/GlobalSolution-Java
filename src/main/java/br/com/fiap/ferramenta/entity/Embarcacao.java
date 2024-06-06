package br.com.fiap.ferramenta.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TBL_EMBARCACAO")
public class Embarcacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EMBARCACAO")

    @Column(name = "NUM_REGISTRO") //Um número de registro ou identificação único da embarcação.
    private Long registro;

    @Column(name = "NOME") //O nome da embarcação.
    private String nome;

    @Column(name = "PROPRIETARIO") //O nome do proprietário ou empresa que possui a embarcação.
    private String proprietario;

    @Column(name = "PORTO") //O porto onde a embarcação está registrada.
    private String porto;

    @Enumerated
    @Column(name = "TIPO_EMBARCACAO")
    private TipoEmbarcacao tipo;
}
