package com.collegeapp.pack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("college")
public class CollegePrincipalClass implements CollegePrincipal {
	
	@Value("${college.name}")
	private String clgname;
	
	@Value("${college.principal}")
	private String principal;
	@Override
	public void collegename() {
		System.out.println("CollegeName : "+clgname);
	}

	@Override
	public void principalname() {
		System.out.println("PrincipalName : "+principal);

	}

}
