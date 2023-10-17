package com.example.testeback;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class PessoaController {
    @PostMapping
    public void cadastrarPessos(@RequestBody Pessoa pessoa){
        System.out.println("Cadastrou");
        System.out.println(pessoa);
    }
    @GetMapping
    public Pessoa retornaPessoa(){
        return new Pessoa("ANA",12,"udi");
    }

}
