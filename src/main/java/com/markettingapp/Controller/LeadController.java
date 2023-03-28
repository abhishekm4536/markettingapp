package com.markettingapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.markettingapp.DTO.LeadData;
import com.markettingapp.entities.Lead;
import com.markettingapp.services.LeadService;
import com.markettingapp.util.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	@Autowired
	private EmailService emailService;
	//http://localhost:8080/viewCreateLead
	@RequestMapping("/viewCreateLead")
	public String ViewCreateLeafForm() {
		return "Create_Registration";
	}
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead ,ModelMap model) {
	leadService.saveLead(lead);
	model.addAttribute("msg", "record is saved");
		return "Create_Registration";
	}
//	@RequestMapping("/saveLead")
//	public String saveOneLead(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,@RequestParam("email") String email,@RequestParam("mobile") Long mobile) {
//		Lead l = new Lead();
//		l.setFirstName(firstName);
//		l.setLastName(lastName);
//		l.setEmail(email);
//		l.setMobile(mobile);
//		leadService.saveLead(l);
//		return "Create_Registration";
//	}

//	@RequestMapping("/saveLead")
//	public String saveOneLead(LeadData data,ModelMap model) {
//		Lead l=  new Lead();
//		l.setFirstName(data.getFirstName());
//		l.setLastName(data.getLastName());
//		l.setEmail(data.getEmail());
//		l.setMobile(data.getMobile());
//		
//		emailService.sendEmail(data.getEmail(), "Test", "welcome");
//		leadService.saveLead(l);
//		model.addAttribute("msg", "record is saved");
//		return "Create_Registration";
//	}
	@RequestMapping("/listleads")
	public String getAllLeads(Model model) {
		List<Lead> leads = leadService.findAllLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
	}
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id")long id, Model model) {
		leadService.deleteLead(id);
		List<Lead> leads = leadService.findAllLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
	}
	@RequestMapping("/update")	
	public String updateOneLead(@RequestParam("id")long id,Model model) {	
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead", lead);
		return "update_lead";
	}
	@RequestMapping(value ="/updateLead", method = RequestMethod.POST)
	public String updateOneLead(@ModelAttribute("lead") Lead lead ,ModelMap model) {
	leadService.saveLead(lead);
	List<Lead> leads = leadService.findAllLeads();
	model.addAttribute("leads", leads);
	return "list_leads";
	}
	
}
