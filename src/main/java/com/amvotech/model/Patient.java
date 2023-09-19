package com.amvotech.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {
	@Id
	private Long patientId;
	private String name;
	private Date dateOfBirth;
	private String contactDetails;

}