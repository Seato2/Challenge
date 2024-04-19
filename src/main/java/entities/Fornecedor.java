package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fornecedor")
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cnpj;

    private String nome;
    private String endereco;
    private long telefone;
    private String email;
    private OffsetDateTime data_cadastro;
    private boolean observacao;

    @OneToMany(mappedBy = "fornecedor")
    private List<Produto> produtos;

}
