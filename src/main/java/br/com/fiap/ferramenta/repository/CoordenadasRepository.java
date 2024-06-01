package br.com.fiap.ferramenta.repository;

import br.com.fiap.ferramenta.entity.Coordenadas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordenadasRepository extends JpaRepository<Coordenadas, Long> {
}
