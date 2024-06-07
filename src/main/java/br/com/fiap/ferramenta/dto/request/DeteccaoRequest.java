package br.com.fiap.ferramenta.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public record DeteccaoRequest(

        @Positive
        Long id,

        @NotNull
        LocalDate data,

        @NotNull
        AbstractRequest especie,

        @NotNull
        CoordenadaRequest coordenada,

        @NotNull
        AbstractRequest embarcacao
) {
}
