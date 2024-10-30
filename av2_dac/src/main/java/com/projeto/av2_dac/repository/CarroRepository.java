package com.projeto.av2_dac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projeto.av2_dac.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Integer> {
	@Query(value="SELECT * FROM carro ORDER BY idCarro ASC LIMIT 10", nativeQuery = true)
	public List<Carro> buscarPrimeirosDezCarrosPorId();
	
	@Query(value="SELECT * FROM carro c where c.idCarro = :idCarro ", nativeQuery = true)
	public String retornarDezPrimeirosCarrosPorId(@Param("idCarro") Integer idCarro);
}
