package com.example.matheusgoncalvesac2.controle;

import com.example.matheusgoncalvesac2.dominio.Lutador;
import com.example.matheusgoncalvesac2.repositorio.LutadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/lutadores")

public class LutadorController {
    @Autowired
    LutadorRepository repository;


    @GetMapping()
    public ResponseEntity GetLutadores()
    {
        if (repository.findAllByOrderByForcaGolpeDesc().size()==0)
        {
            return ResponseEntity.status(204).build();
        }

        else
            {
                return ResponseEntity.status(200).body(repository.findAllByOrderByForcaGolpeDesc());
            }


    }

    @PostMapping()
    public ResponseEntity PostLutadores(@RequestBody @Valid Lutador novoLutador)
    {
        repository.save(novoLutador);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/contagem-vivos")
    public ResponseEntity GetLutadoresVivo()
    {
        int vivos = repository.findAllByVivoTrue().size();
        return ResponseEntity.status(200).body(vivos);
    }


    @GetMapping("/mortos")
    public ResponseEntity GetLutadoresMortos()
    {

        return ResponseEntity.status(200).body(repository.findAllByVivoFalse());
    }








}
