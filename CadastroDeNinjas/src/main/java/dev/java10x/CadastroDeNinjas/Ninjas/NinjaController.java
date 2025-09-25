package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "essa e minha primeira mensagem";
    }


    // Adicionar Ninjas (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";

    }

    // Procurar Ninja por ID (CREATE)
    @GetMapping("/procurarID")
    public String procurarONinjaPorId(){
        return "Procurar Ninja por ID";
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarTodosOsNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar Ninja por ID (READ)
    @GetMapping("/ninjaID")
    public String mostrarNinjaPorId(){
        return "Mostrando ninja por id";
    }


    // Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterar")
    public String alteraNinjaPorId(){
        return "Alterar ninjas por id";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/delete")
    public String deletarNinja(){
        return "Ninja Deletado";
    }
}
