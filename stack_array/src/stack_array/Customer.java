package stack_array;

public class Customer {
	private static int customer_id = 1000;
	private String customer_name ;
	private String customer_address ;
	
	Customer(){};
	Customer(String n, String a){
		this.customer_name=n;
		this.customer_address=a;
		customer_id++;}
	public static int getCustomer_id() {
		return customer_id;
	}
	public static void setCustomer_id(int customer_id) {
		Customer.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	
	
}
