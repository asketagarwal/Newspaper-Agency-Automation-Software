import java.util.*;

public class Customer_class implements java.io.Serializable{
	
	private String name;
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
	public ArrayList<String> getNews() {
		return news;
	}
	public void setNews(ArrayList<String> news) {
		this.news = news;
	}
	public ArrayList<String> getMag() {
		return mag;
	}
	public void setMag(ArrayList<String> mag) {
		this.mag = mag;
	}
	public String getDos() {
		return dos;
	}
	public void setDos(String dos) {
		this.dos = dos;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public ArrayList<String> getNot() {
		return not;
	}
	public void setNot(ArrayList<String> not) {
		this.not = not;
	}
	private String username;
	private String password;
	private ArrayList<String> news;
	private ArrayList<String> mag;
	private String dos;
	private String adress;
	private String cid;
	private boolean status;
	private ArrayList<String> not;
	
	public void subscribenews(ArrayList<String> a)
	{
		int i;
		for(i=0;i<a.size();i++)
			{news.add(a.get(i));
			
			}
		String s="";
		for(i=0;i<a.size();i++)
		{
		s+=Newspaper_List.getname(a.get(i))+",";
		}
			not.add("Your Subscription of "+s+" is successfull");
	}
	public void subscribemag(ArrayList<String> a)
	{
		int i;
		for(i=0;i<a.size();i++)
			mag.add(a.get(i));
		
		String s="";
		for(i=0;i<a.size();i++)
		{
		s+=Magazine_List.getname(a.get(i))+",";
		}
			not.add("Your Subscription of "+s+" is successfull");
	}
	public void deletenews(ArrayList<String> a)
	{
		int i,j;
		for(i=0;i<a.size();i++)
		{
			for(j=0;j<news.size();j++)
			{
				if(a.get(i)==news.get(j))
					{news.remove(j);
					break;
					}
					
			}
		}
	}
	
	public void deletemag(ArrayList<String> a)
	{
		int i,j;
		for(i=0;i<a.size();i++)
		{
			for(j=0;j<mag.size();j++)
			{
				if(a.get(i)==mag.get(j))
					{mag.remove(j);
					break;
					}
					
			}
		}
	}
	
	
	

}
