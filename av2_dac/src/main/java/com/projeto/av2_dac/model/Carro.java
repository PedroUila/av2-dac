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
    
    @Column(nullable = false, length = 100)
    @NotEmpty
    @NotNull
    private String cor;
    
    @Column(nullable = false, length = 1)
    @NotEmpty
    @NotNull
    private int portas;

    @Column(nullable = false, unique = true, length = 7)
    @NotEmpty
    @NotNull
    private String placa;
    
}   


