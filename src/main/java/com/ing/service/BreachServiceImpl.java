package com.ing.service;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.dao.BreachDAO;
import com.ing.entity.Breach;
import com.ing.request.SaveIncidentRequest;

@Service
public class BreachServiceImpl implements BreachService	 	 {
	@Autowired
	BreachDAO repo;
	
	@Override
	public Breach saveIncident(SaveIncidentRequest request) {
		
		Breach breach = new Breach();
		try {
			BeanUtils.copyProperties(breach, request);
			breach = repo.save(breach);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
		return breach;
	}

}
