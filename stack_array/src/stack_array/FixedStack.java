package stack_array;

public class FixedStack implements Stack {
	private Customer[] fs;
	private int max_size ;
	private int top ;
	
	
	public FixedStack(int size) {
		max_size = size;
		fs = new Customer[max_size];
		top = -1;
	}
	
	

	
	

@Override
 public void push(Customer customer){
	 if(top<max_size-1) {
		 top++;
		 fs[top] = customer;
		 System.out.println("Pushed!");
	 }
	 else {
		 System.out.println("Stack is full");
		 
	 }
}

public void pop() {
	if(top >= 0) {
		Customer customer = fs[top];
		top--;
		System.out.println("Popped!");
		}
	else {
		System.out.println("Stack is empty");
	}
	
}

public void displayStack() {
    System.out.println("Stack contents:");

    for (int i = 0; i <= top; i++) {
        Customer customer = fs[i];
        System.out.println("Customer ID: " + customer.getCustomer_id() +
                           ", Name: " + customer.getCustomer_name() +
                           ", Address: " + customer.getCustomer_address());
    }

    System.out.println("End of Stack");
}


}
