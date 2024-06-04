package br.com.fiap.ferramenta.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TBL_COORDENADA")
public class Coordenada {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_COORDENADA")
    @SequenceGenerator(name = "SQ_COORDENADA", sequenceName = "SQ_COORDENADA", allocationSize = 1)

    @Column(name = "ID_COORDENADA")
    private Long id;

    @Column(name = "LONGITUDE")
    private BigDecimal longitude;

    @Column(name = "LATITUDE")
    private BigDecimal latitude;

}