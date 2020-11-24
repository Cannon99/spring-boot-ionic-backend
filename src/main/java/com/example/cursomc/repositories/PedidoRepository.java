package com.example.cursomc.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.cursomc.domain.Cliente;
import com.example.cursomc.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Integer> {
	
	@Transactional(readOnly=true)
	Page<Pedido> findByCliente(Cliente cli, Pageable pageRequest);
	
	@Transactional(readOnly=true)
	Optional<Pedido> findById(Integer id);
	
}
