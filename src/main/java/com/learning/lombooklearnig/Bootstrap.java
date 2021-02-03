package com.learning.lombooklearnig;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.lombooklearnig.model.Description;
import com.learning.lombooklearnig.model.Order;
import com.learning.lombooklearnig.repository.OrderRepository;

@Component
public class Bootstrap implements CommandLineRunner{
	
	@Autowired
	private OrderRepository orderRepository;
	
	
	@Transactional
	public void run(String... args) {
		System.out.println("uhsghoisphdgjsiap'ighdneursbne'iarsghnoouergherpsogjneirgbne'prg");
		Order newOrder = new Order();
		Order newOrder2 = new Order();
		
		
		
		newOrder = Order.builder().name("398").address("uhbkgsdf").build();
		newOrder.addDescriptions(new Description());
		newOrder.addDescriptions(new Description());
		
		
		orderRepository.save(newOrder);
		
		
		
		newOrder2 = Order.builder().name("397").address("uhbkgsdf").build();
		newOrder2.addDescriptions(new Description());
		newOrder2.addDescriptions(new Description());
		orderRepository.save(newOrder2);
		newOrder = null;
		newOrder2 = null;
		
		
		
		System.out.println(orderRepository.findById(1L).get());
		System.out.println(orderRepository.findById(2L).get());
	}

}
