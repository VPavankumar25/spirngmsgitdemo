package com.ms.kafka.springkafka.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.kafka.springkafka.entity.StockQuote;

public interface StockRepository extends JpaRepository<StockQuote,Long> {

}
