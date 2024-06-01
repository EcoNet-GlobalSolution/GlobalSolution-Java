package br.com.fiap.ferramenta.dto.request;

import java.math.BigDecimal;

public record CoordenadaRequest(

        Long id,

        BigDecimal latitude,

        BigDecimal longitude
) {
}
