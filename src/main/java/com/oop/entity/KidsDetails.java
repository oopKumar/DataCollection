package com.oop.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class KidsDetails {
	private Integer caseNumber;
	private String kidName;
	private Integer kidAge;
	private String kidSsn;

}
