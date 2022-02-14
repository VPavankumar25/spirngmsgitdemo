package com.ms.kafka.springkafka.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ms.kafka.springkafka.entity.StockQuote;
import com.ms.kafka.springkafka.service.ProducerService;
import com.ms.kafka.springkafka.store.MessageStore;

public class MyKafkaRestController {
	
	@Autowired
	private MessageStore msgStore;
	
	@Autowired
	private ProducerService service;
	
	
	@GetMapping("/send")
	public ResponseEntity<String> send(@RequestParam String code,@RequestParam Double up)
	{
		StockQuote quote =new StockQuote();
		quote.setCode(code);
		quote.setUnitPrice(up);
		quote.setDateTime(new Date());
		service.sendData(quote);
		return ResponseEntity.ok("Data is sent");
	}
	@GetMapping("/all")
	public ResponseEntity<List<StockQuote>> fetchData()
	{
		List<StockQuote> list=msgStore.fetchAll();
		return ResponseEntity.ok(list);
	}

}
