package com.graysonlyv.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.graysonlyv.demo.model.Restaurant;


public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
  List<Restaurant> findByNameContaining(String name);
  List<Restaurant> findByDescContaining(String keyword);
}