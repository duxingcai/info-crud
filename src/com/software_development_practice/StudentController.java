package com.software_development_practice;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	 @RequestMapping(value="/findUser",method = RequestMethod.POST)  
	    public String getStudent(){      
	        return "findStudent";  
	    }  
	    @RequestMapping("/")  
	    public String getIndex(){     
	        return "index";  
	    }  
}
