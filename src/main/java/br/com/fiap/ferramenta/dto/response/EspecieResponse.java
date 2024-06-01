package br.com.fiap.ferramenta.dto.response;

import br.com.fiap.ferramenta.entity.TipoRisco;
import lombok.Builder;

@Builder
public record EspecieResponse(

        Long id,

        String nome,

        String especie,

        TipoRisco tipo

) {
}
