package com.oop.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EducationDetails {
	@Id
	private Integer caseNumber;
	private String highestDegree;
	private LocalDate graduationYear;
	private String universityName;

}
