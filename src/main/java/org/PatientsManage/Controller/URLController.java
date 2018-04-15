package org.PatientsManage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class URLController {

    @RequestMapping(value = "EmergencyCare", method = RequestMethod.GET)
    public void registeredPatient() {

    }

    @RequestMapping(value = "/Aboutus", method = RequestMethod.GET)
    public ModelAndView aboutUs() {
	
	return new ModelAndView("about-us");
	
    }
    @RequestMapping(value = "/MedicalCounselling", method = RequestMethod.GET)
    public ModelAndView medicalCounselling() {
	
	return new ModelAndView("medical-counseling");
	
    }
    @RequestMapping(value = "/MedicalResearch", method = RequestMethod.GET)
    public ModelAndView medicalResearch() {
	
	return new ModelAndView("medical-research");
	
    }
    @RequestMapping(value = "/BloodBank", method = RequestMethod.GET)
    public ModelAndView BloodBank() {
	
	return new ModelAndView("blood-bank");
	
    }
    @RequestMapping(value = "/Contact", method = RequestMethod.GET)
    public ModelAndView Contact() {
	
	return new ModelAndView("contact");
	
    }
    
}