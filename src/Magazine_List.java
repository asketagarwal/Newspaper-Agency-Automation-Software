import java.util.ArrayList;

public class Magazine_List implements java.io.Serializable {
	private static ArrayList<Magazine> mag;

	public static ArrayList<Magazine> getMag() {
		return mag;
	}

	public static void setMag(ArrayList<Magazine> mag) {
		Magazine_List.mag = mag;
	}
    public static String getname(String a)
    {
    	int i;
    	for(i=0;i<mag.size();i++)
    	{
    		if(mag.get(i).getMid()==a)
    			break;
    	}
    	return mag.get(i).getName();
    }
}
