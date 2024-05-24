package com.banking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.model.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, Integer> {
	
	Account findByCustomerId(int customerId);
	Account findByCardNo(String cardNo);

}
