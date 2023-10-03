package com.graysonlyv.demo.model;

import java.time.LocalTime;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurants")
public class Restaurant {
    @Id
    private String id;

    private String name;
    private String description;
    ArrayList<Party> parties;
    ArrayList<Table> tables;
    private LocalTime openTime;
    private LocalTime closingTime;
    private int maxPartySize;
    private int avgWaitTime;
    private int currentWait;

    //avg wait time will be calulated as 
    //avgWaitTime + 5*(party.size-4)

}
