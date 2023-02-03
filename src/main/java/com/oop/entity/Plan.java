package com.oop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Plan {
	@Id
	private Integer caseNumber;
	private String planName;
	

}
