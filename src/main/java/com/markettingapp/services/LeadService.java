package com.markettingapp.services;

import java.util.List;

import com.markettingapp.entities.Lead;



public interface LeadService {

	public void saveLead(Lead lead); 
	public List<Lead> findAllLeads();
	public void deleteLead(long id);
	public Lead findLeadById(long id);
	

}
