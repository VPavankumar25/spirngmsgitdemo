package com.ms.kafka.springkafka.util;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ms.kafka.springkafka.entity.StockQuote;

@Component
public class JsonUtil {
	
	public String toJson(StockQuote quote)
	{
		try {
			return new ObjectMapper().writeValueAsString(quote);
		}
		catch(JsonProcessingException e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	
	public StockQuote fromJson(String json)
	{
		try {
			return new ObjectMapper().readValue(json,StockQuote.class);
		}
		catch(JsonMappingException e)
		{
			e.printStackTrace();
		}
		catch(JsonProcessingException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
}
