package br.com.fiap.gestao_transporte_corporativo.controller;

import br.com.fiap.gestao_transporte_corporativo.model.Recompensa;
import br.com.fiap.gestao_transporte_corporativo.service.RecompensaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recompensas")
public class RecompensaController {

    @Autowired
    private RecompensaService recompensaService;

//    // Listar todas as recompensas
//    @GetMapping
//    public List<Recompensa> listarTodas() {
//        return recompensaService.listarTodas();
//    }
//
//    // Obter uma recompensa por ID
//    @GetMapping("/{id}")
//    public ResponseEntity<Recompensa> obterPorId(@PathVariable Long id) {
//        return recompensaService.obterPorId(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    // Criar uma nova recompensa
//    @PostMapping
//    public Recompensa criar(@RequestBody Recompensa recompensa) {
//        return recompensaService.criar(recompensa);
//    }
//
//    // Atualizar uma recompensa existente
//    @PutMapping("/{id}")
//    public ResponseEntity<Recompensa> atualizar(@PathVariable Long id, @RequestBody Recompensa recompensaAtualizada) {
//        return recompensaService.atualizar(id, recompensaAtualizada)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    // Excluir uma recompensa por ID
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> excluir(@PathVariable Long id) {
//        if (recompensaService.excluir(id)) {
//            return ResponseEntity.noContent().build();
//        }
//        return ResponseEntity.notFound().build();
//    }
}
