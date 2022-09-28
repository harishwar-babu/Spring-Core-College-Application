package com.collegeapp.pack;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("mechhod")
public class MechHod implements HeadOfDepartment {

	@Value("${mechhod.name}")
	private String name;
	
	@Value("${mechhod.q}")
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
