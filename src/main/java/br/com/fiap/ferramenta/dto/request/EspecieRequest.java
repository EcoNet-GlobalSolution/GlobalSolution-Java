package br.com.fiap.ferramenta.dto.request;

import br.com.fiap.ferramenta.entity.TipoRisco;
import jakarta.validation.constraints.*;

public record EspecieRequest(

        @Positive
        Long id,

        @Size(min = 2, max = 100)
        @NotBlank
        @NotNull
        String nome,

        @Size(min = 2, max = 250)
        @NotBlank
        @NotNull
        String especie,

        @NotNull
        TipoRisco tipo

) {
}
