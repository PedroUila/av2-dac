package com.projeto.av2_dac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.av2_dac.model.Carro;
import com.projeto.av2_dac.service.CarroService;

@RestController
@RequestMapping("/api/carro")
public class CarroController {
	private final CarroService service;

    public CarroController(CarroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Carro> listar() {
        return service.listarTodos();
    }
    
    @PostMapping
    public Carro salvar(Carro carro) {
    	return service.salvar(carro);
    }
    
    @DeleteMapping("{id}")
    public void excluir(Integer idCarro) {
    	service.excluir(idCarro);
    }
}
