package com.proyect1.start.service.imple;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect1.start.ModelMapp;
import com.proyect1.start.dao.DataEntity;
import com.proyect1.start.entity.DaoDataEntity;
import com.proyect1.start.entity.DtoDaoEntity;
import com.proyect1.start.service.ServiceData;
@Service
public class ServiceImplData implements ServiceData {
	
	@Autowired
	DataEntity dataEntity;
	@Autowired
	ModelMapp mapper;
	@Override
	public DaoDataEntity saveData(DtoDaoEntity daoEntity) {
		
		DaoDataEntity daoDataEntity = mapper.map(daoEntity,DaoDataEntity.class);
		
		return dataEntity.save(daoDataEntity);
	}

}
