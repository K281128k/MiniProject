package com.main;

import com.dao.DaoClass;
import com.impelementedMethods.Studentimplementation;

public class Main {

	public static void main(String[] args) throws Exception {
		Studentimplementation obj = new Studentimplementation();
		obj.insertStudent();
		System.out.println("operation success");
	}

}
