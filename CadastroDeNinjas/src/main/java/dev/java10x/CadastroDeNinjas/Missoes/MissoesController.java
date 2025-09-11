package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    // Post -- Mandar requisição para criar as missões
    @PostMapping("/criar")
    public String criarMissao(){
        return "missao criada";
    }

    // Get -- mandar uma requisição para visualizar as missões
    @GetMapping("/missaoID")
    public String missaoPorID(){
        return "procura missao por ID";
    }

    @GetMapping("/listar")
    public String listarMissoes(){
        return "visualiza todas as missoes";
    }

    // Put -- mandar uma requisição para alterar as missões
    @PutMapping("/alterar")
    public String alteraMissaoPorID(){
        return "altera Missao";
    }

    // Delete -- mandar uma requisição para deletar as missões
    @DeleteMapping("/delete")
    public String deletarMissao(){
        return "missao deletada";
    }

}
