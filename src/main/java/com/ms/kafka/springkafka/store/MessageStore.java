package com.ms.kafka.springkafka.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ms.kafka.springkafka.entity.StockQuote;
import com.ms.kafka.springkafka.repo.StockRepository;

public class MessageStore {
	
	@Autowired
	private StockRepository repo;
	
	public void create(StockQuote quote)
	{
		repo.save(quote);
	}
	
	public List<StockQuote> fetchAll()
	{
		return repo.findAll();
	}

}
