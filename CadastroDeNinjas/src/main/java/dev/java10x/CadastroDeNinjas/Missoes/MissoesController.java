package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;
    public MissoesController(MissoesService missoesService){
        this.missoesService = missoesService;
    }

    // Post -- Mandar requisição para criar as missões
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao){
        return missoesService.criarMissoes(missao);
    }

    // Get -- mandar uma requisição para visualizar as missões
    @GetMapping("/listar/{id}")
    public MissoesModel missaoPorID(@PathVariable Long id){
        return missoesService.missaoPorId(id);
    }

    @GetMapping("/listar")
    public List<MissoesModel> listartodasMissoes(){
        return missoesService.listarMissoes();
    }

    // Put -- mandar uma requisição para alterar as missões
    @PutMapping("/alterar")
    public String alteraMissaoPorID(){
        return "altera Missao";
    }

    // Delete -- mandar uma requisição para deletar as missões
    @DeleteMapping("/delete/{id}")
    public void deletarMissao(@PathVariable Long id){
        missoesService.deletarMissao(id);
    }

}
