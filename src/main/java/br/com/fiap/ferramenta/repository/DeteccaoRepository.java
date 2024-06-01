package br.com.fiap.ferramenta.repository;

import br.com.fiap.ferramenta.entity.Deteccao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeteccaoRepository extends JpaRepository<Deteccao, Long> {
}
