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
public class OrderItem {
	@Id //primary key
	@Column
    private Long id;
	
	@Column
    private Long orderId;
	
	@Column
    private Long itemId;
	
	@Column
    private int orderPrice;
	
	@Column
    private int count;
	
}
