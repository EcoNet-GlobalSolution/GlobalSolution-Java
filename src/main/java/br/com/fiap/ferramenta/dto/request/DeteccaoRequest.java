package br.com.fiap.ferramenta.dto.request;

import java.time.LocalDate;

public record DeteccaoRequest(

        Long id,

        LocalDate data,

        EspecieRequest especie,

        CoordenadaRequest coordenada
) {
}
