import java.lang.*;
import java.util.Scanner;
class Calculator {
public static void main(String[] args){

System.out.println("Enter Two Numbers : " );

Scanner sc =new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();

System.out.println("Press 1. For Addition ");
System.out.println("Press 2. For Substraction ");
System.out.println("Press 3. For Multipliction ");
System.out.println("Press 4. For Division ");

int choice = sc.nextInt();

if(choice >=1 && choice <=4){
	switch(choice){
			case 1:
				System.out.println("Addition of both numbers is : "+(num1+num2));
				break;
			case 2:
				System.out.println("Substraction of both is : "+(num1-num2));
				break;
			case 3:
				System.out.println("Multipliction of is : "+(num1*num2));
				break;
			case 4:
				System.out.println("Division of both numbers  is : "+(num1/num2));
				break;
		     }
}
else{System.out.println("Enter invalid input !");}
sc.close();
}
}
