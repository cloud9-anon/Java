import java.util.Scanner;
class Division {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two number");
double d1 = sc.nextDouble();
double d2 = sc.nextDouble();
System.out.println("Div of "+d1+" "+d2+" ="+(d1/d2));

sc.close();
}
}
