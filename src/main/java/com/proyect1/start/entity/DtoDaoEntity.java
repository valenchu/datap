package com.proyect1.start.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoDaoEntity {
	
	private String marca;
	private String number;
	private String name;
	private String lastName;
	private String month;
	private String year;
	private BigDecimal importeCard;


}
