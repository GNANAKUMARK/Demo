package com.ing.service;

import com.ing.entity.Breach;
import com.ing.request.SaveIncidentRequest;
import com.ing.request.UpdateBreachRequest;

public interface BreachService {
	public Breach saveIncident(SaveIncidentRequest request);
	public void updateIncident(UpdateBreachRequest request);
}
