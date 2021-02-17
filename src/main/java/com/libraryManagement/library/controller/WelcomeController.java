package com.libraryManagement.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.libraryManagement.library.bean.IssueBook;
import com.libraryManagement.library.bean.Student;
import com.libraryManagement.library.bean.User;
import com.libraryManagement.library.service.LibraryService;


@RestController
public class WelcomeController {
	
	@Autowired
	LibraryService libraryService;
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mav=new ModelAndView("home");
	 return mav;
	}

	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public ModelAndView adminLogin() {
		ModelAndView mav=new ModelAndView("login");
	 return mav;
	}

	
	@RequestMapping(path="/login",method=RequestMethod.POST)
	public ModelAndView showAdminLogin(@RequestParam("uname") String name,@RequestParam("password") String password,@RequestParam String flag) {
		ModelAndView mav=new ModelAndView();
				
		User user=libraryService.validateLogin(name,password,flag);
		if(user!=null) {
	        try {
	          if(!user.getFlag().equalsIgnoreCase("Admin")) {
		  			 mav.setViewName("libsection");
	  				
	  		}else {
	  			mav.setViewName("adminsection");
	  		}
	          }catch(Exception e) {
	  			e.printStackTrace();
	  		}
		}
		
				return mav;
	}
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public ModelAndView student() {
		ModelAndView mav=new ModelAndView("student");
	 return mav;
	}

	@RequestMapping(value="/studentpage",method=RequestMethod.POST)
	public ModelAndView studentpag(@RequestParam("student_name") String student_name,
			@RequestParam("email") String email_id,
			@RequestParam("contact") int contact,
			@RequestParam("dob") String dob,
			@RequestParam("age") int age,
			@RequestParam("flag") String flag,
	        @RequestParam("gender") String gender){	
	
	ModelAndView mav=new ModelAndView();
	Student student=new Student(student_name,email_id, contact,age,flag,gender,dob);
	int i=libraryService.saveStudent(student);
	if(i>0) {
          mav.setViewName("student");
	}
	return mav;
	}
	
}
	



