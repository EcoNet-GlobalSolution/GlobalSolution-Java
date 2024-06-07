package br.com.fiap.ferramenta.service;

import br.com.fiap.ferramenta.dto.request.EmbarcacaoRequest;
import br.com.fiap.ferramenta.dto.response.EmbarcacaoResponse;
import br.com.fiap.ferramenta.entity.Embarcacao;
import br.com.fiap.ferramenta.repository.EmbarcacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmbarcacaoService implements ServiceDTO<Embarcacao, EmbarcacaoRequest, EmbarcacaoResponse>{

    @Autowired
    private EmbarcacaoRepository repo;

    @Override
    public Embarcacao toEntity(EmbarcacaoRequest r) {
        return Embarcacao.builder()
                .id(r.id())
                .nome(r.nome())
                .proprietario(r.proprietario())
                .tipo(r.tipo())
                .build();
    }

    @Override
    public EmbarcacaoResponse toResponse(Embarcacao e) {
        return EmbarcacaoResponse.builder()
                .id(e.getId())
                .nome(e.getNome())
                .proprietario(e.getProprietario())
                .tipo(e.getTipo())
                .build();
    }

    @Override
    public Collection<Embarcacao> findAll(Example<Embarcacao> example) {
        return repo.findAll( example );
    }

    @Override
    public Embarcacao findById(Long id) {
        return repo.findById( id ).orElse( null );
    }

    @Override
    public Embarcacao save(Embarcacao e) {
        return repo.save( e );
    }
}
