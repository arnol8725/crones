package com.elektra.quartz.webs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.elektra.quartz.services.entity.*;


@SpringBootApplication
public class WebAplicacion {
	public static void main(String[] args) {
		//Agenda a = new Agenda();
		SpringApplication.run(WebAplicacion.class, args);
	}
}

