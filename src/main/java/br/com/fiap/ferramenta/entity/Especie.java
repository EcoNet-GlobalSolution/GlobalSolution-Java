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
@Table(name = "TBL_ESPECIE")
public class Especie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESPECIE")
    @SequenceGenerator(name = "SQ_ESPECIE", sequenceName = "SQ_ESPECIE", allocationSize = 1)

    @Column(name = "ID_ESPECIE")
    private Long idEspecie;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "ESPECIE")
    private String especie;


}
