package com.springboot.manageBalance.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.manageBalance.client.ManageOperationClient;
import com.springboot.manageBalance.controller.ManageBalanceController;
import com.springboot.manageBalance.document.ManageBalance;
import com.springboot.manageBalance.repo.ManageBalanceRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ManageBalanceImpl implements ManageBalanceInterface {

	private static final Logger LOGGER = LoggerFactory.getLogger(ManageBalanceImpl.class);
	
	@Autowired
	ManageBalanceRepo repo;
	
	@Autowired
	ManageOperationClient client;
	
	
	
	@Override
	public Flux<ManageBalance> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Mono<ManageBalance> findById(String id) {
		
		LOGGER.info("NUMERO DE CUENTA :--->"+id);
		
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Mono<ManageBalance> save(ManageBalance manageBalance) {
		
		return repo.save(manageBalance);
	}

	@Override
	public Mono<ManageBalance> update(ManageBalance manageBalance, String id) {
		// TODO Auto-generated method stub
//	    return repo.findById(id).flatMap(p -> {
//
//	    	p.setCreditAmount(personalCredit.getCreditAmount());
//	        p.setDateCredit(personalCredit.getDateCredit());
//	        p.setTea(personalCredit.getTea());
//	        
//	        return repo.save(p);
//
//	      });
		return null;
	}

	@Override
	public Mono<Void> delete(ManageBalance manageBalance) {
		// TODO Auto-generated method stub
		return repo.delete(manageBalance);
	}

}
