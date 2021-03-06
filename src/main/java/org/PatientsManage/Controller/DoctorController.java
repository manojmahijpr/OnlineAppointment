package org.PatientsManage.Controller;


import org.PatientsManage.Doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DoctorController {

    
    @Autowired
    private DoctorService doctorService;
   
    public void getAllDoctorList() {
	
    }
    
    public void showDoctorData() {
	
    }
    @RequestMapping(value="/changeStatus" , method=RequestMethod.POST)
    public ModelAndView changeStatus(	@RequestParam("Status") String status,
	    			@RequestParam("username") String username) {
	
	doctorService.changeStatus(status,username);
	return new ModelAndView("StatusChanged");
    }
    
}
