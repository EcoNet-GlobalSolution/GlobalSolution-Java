package br.com.fiap.ferramenta.service;

import br.com.fiap.ferramenta.dto.request.EmbarcacaoRequest;
import br.com.fiap.ferramenta.dto.response.EmbarcacaoResponse;
import br.com.fiap.ferramenta.entity.Embarcacao;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class EmbarcacaoService implements ServiceDTO<Embarcacao, EmbarcacaoRequest, EmbarcacaoResponse>{
    @Override
    public Embarcacao toEntity(EmbarcacaoRequest r) {
        return null;
    }

    @Override
    public EmbarcacaoResponse toResponse(Embarcacao e) {
        return null;
    }

    @Override
    public Collection<Embarcacao> findAll(Example<Embarcacao> example) {
        return List.of();
    }

    @Override
    public Embarcacao findById(Long id) {
        return null;
    }

    @Override
    public Embarcacao save(Embarcacao e) {
        return null;
    }
}
