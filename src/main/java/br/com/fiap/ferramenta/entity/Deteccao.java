package br.com.fiap.ferramenta.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TBL_DETECCAO")
public class Deteccao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DETECCAO")
    @SequenceGenerator(name = "SQ_DETECCAO", sequenceName = "SQ_DETECCAO", allocationSize = 1)

    @Column(name = "ID_DETECCAO")
    private Long id;

    @Column(name = "DATA")
    private LocalDate data;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "COORDENADA", // Nome da coluna de chave estrangeira
            referencedColumnName = "ID_COORDENADA",
            foreignKey = @ForeignKey(name = "FK_DETECCAO_COORDENADA")
    )
    private Coordenada coordenada;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "ESPECIE", // Nome da coluna de chave estrangeira
            referencedColumnName = "ID_ESPECIE",
            foreignKey = @ForeignKey(name = "FK_DETECCAO_ESPECIE")
    )
    private Especie especie;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "EMBARCACAO", // Nome da coluna de chave estrangeira
            referencedColumnName = "NUM_REGISTRO",
            foreignKey = @ForeignKey(name = "FK_DETECCAO_REGISTRO")
    )
    private Embarcacao embarcacao;

}
