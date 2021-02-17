package com.libraryManagement.library.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryManagement.library.bean.Book;
import com.libraryManagement.library.bean.IssueBook;
import com.libraryManagement.library.bean.Student;
import com.libraryManagement.library.bean.User;
import com.libraryManagement.library.daos.LibraryDao;

@Service
public class LibraryServiceImpl implements LibraryService{
	
	@Autowired
	LibraryDao libraryDao;
	
	

	public User validateLogin(String name,String password,String flag) {
		return libraryDao.validateloginProcess(name,password,flag);
		
	}


	@Override
	public int saveBook(Book book) {
	
		return libraryDao.saveBook(book);
	}


	@Override
	public List<Book> viewbook() {
		return libraryDao.viewbooklist();
	}


	@Override
	public int saveIssueBook(IssueBook issuebook) {
		return libraryDao.saveIssueBooklist(issuebook);
	}


	@Override
	public List<IssueBook> viewissuebook(){
		return libraryDao.viewissuebooklist();
	}


	@Override
	public int savereturnBook(IssueBook issuebook) {
		System.out.println("service");
		
		return libraryDao.savereturnbookpage(issuebook);

	}


	@Override
	public int saveStudent(Student student) {
		// TODO Auto-generated method stub
		return libraryDao.saveStudentDao(student);

	}




		
	


	
	

}
