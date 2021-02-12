package com.curso.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.curso.cursomc.domain.Cliente;
import com.curso.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
	
}
