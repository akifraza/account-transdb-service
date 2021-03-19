package com.myWebApp.accounttansdbservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myWebApp.accounttansdbservice.models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
	
	public Iterable<Transaction> findAllByAcnumber(String acnumber);

}
