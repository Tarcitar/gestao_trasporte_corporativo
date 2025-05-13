package br.com.fiap.gestao_transporte_corporativo.controller;

import br.com.fiap.gestao_transporte_corporativo.model.Impacto;
import br.com.fiap.gestao_transporte_corporativo.service.ImpactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/impactos")
public class ImpactoController {

    @Autowired
    private ImpactoService impactoService;

//    // Listar todos os impactos
//    @GetMapping
//    public List<Impacto> listarTodos() {
//        return impactoService.listarTodos();
//    }
//
//    // Obter um impacto por ID
//    @GetMapping("/{id}")
//    public ResponseEntity<Impacto> obterPorId(@PathVariable Long id) {
//        return impactoService.obterPorId(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    // Criar um novo impacto
//    @PostMapping
//    public Impacto criar(@RequestBody Impacto impacto) {
//        return impactoService.criar(impacto);
//    }
//
//    // Atualizar um impacto existente
//    @PutMapping("/{id}")
//    public ResponseEntity<Impacto> atualizar(@PathVariable Long id, @RequestBody Impacto impactoAtualizado) {
//        return impactoService.atualizar(id, impactoAtualizado)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    // Excluir um impacto por ID
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> excluir(@PathVariable Long id) {
//        if (impactoService.excluir(id)) {
//            return ResponseEntity.noContent().build();
//        }
//        return ResponseEntity.notFound().build();
//    }
}