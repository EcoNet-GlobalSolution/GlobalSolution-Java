package br.com.fiap.ferramenta.dto.request;

import br.com.fiap.ferramenta.entity.TipoRisco;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record EspecieRequest(

        Long id,

        @NotNull
        String nome,

        @NotNull
        String especie,

        @NotNull
        TipoRisco tipo

) {
}
