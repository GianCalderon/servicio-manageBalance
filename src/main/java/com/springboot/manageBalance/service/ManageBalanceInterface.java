package com.springboot.manageBalance.service;

import com.springboot.manageBalance.document.ManageBalance;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ManageBalanceInterface {

	  public Flux<ManageBalance> findAll();
	  
	  public Mono<ManageBalance> findById(String id);
	  
	  public Mono<ManageBalance> save(ManageBalance manageBalance);
	  
	  public Mono<ManageBalance> update(ManageBalance manageBalance,String id);
	  
	  public Mono<Void> delete(ManageBalance manageBalance);
	  
//	  public Mono<PersonalCredit> saveDto(ManageBalance manageBalance);


	
}
