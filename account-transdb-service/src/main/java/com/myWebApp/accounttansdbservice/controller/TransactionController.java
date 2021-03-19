package com.myWebApp.accounttansdbservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myWebApp.accounttansdbservice.models.Transaction;
import com.myWebApp.accounttansdbservice.repositories.TransactionRepository;

@RestController
@RequestMapping ("/cbs")
public class TransactionController {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@GetMapping ("/trans/{acnumber}")
	public Iterable<Transaction> gettrans (@PathVariable("acnumber") String acnumber)
	{
		return transactionRepository.findAllByAcnumber(acnumber);
	}

}
