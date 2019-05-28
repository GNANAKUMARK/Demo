/**
 * 
 */
package com.ing.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ing.request.SaveIncidentRequest;
import com.ing.request.UpdateBreachRequest;
import com.ing.response.SaveIncidentResponse;
import com.ing.service.BreachService;

/**
 * @author user1
 *
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BreachController {
	
	@Autowired
	BreachService service;
	
	
	@RequestMapping(value="/complaince/incidents", method=RequestMethod.POST)
	public SaveIncidentResponse saveIncidents(@RequestBody SaveIncidentRequest request) {
		SaveIncidentResponse response = new SaveIncidentResponse(); 
		String msg = "Success";
		try {
			System.out.println("IN Controller saveIncidents:"+request);
			service.saveIncident(request);
		} catch(Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		response.setStatus(msg);
		return response;
		
	}
	
	@RequestMapping(value="/complaince/incidents", method=RequestMethod.PUT)
	public SaveIncidentResponse updateIncidents(UpdateBreachRequest request) {
		SaveIncidentResponse response = new SaveIncidentResponse(); 
		String msg = "Success";
		try {
			System.out.println("IN Controller saveIncidents:"+request);
			service.updateIncident(request);
		} catch(Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		response.setStatus(msg);
		return response;		
	}
	
	
	

}
