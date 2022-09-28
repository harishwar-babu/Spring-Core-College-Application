package com.collegeapp.pack;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class CollegeMain {
	public static void main(String[]args)
	{
		/*String value = SpringVersion.getVersion();
		String jdk = System.getProperty("java.version");*/
		try {
			ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
			System.out.println("College is Loading");
			CollegePrincipal prince = context.getBean("college",CollegePrincipal.class);
			Department dept =context.getBean("cse",ComputerScienceDepartment.class);
			Department dept1 = context.getBean("mech",MechanicalDepartment.class);
			prince.collegename();
			prince.principalname();
			dept.DepartmentName();
			dept.hodname();
			dept.qualification();
			dept.DepartmentStaffCount();
			dept.DepartmentStudentCount();
			dept.DepartmentPlacementCount();
			dept.sub1();
			dept.sub2();
			dept.sub3();
			dept1.DepartmentName();
			dept1.hodname();
			dept1.qualification();
			dept1.DepartmentStaffCount();
			dept1.DepartmentStudentCount();
			dept1.DepartmentPlacementCount();
			dept1.sub1();
			dept1.sub2();
			dept1.sub3();
			((AnnotationConfigApplicationContext) context).close();
		}
		catch(Exception e)
		{
			System.out.println("Error" +" "+e);
		}
	}
}
