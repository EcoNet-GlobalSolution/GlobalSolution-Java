package br.com.fiap.ferramenta.service;

import br.com.fiap.ferramenta.dto.request.EspecieRequest;
import br.com.fiap.ferramenta.dto.response.EspecieResponse;
import br.com.fiap.ferramenta.entity.Especie;
import br.com.fiap.ferramenta.repository.EspecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EspecieService implements ServiceDTO<Especie, EspecieRequest, EspecieResponse>{

    @Autowired
    private EspecieRepository repo;


    @Override
    public Especie toEntity(EspecieRequest r) {
        return Especie.builder()
                .id(r.id())
                .nome(r.nome())
                .especie(r.especie())
                .tipo(r.tipo())
                .build();
    }

    @Override
    public EspecieResponse toResponse(Especie e) {
        return EspecieResponse.builder()
                .id(e.getId())
                .nome(e.getNome())
                .especie(e.getEspecie())
                .tipo(e.getTipo())
                .build();
    }

    @Override
    public Collection<Especie> findAll(Example<Especie> example) {
        return repo.findAll( example );
    }

    @Override
    public Especie findById(Long id) {
        return repo.findById( id ).orElse( null );
    }

    @Override
    public Especie save(Especie e) {
        return repo.save( e );
    }
}

