package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//o @Entity transforma uma classe em uma entidade do banco de dados
//JPA = java persistence API
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    //@ManyToOne - um ninja nao pode realizar varias missoes ao mesmo tempo
    @ManyToOne
    @JoinColumn(name = "missoes_id")//foreina key ou chave estrangeira
    private MissoesModel missoes;

}
