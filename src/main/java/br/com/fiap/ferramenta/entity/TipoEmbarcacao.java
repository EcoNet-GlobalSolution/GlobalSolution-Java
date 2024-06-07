package br.com.fiap.ferramenta.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoEmbarcacao {

    //Embarcações relacionadas a pesca maritima
    TRAINEIRA,
    ARRASTO,
    CERCO,
    NAVIO,
    ESPORTIVA;

}
