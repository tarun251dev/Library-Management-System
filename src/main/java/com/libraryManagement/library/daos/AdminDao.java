package com.libraryManagement.library.daos;

import com.libraryManagement.library.bean.AddLibrarian;
import java.util.List;


public interface AdminDao {
	

	public int saveLibrarian(AddLibrarian lib) ;
	public int deleteLibrarian(int id) ;
	List<AddLibrarian> viewLibrarian();
}
