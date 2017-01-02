import java.util.ArrayList;

public class Delivery_Person_List implements java.io.Serializable {
	
	private static ArrayList<Delivery_Person_class> dp;

	public static ArrayList<Delivery_Person_class> getDp() {
		return dp;
	}

	public static void setDp(ArrayList<Delivery_Person_class> dp) {
		Delivery_Person_List.dp = dp;
	}

}
