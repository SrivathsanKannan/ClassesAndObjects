package Employees; 


class Employee {
    public String name;
    public int yearOfJoin;
    public String address;
    public double salary;
    Employee(String name, int yearOfJoin, String address, double salary)
    {
        this.name = name;
        this.yearOfJoin = yearOfJoin;
        this.address = address;
        this.salary = salary;
    }
}
public class EmployeeDetails{
	public static void main (String[] args) {
    Employee E1 = new Employee("Robert WallStreet", 1994, "64C-", 20000);
	  Employee E2 = new Employee("Sam WallStreet", 2000, "68D-", 10000);
	  Employee E3 = new Employee("John WallStreet", 1999, "26B-", 5000);
		System.out.println("the Employee details are as follows : \n");
		System.out.println("Name \t\t\tYear of Joining \tAddress \tSalary");
		System.out.println(E1.name +" \t"+ E1.yearOfJoin +" \t\t\t"+ E1.address +" \t\t"+ E1.salary);
		System.out.println(E2.name +" \t\t"+ E2.yearOfJoin +" \t\t\t"+ E2.address +" \t\t"+ E2.salary);
	  System.out.println(E3.name +" \t"+ E3.yearOfJoin +" \t\t\t"+ E3.address +" \t\t"+ E3.salary);
	}
	
}
