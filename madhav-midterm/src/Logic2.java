import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Logic2
{
	
	public static ArrayList<Product2> getInfoNewegg(String keyword, ArrayList<Product2> List)
	{
		try
		{
			String Urlpre = "http://www.newegg.com/Product/ProductList.aspx?Submit=ENE&DEPA=0&Order=BESTMATCH&Description=";
			String Urlpost = "&N=-1&isNodeId=1";
			
			Document doc = Jsoup.connect(Urlpre + URLEncoder.encode(keyword, "UTF-8")).timeout(60000).get(); 
			Elements items = doc.getElementsByClass("item-title");
 			Elements links = items.select("a[href]");
			Elements price = doc.getElementsByClass("price-current").not("price-current-label").not("price-current-range");
			int i = 0;
			
			
			for (Element link : links) 
			{
				Element prices = price.get(i);
				String name =("<a href=\""+ link.absUrl("href")+"\">"+link.text()+"</a>");
				String justName = link.text();
				String Itemprice = prices.text().replace("–", "").replace("|","");
				//URL toPage = new URL(link.absUrl("href"));
				//name = name +" "+ toPage;
				if(Itemprice.isEmpty())
					Itemprice = "Sorry, price is below MAP";
				
				Product2 it = new Product2 (justName, Itemprice+"<br><br>",name+"<br>");
				List.add(it);
				i++;
			}
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return List;
	}
	public static ArrayList<Product2> getInfoTiger (String keyword, ArrayList<Product2> List)
	{
		String Urlpre = "http://www.tigerdirect.com/applications/SearchTools/search.asp?keywords=";
				
		try 
		{
			Document docTig = Jsoup.connect(Urlpre + URLEncoder.encode(keyword, "UTF-8")).timeout(60000).get();
			Elements Links = docTig.getElementsByClass("itemName");
			Elements Names = Links.select("[href]");
			Elements Prices = docTig.getElementsByClass("salePrice");
					int i = 0;
					for(Element name:Names)
					{
						Element price = Prices.get(i);
						String L = ("<a href=\""+ name.absUrl("href")+"\">"+name.text()+"</a>");
						String P = price.text();
						String N = name.text();
						if (price.text().isEmpty())
							P = "Sorry, price is below MAP<br>";
						if(P.lastIndexOf("$")!= 0)
							P = P.substring(P.indexOf("$"), P.lastIndexOf("$"))+"\nPrice with savings: "+P.substring(P.lastIndexOf("$"));
						Product2 itTiger = new Product2 (N,P+"<br><br>",L+"<br>");
						List.add(itTiger);
						i++;
					}
					
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return List;
	}
	
	
	
	
	
	
	
	
	
	
}





