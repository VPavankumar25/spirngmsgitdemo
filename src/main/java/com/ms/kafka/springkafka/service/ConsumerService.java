package com.ms.kafka.springkafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import com.ms.kafka.springkafka.entity.StockQuote;
import com.ms.kafka.springkafka.store.MessageStore;
import com.ms.kafka.springkafka.util.JsonUtil;

public class ConsumerService {

	@Autowired
	private MessageStore store;
	
	@Autowired
	private JsonUtil jsonUtil;
	
	@KafkaListener(topics="${my.topic.name}")
	public void readData(String msg)
	{
		StockQuote obj=jsonUtil.fromJson(msg);
		store.create(obj);
	}
	
	
	
}
