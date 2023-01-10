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

public class Member2 {

	@Id //primary key
	@Column
    private Long id;
	
	@Column
    private String name;
	
	@Column
    private String city;
	
	@Column
    private String street;
	
	@Column
    private String zipcode;
}
