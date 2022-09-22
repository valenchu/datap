package com.proyect1.start.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.proyect1.start.entity.DaoDataEntity;
import com.proyect1.start.entity.DtoDaoEntity;
import com.proyect1.start.service.imple.ServiceImplData;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class feriadoController {
	@Autowired
	ServiceImplData serviceDataImpl;
	
	@GetMapping("consume")
	public ResponseEntity<?> consume(){
		Object ob = null;
		DtoDaoEntity[] data= null;
		DtoDaoEntity datae= null;
		try {
		String uri = "https://eldar-app.herokuapp.com/card/getAllCards";
		data  = new RestTemplate().getForObject(uri, DtoDaoEntity[].class);//Devuelve lista
	//	datae  = new RestTemplate().getForObject(uri, DtoDaoEntity.class);//DevuelveObjeto unico
		serviceDataImpl.saveData(Arrays.asList(data).get(0));
				
		}catch(Exception e){
			e.getMessage();
		}
		return new ResponseEntity<>(Arrays.asList(data).get(0),HttpStatus.CREATED);
		
	}
	

}
