package br.com.fiap.ferramenta.dto.request;

import br.com.fiap.ferramenta.entity.TipoRisco;

public record EspecieRequest(

        Long id,

        String nome,

        String especie,

        TipoRisco tipo

) {
}
