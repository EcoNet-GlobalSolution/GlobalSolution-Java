package br.com.fiap.ferramenta.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

public record DeteccaoRequest(

        Long id,

        @NotNull
        LocalDate data,

        @NotNull
        EspecieRequest especie,

        @NotNull
        CoordenadaRequest coordenada
) {
}
