package com.example.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.example.cursomc.domain.Cliente;
import com.example.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail (Pedido obj);
	
	void sendEmail (SimpleMailMessage sm);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);

	
}
