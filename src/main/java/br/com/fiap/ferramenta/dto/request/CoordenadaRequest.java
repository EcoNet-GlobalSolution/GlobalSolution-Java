package br.com.fiap.ferramenta.dto.request;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record CoordenadaRequest(

        Long id,

        @DecimalMax(value = "90")
        @DecimalMin(value = "-90")
        @NotNull
        BigDecimal latitude,

        @DecimalMax(value = "180")
        @DecimalMin(value = "-180")
        @NotNull
        BigDecimal longitude
) {
}
