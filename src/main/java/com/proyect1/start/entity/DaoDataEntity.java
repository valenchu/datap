package com.proyect1.start.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
 @AllArgsConstructor
 @NoArgsConstructor
@Entity
@Table(name = "data")
public class DaoDataEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idCard;
		private String marca;
		private String number;
		private String name;
		private String lastName;
		private String month;
		private String year;
		private BigDecimal importeCard;

	
}
