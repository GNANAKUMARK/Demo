/**
 * 
 */
package com.ing.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.ing.entity.Breach;
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
	public SaveIncidentResponse updateIncidents(@RequestBody UpdateBreachRequest request) {
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
	
	
	 @RequestMapping(value="/complaince/search", method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<Breach> searchIncidents(HttpServletResponse responseSearch) throws IOException {
	  //SaveIncidentResponse response = new SaveIncidentResponse(); 
	  Gson gson = new Gson();
	  String msg = "Success";
	  List<Breach> list = new ArrayList<Breach>();
	  try {
	   //service.saveIncident(request);
	   list =service.searchIncident();
	   System.out.println(list.size());
	  } catch(Exception e) {
	   e.printStackTrace();
	   msg = "Failure";
	  }
	  //String employeeJsonString = new Gson().toJson(list);
	//  String userJsonString = gson.toJson(list);
		/*
		 * PrintWriter out = responseSearch.getWriter();
		 * responseSearch.setContentType("application/json");
		 * responseSearch.setCharacterEncoding("UTF-8"); out.print(list); out.flush();
		 */
	   
	  //response.setStatus(msg);
	  return list;
	  
	 }

	  
	 }




