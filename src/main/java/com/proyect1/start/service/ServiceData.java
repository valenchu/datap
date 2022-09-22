package com.proyect1.start.service;

import org.springframework.stereotype.Component;

import com.proyect1.start.entity.DaoDataEntity;
import com.proyect1.start.entity.DtoDaoEntity;
@Component
public interface ServiceData {
	
	public DaoDataEntity saveData(DtoDaoEntity daoEntity);
}
