package com.graysonlyv.demo.model;

import java.time.Instant;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "parties")
public class Party {
    @Id
    private int partyId;

    //if trying to optimize, byte or short could go here
    private int size;
    private Instant created = Instant.now();
    

    
}
