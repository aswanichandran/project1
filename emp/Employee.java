package org.emp;

public class Employee {
   public void empId() {
	 System.out.println("Id:1234");
}
   public void empName() {
	 System.out.println("Aswani");
}
   public void empDob() {
		 System.out.println("DOB:15/11/1994");
	}
   public void empPhone() {
		 System.out.println("mob:8281619917");
	}
   public void empEmail() {
		 System.out.println("email:aswani.chandran94@gmail.com");
	}
   public void empAddress() {
		 System.out.println("cheelil house,kannur,kerala 670693");
	}
   public static void main(String[]args)
   {
	   Employee e = new Employee();
	   e.empId();
	   e.empName();
	   e.empDob();
	   e.empPhone();
	   e.empEmail();
	   e.empAddress();
   }
   
	
}


