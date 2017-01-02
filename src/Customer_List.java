import java.util.ArrayList;

public class Customer_List implements java.io.Serializable {
	private static ArrayList<Customer_class> cus;

	public static ArrayList<Customer_class> getCus() {
		return cus;
	}

	public static void setCus(ArrayList<Customer_class> cus) {
		Customer_List.cus = cus;
	}

}
