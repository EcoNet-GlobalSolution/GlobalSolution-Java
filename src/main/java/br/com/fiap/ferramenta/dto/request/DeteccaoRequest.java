package br.com.fiap.ferramenta.dto.request;

import br.com.fiap.ferramenta.dto.response.EmbarcacaoResponse;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

public record DeteccaoRequest(

        @Positive
        Long id,

        @NotNull
        LocalDate data,

        @NotNull
        AbstractRequest especie,

        @NotNull
        CoordenadaRequest coordenada

) {
}
