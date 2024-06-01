package br.com.fiap.ferramenta.repository;

import br.com.fiap.ferramenta.entity.Especie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecieRepository extends JpaRepository<Especie, Long> {
}
