package com.projeto.av2_dac.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarro;
    
    @Column(nullable = false, length = 50)
    @NotEmpty
    @NotNull
    private String nome;
    
    @Column(nullable = false, length = 50)
    @NotNull
    private Double preco;
    
    @Column(nullable = false, length = 4)
    @NotNull
    private Integer ano;
    
    @Column(nullable = false, length = 50)
    @NotEmpty
    @NotNull
    private String marca;
    
    @Column(nullable = false, length = 50)
    @NotEmpty
    @NotNull
    private String cidade;
    
    @Column(nullable = false, unique = true, length = 7)
    @NotEmpty
    @NotNull
    private String placa;
    
}   


