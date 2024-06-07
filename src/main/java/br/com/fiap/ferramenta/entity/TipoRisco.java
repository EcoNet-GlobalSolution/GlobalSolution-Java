package br.com.fiap.ferramenta.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoRisco {

    /*Criticamente em Perigo (CR),
     Criticamente em Perigo Possivelmente Extinta (CR(PEX)),
      Em Perigo (EN), ou Vulnerável (VU).*/
    CR,
    CR_PEX,
    EN,
    VU
}
