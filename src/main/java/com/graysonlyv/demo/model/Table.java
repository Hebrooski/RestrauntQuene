package com.graysonlyv.demo.model;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "tables")
public class Table {
    @Id
    private int tableId;

    private int seats;
    private boolean available;
    //can be used with other tables, tables can be round or booth
    private boolean joinable;
    private Instant timePartySeated;
    
}
