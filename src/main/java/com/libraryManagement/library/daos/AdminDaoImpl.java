package com.libraryManagement.library.daos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;




import com.libraryManagement.library.bean.AddLibrarian;  

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
 JdbcTemplate jdbcTemplate;  

	/*
	 * public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { this.jdbcTemplate =
	 * jdbcTemplate; }
	 */
	
	@Transactional
	public int saveLibrarian(AddLibrarian lib){  
		
	
	    String query= "insert into admin(name,password,email,city,address,contact,flag) values(?,?,?,?,?,?,?) ";
	    		//+ " values("+lib.getName()+","+lib.getPassword()+","+lib.getEmail()+","+lib.getCity()+","+lib.getAddress()+","+lib.getContact()+")";
	  return jdbcTemplate.update(query, new Object[] { lib.getName(), lib.getPassword(), lib.getEmail() ,lib.getCity(), lib.getAddress(), lib.getContact() ,lib.getFlag()});
	 // return jdbcTemplate.update(query) ;   
	}
	
	
	
	public int deleteLibrarian(int id){  
	    String query="delete  from admin  where adminid="+id;
	    	return this.jdbcTemplate.update(query);
	    	    
	    
	}

	public List<AddLibrarian> viewLibrarian(){  
		
	    List<AddLibrarian> list =jdbcTemplate.query("select * from admin",new RowMapper<AddLibrarian>() {
	    	public AddLibrarian mapRow(ResultSet rs, int rowNum) throws SQLException {
	    		
	    		
				AddLibrarian lib = new AddLibrarian() ;
				lib.setAdminid(rs.getInt("adminid"));
				lib.setName(rs.getString("name"));
				lib.setPassword(rs.getString("password"));
				lib.setEmail(rs.getString("email"));
				lib.setCity(rs.getString("city"));
				lib.setAddress(rs.getString("address"));
				lib.setContact(rs.getString("contact"));
				lib.setFlag(rs.getString("flag"));
				
				
				return lib;
			}
	    });
	    
	    return list;
	}  

	
}
