package br.com.fiap.ferramenta.dto.response;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record DeteccaoResponse(

        Long id,

        LocalDate data,

        EspecieResponse especie,

        CoordenadaResponse coordenada
) {
}
