package com.api.livro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.livro.repositories.EstanteRepository;
import com.api.livro.entities.Estante;

@RestController
@RequestMapping(value ="/api")
public class EstanteResources {

    @Autowired
    EstanteRepository estanteRepository;

    @GetMapping("/estantes")
    public List<Estante> findAll() {
        List<Estante> result = estanteRepository.findAll();
        return result;
    }
    @GetMapping("/estantes/{id}")
    public Estante listaEstanteUnico(@PathVariable(value = "id") long id) {
        return estanteRepository.findById(id);
    }

    @PostMapping("/estante")
    public Estante salvaEstante(@RequestBody Estante estante) {
        return estanteRepository.save(estante);
    }

    @DeleteMapping("/estante")
    public void deletaEstante(@RequestBody Estante estante) {
        estanteRepository.delete(estante);
    }

    @PutMapping("/estante")
    public Estante atualizaEstante(@RequestBody Estante estante) {
       return estanteRepository.save(estante);
    }
}
