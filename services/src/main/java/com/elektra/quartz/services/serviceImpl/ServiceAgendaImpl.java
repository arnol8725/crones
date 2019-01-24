package com.elektra.quartz.services.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.elektra.quartz.services.entity.Agenda;
import com.elektra.quartz.services.repository.RepositoryAgenda;
import com.elektra.quartz.services.service.ServiceAgenda;

public class ServiceAgendaImpl implements ServiceAgenda  {
	
	@Autowired
	@Qualifier("repositoryAgenda")
	public RepositoryAgenda repositoryAgenda;

	@Override
	public List<Agenda> detAgenda() {
		// TODO Auto-generated method stub
		return (List<Agenda>) repositoryAgenda.findAll();
	}

}
