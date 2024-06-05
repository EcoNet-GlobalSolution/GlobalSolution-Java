package br.com.fiap.ferramenta.dto.request;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record CoordenadaRequest(

        @Positive
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
