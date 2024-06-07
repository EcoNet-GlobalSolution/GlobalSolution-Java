package br.com.fiap.ferramenta.dto.response;

import br.com.fiap.ferramenta.entity.Embarcacao;
import lombok.Builder;

import java.time.LocalDate;
import java.util.Collection;

@Builder
public record DeteccaoResponse(

        Long id,

        LocalDate data,

        EspecieResponse especie,

        CoordenadaResponse coordenada,

        EmbarcacaoResponse embarcacao

) {
}
