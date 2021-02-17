package com.libraryManagement.library.service;



import java.util.List;

import com.libraryManagement.library.bean.AddLibrarian;



public interface AdminService {

	public int saveLibrarian(AddLibrarian addLibrarian);
	
	public int deleteLibrarian(int id);
	
	public List<AddLibrarian> viewLibrarian();	
	
}