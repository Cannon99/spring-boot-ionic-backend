package com.example.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.example.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Date dataDeVencimento;
	private Date dataDePagamento;
	
	public PagamentoBoleto() {
		
	}
	
	public PagamentoBoleto(Integer id, EstadoPagamento estado, Pedido pedido,
			Date dataDeVencimento, Date dataDePagamento) {
		super(id, estado, pedido);
		this.dataDePagamento = dataDePagamento;
		this.dataDeVencimento = dataDeVencimento;
	}

	public Date getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(Date dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}

	public Date getDataDePagamento() {
		return dataDePagamento;
	}

	public void setDataDePagamento(Date dataDePagamento) {
		this.dataDePagamento = dataDePagamento;
	}
	
	

}
