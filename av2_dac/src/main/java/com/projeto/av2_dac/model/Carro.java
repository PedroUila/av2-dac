package com.projeto.av2_dac.model;

import lombok.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;

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
    
    @Column(nullable = false)
    @NotEmpty
    @NotNull
    private Integer qtdPortas;

    @Column(nullable = false, unique = true, length = 11)
    @NotEmpty
    @NotNull
    private String placa;
}   

