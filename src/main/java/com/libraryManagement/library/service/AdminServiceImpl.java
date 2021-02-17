package com.libraryManagement.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryManagement.library.bean.AddLibrarian;
import com.libraryManagement.library.daos.AdminDaoImpl;

@Service
public class AdminServiceImpl implements AdminService {
	
	
	@Autowired
	AdminDaoImpl admindao;
	
	

	@Override
	public int saveLibrarian(AddLibrarian addLibrarian) {
		return admindao.saveLibrarian(addLibrarian);
		
	}
	@Override
	public int deleteLibrarian(int id) {
		
		return admindao.deleteLibrarian(id);
	}
	
	@Override
	public List<AddLibrarian> viewLibrarian() {
		
		return admindao.viewLibrarian();
		
	}
	

}
