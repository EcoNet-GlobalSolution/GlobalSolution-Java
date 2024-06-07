package br.com.fiap.ferramenta.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TBL_EMBARCACAO")
public class Embarcacao {

    @Id
    @NotNull
    @Column(name = "NUM_REGISTRO") //Um número de registro ou identificação único da embarcação.
    private Long id;

    @Column(name = "NM_EMBARCACAO") //O nome da embarcação.
    private String nome;

    @Column(name = "PROPRIETARIO") //Nome do proprietário
    private String proprietario;

    @Enumerated
    @Column(name = "TIPO_EMBARCACAO")
    private TipoEmbarcacao tipo;
}
