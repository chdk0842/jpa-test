package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.constant.OrderStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Orders {
	@Id //primary key
	@Column
    private Long id;
	
	@Column
    private Long memberld;
	
	@Column
    private Date orderDate;
	
	@Column
    private OrderStatus Status;
	
}
