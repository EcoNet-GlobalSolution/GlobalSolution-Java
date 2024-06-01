package br.com.fiap.ferramenta.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TBL_COORDENADAS")
public class Coordenadas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_COORDENADAS")
    @SequenceGenerator(name = "SQ_COORDENADAS", sequenceName = "SQ_COORDENADAS", allocationSize = 1)

    @Column(name = "ID_COORDENADAS")
    private Long id;

    @Column(name = "LONGITUDE")
    private BigDecimal longitude;

    @Column(name = "LATITUDE")
    private BigDecimal latitude;

}