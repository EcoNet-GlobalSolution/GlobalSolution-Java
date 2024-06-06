package br.com.fiap.ferramenta.repository;

import br.com.fiap.ferramenta.entity.Embarcacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmbarcacaoRepository extends JpaRepository<Embarcacao, Long> {
}
