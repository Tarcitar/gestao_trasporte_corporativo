package br.com.fiap.gestao_transporte_corporativo.service;

import br.com.fiap.gestao_transporte_corporativo.entity.Transporte;
import br.com.fiap.gestao_transporte_corporativo.repository.TransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransporteService {

    @Autowired
    private TransporteRepository transporteRepository;

    // Listar todos os transportes
    public List<Transporte> listarTodos() {
        return transporteRepository.findAll();
    }

    // Obter um transporte por ID
    public Optional<Transporte> obterPorId(Long id) {
        return transporteRepository.findById(id);
    }

    // Criar um novo transporte
    public Transporte criar(Transporte transporte) {
        return transporteRepository.save(transporte);
    }

    // Atualizar um transporte existente
    public Optional<Transporte> atualizar(Long id, Transporte transporteAtualizado) {
        return transporteRepository.findById(id).map(transporte -> {
            transporte.setTipo(transporteAtualizado.getTipo());
            transporte.setCapacidade(transporteAtualizado.getCapacidade());
            transporte.setDisponivel(transporteAtualizado.isDisponivel());
            return transporteRepository.save(transporte);
        });
    }

    // Excluir um transporte por ID
    public boolean excluir(Long id) {
        return transporteRepository.findById(id).map(transporte -> {
            transporteRepository.delete(transporte);
            return true;
        }).orElse(false);
    }
}