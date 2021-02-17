package com.libraryManagement.library.daos;



import java.util.List;

import com.libraryManagement.library.bean.Book;
import com.libraryManagement.library.bean.IssueBook;
import com.libraryManagement.library.bean.Student;
import com.libraryManagement.library.bean.User;

public interface LibraryDao {

	public List<IssueBook> viewissuebooklist();

	public User validateloginProcess(String name,String password,String flag) ;

	public int saveBook(Book book);

	public List<Book> viewbooklist();

	public int saveIssueBooklist(IssueBook issuebook);

	

	

	public int savereturnbookpage(IssueBook issuebook);

	public int saveStudentDao(Student student);

		

}
