public class Product2
{
	public String price;
	public String name;
	public String link;
	public Product2 (String Name, String Price, String Link)
	{
		price = Price;
		name = Name;
		link = Link;
	}



	public String getName()
	{
		return name;
	}
	
	public String getPrice()
	{
		return price;
	}
	
	@Override
	public String toString()
	{
		StringBuilder i = new StringBuilder();
		i.append("Name: "+link+"\n");
		i.append("Price: "+price+"\n");
		return i.toString();
	}
	
	




	
}


