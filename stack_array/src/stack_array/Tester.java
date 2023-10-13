package stack_array;
import java.util.*;

public class Tester {
 public static void main (String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter size of stack");
	 int size = sc.nextInt();
	 FixedStack fs = new FixedStack(size);
	 System.out.println("Enter 1: For Push \n 2: For Pop ");
	 
	 int ch = sc.nextInt();
	 
	 	switch (ch) {
	 					case 1:
	 						System.out.println("Enter Name and Address");
	 						String name = sc.next();
	 						String address = sc.next();
	 						Customer c = new Customer(name , address);
	 						fs.push(c);
	 						break;
	 					
	 					case 2 :
	 						fs.pop();
	 						break;
	 						
	 					default :
	 						System.out.println("Enter valid option!");
	 						
	 	
	 				}
	 	fs.displayStack();
 
 sc.close();
 }
}
