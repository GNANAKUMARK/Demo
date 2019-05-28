package com.ing.service;

import com.ing.entity.Breach;
import com.ing.request.SaveIncidentRequest;

public interface BreachService {
	public Breach saveIncident(SaveIncidentRequest request);
}
