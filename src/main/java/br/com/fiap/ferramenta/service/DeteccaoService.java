package br.com.fiap.ferramenta.service;

import br.com.fiap.ferramenta.dto.request.DeteccaoRequest;
import br.com.fiap.ferramenta.dto.response.DeteccaoResponse;
import br.com.fiap.ferramenta.entity.Deteccao;
import br.com.fiap.ferramenta.repository.DeteccaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class DeteccaoService implements ServiceDTO<Deteccao, DeteccaoRequest, DeteccaoResponse>{

    @Autowired
    private DeteccaoRepository repo;

    @Autowired
    private EspecieService especieService;

    @Autowired
    private CoordenadasService coordenadasService;

    @Override
    public Deteccao toEntity(DeteccaoRequest r) {

        var especie = especieService.findById(r.especie().id());

        var coordenadas = coordenadasService.findById(r.especie().id());

        return Deteccao.builder()
                .id(r.id())
                .data(r.data())
                .especie(especie)
                .coordenada(coordenadas)
                .build();
    }

    @Override
    public DeteccaoResponse toResponse(Deteccao e) {

        var especie = especieService.toResponse(e.getEspecie());

        var coordenadas = coordenadasService.toResponse(e.getCoordenada());

        return DeteccaoResponse.builder()
                .id(e.getId())
                .data(e.getData())
                .especie(especie)
                .coordenada(coordenadas)
                .build();
    }

    @Override
    public Collection<Deteccao> findAll(Example<Deteccao> example) {
        return List.of();
    }

    @Override
    public Deteccao findById(Long id) {
        return null;
    }

    @Override
    public Deteccao save(Deteccao e) {
        return null;
    }
}

