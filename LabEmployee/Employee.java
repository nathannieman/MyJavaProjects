/*****************************************
* Author : Nathan Nieman
* Date : 09/26/2020
* Assignment: Lab Employee
******************************************/

public class Employee
{
   // fields
	private String firstName;
   private String lastName;
   private double salary;
   
	// constructors
   public Employee(String lName, String fName, double s)
   {
      lastName = lName;
      firstName = fName;
      setSalary(s);
   }
   // methods	
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public double getSalary()
   {
      return salary;
   }
   
   public void setSalary(double salary)
   {
      if (salary >= 0)
      {
         this.salary = salary;
      }
   }
}