package br.com.fiap.ferramenta.dto.response;

import br.com.fiap.ferramenta.entity.TipoEmbarcacao;
import lombok.Builder;

@Builder
public record EmbarcacaoResponse(

        Long registro,

        String nome,

        String proprietario,

        String porto,

        TipoEmbarcacao tipo
) {
}
