package br.com.fiap.ferramenta.dto.response;

import br.com.fiap.ferramenta.entity.TipoEmbarcacao;
import lombok.Builder;

@Builder
public record EmbarcacaoResponse(

        Long id,

        String nome,

        String proprietario,

        TipoEmbarcacao tipo

) {
}
