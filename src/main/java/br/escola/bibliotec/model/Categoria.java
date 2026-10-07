package br.escola.bibliotec.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 60)
    @NotBlank(message = "Nome é obrigatório")
    @Column(nullable = false)
    private String nome;

    @Size(max = 255)
    private String descricao;
}
