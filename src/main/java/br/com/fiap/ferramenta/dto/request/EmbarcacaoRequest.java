package br.com.fiap.ferramenta.dto.request;

import br.com.fiap.ferramenta.entity.TipoEmbarcacao;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record EmbarcacaoRequest(

        @Positive
        Long registro,

        @Size(min = 2, max = 100)
        @NotBlank
        @NotNull
        String nome,

        @Size(min = 2, max = 100)
        @NotBlank
        @NotNull
        String proprietario,

        @Size(min = 2, max = 100)
        @NotBlank
        @NotNull
        String porto,

        @NotNull
        TipoEmbarcacao tipo
) {
}
