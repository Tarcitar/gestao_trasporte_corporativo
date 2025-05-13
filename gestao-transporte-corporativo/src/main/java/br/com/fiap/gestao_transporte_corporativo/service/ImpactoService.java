package br.com.fiap.gestao_transporte_corporativo.service;

import br.com.fiap.gestao_transporte_corporativo.model.Impacto;
import br.com.fiap.gestao_transporte_corporativo.repository.ImpactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImpactoService {

    @Autowired
    private ImpactoRepository impactoRepository;

//    // Listar todos os impactos
//    public List<Impacto> listarTodos() {
//        return impactoRepository.findAll();
//    }
//
//    // Obter um impacto por ID
//    public Optional<Impacto> obterPorId(Long id) {
//        return impactoRepository.findById(id);
//    }
//
//    // Criar um novo impacto
//    public Impacto criar(Impacto impacto) {
//        return impactoRepository.save(impacto);
//    }
//
//    // Atualizar um impacto existente
//    public Optional<Impacto> atualizar(Long id, Impacto impactoAtualizado) {
//        return impactoRepository.findById(id).map(impacto -> {
//            impacto.setDescricao(impactoAtualizado.getDescricao());
//            impacto.setPontuacao(impactoAtualizado.getPontuacao());
//            return impactoRepository.save(impacto);
//        });
//    }
//
//    // Excluir um impacto por ID
//    public boolean excluir(Long id) {
//        return impactoRepository.findById(id).map(impacto -> {
//            impactoRepository.delete(impacto);
//            return true;
//        }).orElse(false);
//    }
}