package com.collegeapp.pack;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("csesub")
public class ComputerSubjects implements DepartmentSubjects {
	
	@Value("${cse.staf1}")
	private String s1;
	@Value("${cse.staf2}")
	private String s2;
	@Value("${cse.staf3}")
	private String s3;
	@Value("${cse.sub1}")
	private String sub1;
	@Value("${cse.sub2}")
	private String sub2;
	@Value("${cse.sub3}")
	private String sub3;
	@Override
	public void sub1() {
		System.out.print("Name : "+s1);
		System.out.println("In Charge of "+sub1+" "+"Subject");
	}

	@Override
	public void sub2() {
		System.out.print("Name : "+s2);
		System.out.println("In Charge of "+sub2+" "+"Subject");
	}

	@Override
	public void sub3() {
		System.out.print("Name : "+s3);
		System.out.println("In Charge of "+sub3+" "+"Subject");
	}

}
