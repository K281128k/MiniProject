package com.impelementedMethods;

import com.dao.DaoClass;

public class Studentimplementation implements StudentY{

	DaoClass dao= new DaoClass();
	@Override
	public void insertStudent() throws Exception {
		
		dao.insert();
		
	}

	

}
