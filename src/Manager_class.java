import java.util.ArrayList;

public class Manager_class implements java.io.Serializable {
	private String name;
	private String username;
	private String password;
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
	public void add_customer(Customer_class cust)
	{
		Customer_List.getCus().add(cust);
	}
	public void add_newspaper(Newspaper news)
	{
		Newspaper_List.getNews().add(news);
	}
	
	public void add_magazine(Magazine mag)
	{
		Magazine_List.getMag().add(mag);
	}
	public void add_deliveryperson(Delivery_Person_class obj)
	{
		Delivery_Person_List.getDp().add(obj);
	}
	
}
