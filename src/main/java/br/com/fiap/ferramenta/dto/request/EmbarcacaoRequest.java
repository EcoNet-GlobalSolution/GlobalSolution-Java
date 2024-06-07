package br.com.fiap.ferramenta.dto.request;

import br.com.fiap.ferramenta.entity.TipoEmbarcacao;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record EmbarcacaoRequest(

        @NotNull
        Long id,

        @Size(min = 2, max = 100)
        @NotBlank
        @NotNull
        String nome,

        @Size(min = 2, max = 150)
        @NotBlank
        @NotNull
        String proprietario,

        @NotNull
        TipoEmbarcacao tipo


) {
}
