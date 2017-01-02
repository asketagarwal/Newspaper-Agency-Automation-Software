import java.util.ArrayList;

public class Newspaper_List implements java.io.Serializable {
	private static ArrayList<Newspaper> news;

	public static ArrayList<Newspaper> getNews() {
		return news;
	}

	public static void setNews(ArrayList<Newspaper> a) {
		Newspaper_List.news = a;
	}

	  public static String getname(String a)
	    {
	    	int i;
	    	for(i=0;i<news.size();i++)
	    	{
	    		if(news.get(i).getNid()==a)
	    			break;
	    	}
	    	return news.get(i).getName();
	    }
}
