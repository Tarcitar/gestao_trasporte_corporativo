package br.com.fiap.gestao_transporte_corporativo.repository;

import br.com.fiap.gestao_transporte_corporativo.model.Impacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImpactoRepository extends JpaRepository<Impacto, Long> {
//    List<Impacto> findByEmpresaId(Long empresaId);
}