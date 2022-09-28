package com.collegeapp.pack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("csehod")
public class CseHOD implements HeadOfDepartment {

	@Value("${csehod.name}")
	private String name;
	
	@Value("${csehod.q}")
	private String qualification;
	@Override
	public void myname() {
		System.out.println("Name : " +name);
	}

	@Override
	public void myqualification() {
		System.out.println("Qualification : "+qualification);
		

	}

}
