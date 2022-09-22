package com.proyect1.start.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect1.start.entity.DaoDataEntity;
@Repository
public interface DataEntity extends CrudRepository<DaoDataEntity,Long> {

}
