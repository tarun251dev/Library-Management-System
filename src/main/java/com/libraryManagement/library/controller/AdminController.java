package com.libraryManagement.library.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.libraryManagement.library.bean.AddLibrarian;
import com.libraryManagement.library.service.AdminService;


@RestController
public class AdminController {
	@Autowired
	AdminService adminService;
	    

	
	
	
	
	
	@RequestMapping(path="/adminsection")
	public ModelAndView showSection() {
		ModelAndView mav=new ModelAndView("adminsection");
		return mav;
	}
	
	
	 @RequestMapping(value="/Addlibrarian") public ModelAndView showaddlib() {
	 ModelAndView mav=new ModelAndView("Addlibrarian"); return mav; }
	
	
	
	@RequestMapping(value="/Addlibdata",method=RequestMethod.POST)
	public ModelAndView lib(@RequestParam("name") String name,
			@RequestParam("password") String password,
			@RequestParam("email") String email,
			@RequestParam("address") String address,
			@RequestParam("city") String city,
			@RequestParam("contact") String contact,
			@RequestParam("flag") String flag) {
		ModelAndView mav=new ModelAndView();
		
		
		AddLibrarian addLibrarian=new AddLibrarian(name, password, email, address, city, contact,flag);
		int i= adminService.saveLibrarian(addLibrarian);
		if(i>0) {
	          mav.setViewName("addsuccess");
		}
		else
		{
	          mav.setViewName("forgetpassword");
	          }
		return mav;
	}
	
	
	
	
	@RequestMapping(value="/deletelib")
	public ModelAndView dellib() {
		ModelAndView mav=new ModelAndView("deletelib");
		return mav;
	}
	
	@RequestMapping(value="/deletelibsuccess",method=RequestMethod.POST)
	public ModelAndView dellibsuccess(@RequestParam("delid") int id) {
		ModelAndView mav=new ModelAndView();

		int i=adminService.deleteLibrarian(id);
		if(i>0) {
			mav.setViewName("delsuccess");
		}
		else
		{
			mav.setViewName("deletelib");
		}
	
		return mav;
	}
	
	@RequestMapping(value="/viewLibrarian")
	public ModelAndView viewlib() {
		
	List<AddLibrarian> list=adminService.viewLibrarian();
	
	ModelAndView mv= new ModelAndView();
	mv.addObject("lists",list);
	mv.setViewName("viewlib");
	System.out.println(list);
	return mv;
	}
	

	
}
