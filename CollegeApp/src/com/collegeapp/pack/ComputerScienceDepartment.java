package com.collegeapp.pack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("cse")
public class ComputerScienceDepartment implements Department {

	@Autowired
	private ComputerSubjects csesub;
	
	@Autowired
	private CseDepartmentActivities csedept;
	
	@Autowired
	private CseHOD csehod;
	
	@Override
	public void hodname()
	{
		csehod.myname();
	}
	@Override
	public void qualification()
	{
		csehod.myqualification();
	}
	@Override
	public void DepartmentName() {
		csedept.DepartmentName();
	}

	@Override
	public void DepartmentStudentCount() {
		csedept.DepartmentStudentCount();
	}
	
	@Override
	public void DepartmentStaffCount() {
		csedept.DepartmentStaffCount();
	}
	
	@Override
	public void DepartmentPlacementCount() {
		csedept.DepartmentPlacementCount();
	}
	@Override
	public void sub1()
	{
		csesub.sub1();
	}
	@Override
	public void sub2()
	{
		csesub.sub2();
	}
	@Override
	public void sub3()
	{
		csesub.sub3();
	}
}
