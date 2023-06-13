package br.com.TerceiroPeriodo.controller;


import br.com.TerceiroPeriodo.model.Cidade;
import br.com.TerceiroPeriodo.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cidade")
public class CidadeController {
    @Autowired
    CidadeService cidadeService;

    @PostMapping()
    public ResponseEntity<Cidade> salvarCidade(@RequestBody Cidade cidade){
        Cidade response = cidadeService.salvar(cidade);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Cidade>> buscarTodos(){

        List<Cidade> response = cidadeService.buscarTodos();
        return ResponseEntity.ok(response);
    }
//    @GetMapping(path = "/{id}")
//    public ResponseEntity<Cidade> buscarPorId(@PathVariable Long id){
//
//        Optional<Cidade> response = cidadeService.buscarPorId(id);
//        if (response.isPresent()) {
//            return ResponseEntity.ok(response.get());
//        }
//        return ResponseEntity.notFound().build();
//    }
//
//    @GetMapping(path = "/nome/{nome}")
//    public ResponseEntity<List<Cidade>> buscarPorNome(@PathVariable String nome){
//
//        List<Cidade> response = cidadeService.buscarPorNome(nome);
//        if (response != null && !response.isEmpty()){
//            return ResponseEntity.ok(response);
//        }
//        return ResponseEntity.notFound().build();
//    }
//
//    @PutMapping()
//    public ResponseEntity<Cidade> update(@RequestBody Cidade cidade){
//
//        if (!cidadeService.buscarPorId(Cidade.getId()).isPresent()){
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(cidadeService.atualizar(Cidade));
//
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable Long id){
//        if (!cidadeService.buscarPorId(id).isPresent()){
//            return ResponseEntity.notFound().build();
//        }
//        cidadeService.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
}
