package br.com.fiap.ferramenta.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoEmbarcacao {

    //Embarcações relacionadas a pesca maritima
    TRAINEIRA,
    PESQUEIRO_DE_ARRASTO,
    BARCO_DE_PESCA_DE_CERCO,
    NAVIO_DE_PESCA,
    EMBARCACAO_DE_PESCA_ESPORTIVA
}
