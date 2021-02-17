package com.libraryManagement.library.daos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import java.sql.*;
import java.util.List;


import com.libraryManagement.library.bean.Book;
import com.libraryManagement.library.bean.IssueBook;
import com.libraryManagement.library.bean.Student;
import com.libraryManagement.library.bean.User;


@Repository
public class LibraryDaoImpl implements LibraryDao{
	
	@Autowired
	 JdbcTemplate jdbcTemplate;  

	public User validateloginProcess(String name,String password,String flag) {
		User user = new User() ;
		
		 jdbcTemplate.query("select * from admin where name='"+name+"' and password='"+password+"' and flag= '"+flag +"';",new RowMapper<User>() {
	    	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	    
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setFlag(rs.getString("flag"));
				
		
				return user;
			}
	    });
	    
	    return user;
	}

	@Override
	public int saveBook(Book book) {
		 String query= "insert into book(book_id,name,author,publisher,quantity) values(?,?,?,?,?) ";
		 return jdbcTemplate.update(query, new Object[] { book.getBook_id(), book.getName(), book.getAuthor() , book.getPublisher(),book.getQuantity() });
		
	}

	@Override
	public List<Book> viewbooklist() {
		 List<Book> list =jdbcTemplate.query("select * from book",new RowMapper<Book>() {
		    	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		    		
		    		
					Book book = new Book() ;
					
				    book.setBook_id(rs.getInt("book_id"));
					book.setName(rs.getString("name"));
					book.setAuthor(rs.getString("author"));
					book.setPublisher(rs.getString("publisher"));
					book.setQuantity(rs.getInt("quantity"));
					
					
					return book;
				}
		    });
		    
		    return list;
		}

	@Override
	public int saveIssueBooklist(IssueBook issuebk) {
		
		 String query= "insert into issuebook(book_id,student_id,student_name,contact,issue_date,period) values(?,?,?,?,?,?) ";
		 return jdbcTemplate.update(query, new Object[] { issuebk.getBook_id(), issuebk.getStudent_id(), issuebk.getStudent_name() , issuebk.getContact() ,issuebk.getIssue_date() , issuebk.getPeriod() });
		

	}  

	public List<IssueBook> viewissuebooklist() {
		 List<IssueBook> list =jdbcTemplate.query("select * from issuebook",new RowMapper<IssueBook>() {
		    	public IssueBook mapRow(ResultSet rs, int rowNum) throws SQLException {
		    		
		    		
					IssueBook issuebook = new IssueBook() ;
					
				    issuebook.setBook_id(rs.getInt("book_id"));
					issuebook.setStudent_id(rs.getInt("student_id"));
					issuebook.setStudent_name(rs.getString("student_name"));
					issuebook.setContact(rs.getString("contact"));
					issuebook.setIssue_date(rs.getString("issue_date"));
					issuebook.setReturn_date(rs.getString("return_date"));

					issuebook.setPeriod(rs.getInt("period"));
					
					return issuebook;
				}
		    });
		    
		    return list;
		}

	
		
	

	
	@Override
	public int savereturnbookpage(IssueBook book) {
		System.out.println("dao");

		String query= "update issuebook set return_date= ? where student_id=? and book_id=?";
		 int i=jdbcTemplate.update(query, book.getReturn_date(),  book.getStudent_id() ,book.getBook_id());
		 System.out.println(i);
		return i;
	}

	@Override
	public int saveStudentDao(Student student) {
		
		 String query= "insert into student(student_name,email,contact,dob,age,flag,gender) values(?,?,?,?,?,?,?) ";
		 return jdbcTemplate.update(query, new Object[] { student.getStudent_name() , student.getContact() ,student.getEmail_id() , student.getDob() , student.getFlag() , student.getAge() ,student.getGender() });
	
		
	}
	
	

		
	

	
	
		  
	}
	


  