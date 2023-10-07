package question3;
import java.lang.*;

class Employee{
	private int id;
	private String name;
	private double salary;
	
	Employee(int i, String n, double sal){
		id=i;
		name=n;
		salary=sal;}
		
void setsalary(double s){
	salary=s;
}

double getsalary(){
	return salary;
}

}
