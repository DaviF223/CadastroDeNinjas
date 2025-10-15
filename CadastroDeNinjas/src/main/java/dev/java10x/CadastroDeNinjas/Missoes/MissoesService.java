package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository){
        this.missoesRepository = missoesRepository;
    }

    //LISTAR missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }
    //LISTAR missoes por id
    public MissoesModel missaoPorId(Long id){
        Optional<MissoesModel> missaoPorId = missoesRepository.findById(id);
        return missaoPorId.orElse(null);
    }

    //CRIA missoes
    public MissoesModel criarMissoes(MissoesModel missao){
        return missoesRepository.save(missao);
    }

    //DELETAR missoes
    public void deletarMissao(Long id){
        missoesRepository.deleteById(id);
    }
}
