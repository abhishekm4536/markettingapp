package com.markettingapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceimpl implements EmailService {

	@Autowired
	JavaMailSender javaMailSender;
	
	@Override
	public void sendEmail(String to, String Subject, String message) {
		// TODO Auto-generated method stub
		
		SimpleMailMessage m = new SimpleMailMessage();
		m.setTo(to);
		m.setSubject(Subject);
		m.setText(message);
		
		javaMailSender.send(m);
	}

}
