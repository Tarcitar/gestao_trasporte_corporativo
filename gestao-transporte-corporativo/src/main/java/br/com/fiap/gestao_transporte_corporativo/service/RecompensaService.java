package br.com.fiap.gestao_transporte_corporativo.service;

import br.com.fiap.gestao_transporte_corporativo.model.Recompensa;
import br.com.fiap.gestao_transporte_corporativo.repository.RecompensaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecompensaService {

    @Autowired
    private RecompensaRepository recompensaRepository;

//    // Listar todas as recompensas
//    public List<Recompensa> listarTodas() {
//        return recompensaRepository.findAll();
//    }
//
//    // Obter uma recompensa por ID
//    public Optional<Recompensa> obterPorId(Long id) {
//        return recompensaRepository.findById(id);
//    }
//
//    // Criar uma nova recompensa
//    public Recompensa criar(Recompensa recompensa) {
//        return recompensaRepository.save(recompensa);
//    }
//
//    // Atualizar uma recompensa existente
//    public Optional<Recompensa> atualizar(Long id, Recompensa recompensaAtualizada) {
//        return recompensaRepository.findById(id).map(recompensa -> {
//            recompensa.setDescricao(recompensaAtualizada.getDescricao());
//            recompensa.setValor(recompensaAtualizada.getValor());
//            return recompensaRepository.save(recompensa);
//        });
//    }
//
//    // Excluir uma recompensa por ID
//    public boolean excluir(Long id) {
//        return recompensaRepository.findById(id).map(recompensa -> {
//            recompensaRepository.delete(recompensa);
//            return true;
//        }).orElse(false);
//    }
}