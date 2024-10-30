package com.projeto.av2_dac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.av2_dac.model.Carro;
import com.projeto.av2_dac.repository.CarroRepository;

@Service
public class CarroService {
	private final CarroRepository repository;
	
	@Autowired
    public CarroService(CarroRepository repository) {
        this.repository = repository;
    }
	
	public List<Carro> listarTodos() {
        return repository.findAll();
	}
	
	
}
