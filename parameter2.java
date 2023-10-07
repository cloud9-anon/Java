package question3;
class Parameter2{
	
public static void main(){
	Employee e1 = new Employee(1 , "Vijay", 5000);
	System.out.println("Salaray before Updating = " + e1.getsalary());
	increment1(e1, 500);
	System.out.println("After updating salary =" + e1.getsalary());
	


	static void increment1 (Employee e , double inc){
		e.setsalary(e.getsalary()+inc) ;
		System.out.println("in Increment salary =" + e.getsalary());
	} 

}
}
