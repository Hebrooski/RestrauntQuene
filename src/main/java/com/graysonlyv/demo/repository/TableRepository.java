package com.graysonlyv.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.graysonlyv.demo.model.Table;


public interface TableRepository extends MongoRepository<Table, String> {
  List<Table> findByAvailable(boolean available);
  List<Table> findByJoinable(boolean joinable);
  List<Table> findByAvailableAndJoinable(boolean available,boolean joinable);
  List<Table> findByNumOfSeats(int seats);
}