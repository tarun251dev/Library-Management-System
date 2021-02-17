package com.libraryManagement.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.libraryManagement.library.service.LibraryService;

import com.libraryManagement.library.bean.Book;
import com.libraryManagement.library.bean.IssueBook;

@RestController
public class LibrarianController {

	@Autowired
	LibraryService libraryService;
	
	@RequestMapping(value="/addbook",method=RequestMethod.GET)
	public ModelAndView book() {
		ModelAndView mav=new ModelAndView("addbooks");
	 return mav;
	}
	
	@RequestMapping(value="/addbookdata",method=RequestMethod.POST)
		public ModelAndView booklogin(@RequestParam("name") String name,
				@RequestParam("book_id") int book_id,
				@RequestParam("author") String author,
				@RequestParam("publisher") String publisher,
				@RequestParam("quantity") int quantity) {
		
		
		ModelAndView mav=new ModelAndView();
		Book book=new Book(book_id, name, author, publisher, quantity);
		int i=libraryService.saveBook(book);
		if(i>0) {
	          mav.setViewName("addsuccess");
		}
		
	
	 return mav;
	}

	@RequestMapping(value="/viewbook")
	public ModelAndView viewbooklib() {
		
	List<Book> list=libraryService.viewbook();
	
	ModelAndView mv= new ModelAndView();
	mv.addObject("lists",list);
	mv.setViewName("viewbooks");
	
	return mv;
	}
	
	@RequestMapping(value="/issuebook",method=RequestMethod.GET)
	public ModelAndView booklogin() {
		ModelAndView mav=new ModelAndView("Issuebook");
	 return mav;
	}
	
	
	
	@RequestMapping(value="/issuebookdetail",method=RequestMethod.POST)
	public ModelAndView bookloginpage(@RequestParam("book_id") int book_id,
			@RequestParam("student_id") int student_id,
			@RequestParam("student_name") String student_name,
			@RequestParam("contact") String contact,
			@RequestParam("issue_date") String issue_date,
			@RequestParam("period") int period) {	
	
	ModelAndView mav=new ModelAndView();
	IssueBook issuebook=new IssueBook(book_id, student_name, student_id, contact,issue_date,period);
	int i=libraryService.saveIssueBook(issuebook);
	if(i>0) {
          mav.setViewName("addsuccess");
	}
	

 return mav;
}

	@RequestMapping(value="/viewissuebooklist")
	public ModelAndView viewissuebooklist() {
		
	List<IssueBook> list=libraryService.viewissuebook();
	
	ModelAndView mv= new ModelAndView();
	mv.addObject("lists",list);
	mv.setViewName("issuebooklist");
	
	return mv;
	}
	
	@RequestMapping(value="/returnbook")
	public ModelAndView returnbooklist() {
		ModelAndView mav=new ModelAndView("return");
	 return mav;
	}
	
	
	
	@RequestMapping(value="/returnbookpage",method=RequestMethod.POST)
	public ModelAndView retbook(@RequestParam("return_date") String return_date,
			@RequestParam("student_id") int student_id,
			@RequestParam("book_id") int book_id
			){
		ModelAndView mav=new ModelAndView();
		IssueBook issuebook=new IssueBook(return_date, student_id,book_id);
		int i=libraryService.savereturnBook(issuebook);
		System.out.println(i);
		if(i>0) {
				mav.setViewName("addsuccess");
			
	          
		}
		
		return mav;
		
		
	}
	
 
}
		

