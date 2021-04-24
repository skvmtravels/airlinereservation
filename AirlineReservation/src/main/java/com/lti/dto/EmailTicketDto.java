package com.lti.dto;

import org.springframework.web.multipart.MultipartFile;

public class EmailTicketDto {
	
	private MultipartFile emailTicket;

	public MultipartFile getEmailTicket() {
		return emailTicket;
	}

	public void setEmailTicket(MultipartFile emailTicket) {
		this.emailTicket = emailTicket;
	}
	
	
	
	

}
