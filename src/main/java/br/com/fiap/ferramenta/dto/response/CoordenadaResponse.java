package br.com.fiap.ferramenta.dto.response;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record CoordenadaResponse(

        Long id,

        BigDecimal latitude,

        BigDecimal longitude
) {
}
