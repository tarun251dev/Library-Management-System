package com.libraryManagement.library.service;



import java.util.List;


import com.libraryManagement.library.bean.Book;
import com.libraryManagement.library.bean.IssueBook;
import com.libraryManagement.library.bean.Student;
import com.libraryManagement.library.bean.User;

public interface LibraryService {

	 User validateLogin(String name,String password,String flag);

	public int saveBook(Book book);

    public	List<Book> viewbook();

	public int saveIssueBook(IssueBook issuebook);

	public List<IssueBook> viewissuebook();

	public int savereturnBook(IssueBook issuebook);

	public int saveStudent(Student student);

	
	 
	 


}
