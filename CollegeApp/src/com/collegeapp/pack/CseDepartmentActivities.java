package com.collegeapp.pack;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("csedept")
public class CseDepartmentActivities implements DepartmentActivity {
	@Value("${cse.student}")
	private int student;
	@Value("${csetstaff.count}")
	private int tstaff;
	@Value("${csentstaff.count}")
	private int ntstaff;
	@Value("${cseplacement.percentage}")
	private double placement;
	@Value("${year}")
	private int year;
	@Override
	public void DepartmentName() {
		System.out.println("Welcome to Computer Science Department");
	}

	@Override
	public void DepartmentStudentCount() {
		System.out.println("In this Department there are"+" "+ student+" "+ "students as of now");
	}

	@Override
	
	public void DepartmentStaffCount() {
		System.out.println("In this Department there are"+" "+tstaff+" "+ "Teaching Staffs and"+ ntstaff+" "+ "Non-Teaching Staffs are There");

	}

	@Override
	public void DepartmentPlacementCount() {
		System.out.println("As Of"+" "+year+ "  We achieved nearly"+" "+placement+" "+ "Placement Record");
	}
}