package question3;
class Parameter1{
	
public static void main(String[] args){
	Employee e1 = new Employee(1 , "Vijay", 5000);
	System.out.println("Salaray before Updating = " + e1.getsalary());
	increment1(e1.getsalary(), 500);
	System.out.println("After updating salary =" + e1.getsalary());}
	


	static void increment1 (double d1 , double inc){
		d1 += inc ;
		System.out.println("in Increment salary =" + d1);} 

}

