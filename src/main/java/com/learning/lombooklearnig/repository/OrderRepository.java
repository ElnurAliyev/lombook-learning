package com.learning.lombooklearnig.repository;

import org.springframework.data.repository.CrudRepository;

import com.learning.lombooklearnig.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
