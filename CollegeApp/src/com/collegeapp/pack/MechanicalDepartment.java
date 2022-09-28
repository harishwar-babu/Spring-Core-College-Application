package com.collegeapp.pack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("mech")
public class MechanicalDepartment implements Department {

	@Autowired
	private MechanicalSubjects mechsub;
	
	@Autowired
	private MechDepartmentActivities mechdept;
	
	@Autowired
	private MechHod mechhod;
	@Override
	public void hodname()
	{
		mechhod.myname();
	}
	@Override
	public void qualification()
	{
		mechhod.myqualification();
	}
	@Override
	public void DepartmentName() {
		mechdept.DepartmentName();
	}
	
	@Override
	public void DepartmentStudentCount() {
		mechdept.DepartmentStudentCount();
	}
	
	@Override
	public void DepartmentStaffCount() {
		mechdept.DepartmentStaffCount();
	}
	
	@Override
	public void DepartmentPlacementCount() {
		mechdept.DepartmentPlacementCount();
	}
	
	@Override
	public void sub1()
	{
		mechsub.sub1();
	}
	
	@Override
	public void sub2()
	{
		mechsub.sub2();
	}
	
	@Override
	public void sub3()
	{
		mechsub.sub3();
	}
}
