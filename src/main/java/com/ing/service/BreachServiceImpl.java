package com.ing.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.dao.BreachDAO;
import com.ing.entity.Breach;
import com.ing.repository.SearchRepoIntf;
import com.ing.request.SaveIncidentRequest;
import com.ing.request.UpdateBreachRequest;
import com.ing.utility.UtilConstants;

@Service
public class BreachServiceImpl implements BreachService	 	 {
	
	
	@Autowired
	BreachDAO repo;
	
	@Autowired
	SearchRepoIntf searchRepoIntf;
	
	@Override
	@Transactional
	public Breach saveIncident(SaveIncidentRequest request) {
		
		Breach breach = new Breach();
		try {
			BeanUtils.copyProperties(breach, request);
			breach.setStatus(UtilConstants.STATUS_CREATED);
			breach = repo.save(breach);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return breach;
	}

	@Override
	@Transactional
	public void updateIncident(UpdateBreachRequest request) {
		// TODO Auto-generated method stub
		 repo.updateIncident(request.getId(), request.getStatus(), request.getUpdatedBy());
		

	}
	
	@Override
	 public List<Breach> searchIncident() {
	  // TODO Auto-generated method stub
	  return searchRepoIntf.findAllIncidents();
	 }

}
