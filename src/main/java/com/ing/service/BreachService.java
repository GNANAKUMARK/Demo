package com.ing.service;

import java.util.List;

import com.ing.entity.Breach;
import com.ing.request.SaveIncidentRequest;
import com.ing.request.UpdateBreachRequest;

public interface BreachService {
	public Breach saveIncident(SaveIncidentRequest request);
	public void updateIncident(UpdateBreachRequest request);
	public List<Breach> searchIncident();
}
