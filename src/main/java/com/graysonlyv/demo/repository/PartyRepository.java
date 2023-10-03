package com.graysonlyv.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.graysonlyv.demo.model.Party;


public interface PartyRepository extends MongoRepository<Party, String> {
  List<Party> findByPartySize(int size);
}