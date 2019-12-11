package com.springboot.manageBalance.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.springboot.manageBalance.document.ManageBalance;

public interface ManageBalanceRepo extends ReactiveMongoRepository<ManageBalance, String> {

}
