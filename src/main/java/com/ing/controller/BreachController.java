/**
 * 
 */
package com.ing.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ing.request.SaveIncidentRequest;
import com.ing.response.SaveIncidentResponse;
import com.ing.service.BreachService;

/**
 * @author user1
 *
 */
@Controller
public class BreachController {
	
	@Autowired
	BreachService service;
	
	
	@RequestMapping(value="/complaince/incidents", method=RequestMethod.POST)
	public SaveIncidentResponse saveIncidents(SaveIncidentRequest request) {
		SaveIncidentResponse response = new SaveIncidentResponse(); 
		String msg = "Success";
		try {
			service.saveIncident(request);
		} catch(Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		response.setStatus(msg);
		return response;
		
	}
	
	

}
