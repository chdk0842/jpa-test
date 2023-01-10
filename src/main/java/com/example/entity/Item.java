package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Item {
	@Id //primary key
	@Column
    private Long id;
	
	@Column
    private String name;
	
	@Column
    private int price;
	
	@Column
    private int stockquantity;
	
}
