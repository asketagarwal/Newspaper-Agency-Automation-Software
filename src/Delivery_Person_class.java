import java.util.ArrayList;

public class Delivery_Person_class implements java.io.Serializable {
	private String name;
	private String username;
	private String password;
	private String del_id;
	private ArrayList<Customer_class> customers_assign;
	private ArrayList<String> not;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDel_id() {
		return del_id;
	}
	public void setDel_id(String del_id) {
		this.del_id = del_id;
	}
	public ArrayList<Customer_class> getCustomers_assign() {
		return customers_assign;
	}
	public void add_customer(Customer_class cust) {
		customers_assign.add(cust);
	}
	public ArrayList<String> getNot() {
		return not;
	}
	public void setNot(ArrayList<String> not) {
		this.not = not;
	}
	
	

}
