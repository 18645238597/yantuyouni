/**
 * 
 */
package com.yantu.service.medioservice;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yantu.dao.medio.MedioMapper;
import com.yantu.pojo.Medio;

/**
 * 2017-9-20下午8:21:45
 * 
 */
@Service
public class MedioServiceImpl implements MedioService {
	@Resource
	MedioMapper medioMapper;

	public int saveMedio(Medio medio) {
		return medioMapper.saveMedio(medio);
	}

	public Medio selectMedioById(Integer id) {
		return medioMapper.selectMedioById(id);
	}

}
