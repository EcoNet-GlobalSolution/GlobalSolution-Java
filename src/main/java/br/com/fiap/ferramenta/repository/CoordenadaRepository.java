package br.com.fiap.ferramenta.repository;

import br.com.fiap.ferramenta.entity.Coordenada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordenadaRepository extends JpaRepository<Coordenada, Long> {
}
