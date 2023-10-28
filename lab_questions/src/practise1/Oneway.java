package practise1;

public class Oneway {

	public static void isOneway(String s1 , String s2) {
		
		
			int a = s1.length(); int b = s2.length();
		
			
		 if(s1.equals(s2)) 
			{
				System.out.println("String are equal"); 
				return;
			}
			
			
			
		 else if (Math.abs(a-b) != 1) 
		{
			System.out.println("Not an One Way string!");
				return;
		}
		
		
		
		
		
		
		
		else if(a==b) 
		{
			int diff = 0;
			for(int i=0; i< a; i++) 
			{
				if(s1.charAt(i) != s2.charAt(i)) 
				{
					++diff;
					if(diff>1) {System.out.println("Not an one way string");}
				}
			}		
		}
		else 
			{
			String shorter = (a>b)?s1:s2;
			String longer = (a<b) ? s2:s1;
			
			int i =0,j=0;
			int diff=0;
			 while(i<shorter.length() && j< longer.length()) 
			 			{
				 			if(shorter.charAt(i) != longer.charAt(j))
				 			{
				 				++diff;
				 				if(diff > 1) {System.out.println("Not an one way string");}
				 			j++;
				 			}
				 			else {
				 					i++;
				 					j++;
				 				  }
			 			}
			System.out.println("Strings are One Way");
			
			}
	
	}

	
	public static void main(String[] args) {
		String first = "abcd";
		String second = "abcde";
		
		isOneway(first, second);

	}

}
