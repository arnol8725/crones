package com.elektra.quartz.webs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.elektra.quartz.services.entity.*;
import com.elektra.quartz.services.service.ServiceAgenda;
import com.elektra.quartz.services.serviceImpl.ServiceAgendaImpl;


@SpringBootApplication
public class WebAplicacion {
	public static void main(String[] args) {
		//Agenda a = new Agenda();
		SpringApplication.run(WebAplicacion.class, args);
		
		ServiceAgendaImpl ser = new ServiceAgendaImpl();
		//ser.detAgenda();
	}
}

