package compareLocations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.jsoup.Jsoup;

public class Compare {
	public static void main (String [] args) throws IOException {
		UberEatsSelenium test = new UberEatsSelenium();
		//test.viewMore();
		Document dc = null;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\Downloads\\chromedriver.exe");
        @SuppressWarnings("unused")
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   //     driver.get("https://www.ubereats.com/en-CA/cities/");
        
        
		File file = new File("C:\\Users\\ahmed\\eclipse-workspace\\Uber Eats - Slice Life\\uberEatsCitiesUSHref.txt");  //File with all of the city hrefs.
		
		@SuppressWarnings("resource")
		BufferedReader in = new BufferedReader(new FileReader(file));
		String str;
		
		List<String> list = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    list.add(str);
		}

		String[] allCities = list.toArray(new String[0]);	//Used to store all Uber Eats US cities.
		//for (int i = 0; i < allCities.length ; i++)
		//	System.out.println(allCities[i]);
		
		File file2 = new File("C:\\Users\\ahmed\\eclipse-workspace\\Uber Eats - Slice Life\\uberEatsPizzaLocationsHref.txt");
		BufferedReader in2 = new BufferedReader(new FileReader(file2));
		String str2;
		List<String> list3 = new ArrayList<String>();
		while((str2 = in2.readLine()) != null){
		    list3.add(str2);
		}
		
		
		String [] pizzaLocationsHref = list3.toArray(new String[0]);
		for (int i = 0; i < pizzaLocationsHref.length ; i++)
					System.out.println(pizzaLocationsHref[i]);
		 PrintStream out = null;
			try {
				out = new PrintStream(new FileOutputStream("uberEats x sliceLife.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	
			}
			
			
			
			
		//Get all cities href
	/*		List<WebElement> list3 = new ArrayList<WebElement>(); 
			list3 = driver.findElements(By.cssSelector("a.bz.cd"));
			  for (WebElement city : list3) {
		        	System.out.println(city.getAttribute("href"));
		        	out.println(city.getAttribute("href"));
		        }
			
		*/	
			
		     List<WebElement> list2 = new ArrayList<WebElement>(); 
		//     List<WebElement> list4 = new ArrayList<WebElement>();
		Document location = null;
		Elements body = null;
		
/*		//get all pizza locations name, address
		for (int i = 0; i < pizzaLocationsHref.length; i++) {
			driver.get(pizzaLocationsHref[i]);
			WebElement test1 = driver.findElement(By.cssSelector("h1.az.b0.bv.dq.dr.ds.dt"));
			System.out.println(test1.getText());
		//	System.out.println(driver.findElement(By.cssSelector("h1.az b0 bv dq dr ds dt")));
			driver.close();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
*/
		
	/*	
		for (int i = 0; i < pizzaLocationsHref.length; i++) {
			System.out.println("test");
			driver.get(pizzaLocationsHref[i]);
			
			 list2 = driver.findElements(By.cssSelector("h1.az b0 c0 dz e0 e1 e2"));String a12 = list2.get(0).getText();
			 System.out.println(a12);
			 list4 = driver.findElements(By.cssSelector("p.az b0 c0 bl bm b7 e7"));
			  for (WebElement step : list2) {
		    //    	System.out.println(step.getText());
		        //	out.println(city.getAttribute("href"));
		        }
			  driver.close();
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		*/
		
	/*	//Get href of all pizza locations
		for (int i = 0; i < allCities.length; i++) {
			System.out.println("test");
			driver.get(allCities[i] + "pizza-delivery/");
			 list2 = driver.findElements(By.cssSelector("a.cn.co.cp"));
			  for (WebElement city : list2) {
		        	System.out.println(city.getAttribute("href"));
		        	out.println(city.getAttribute("href"));
		        }
			  driver.close();
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	*/	
		//Go through all cities, get pizza locations.	
//		for (int i = 0; i < allCities.length; i++) {
//			System.out.println("test");
//			driver.get("https://www.ubereats.com/en-US/" + allCities[i] + "/pizza-delivery/");
//			 list2 = driver.findElements(By.cssSelector("a.cn.co.cp"));
//			  for (WebElement city : list2) {
//		        	System.out.println(city.getAttribute("href"));
//		        	out.println(city.getAttribute("href"));
//		        }
		//	WebElement we1 = driver.findElement(By.cssSelector("a.cn.co.cp"));
       //     System.out.println(we1.getAttribute("href"));
		//	location =  Jsoup.connect("https://www.ubereats.com/en-US/" + allCities[i] + "/pizza-delivery/").timeout(30 * 1000).get();
		//	body = location.select("div.ak al am aj c4");
		//	location = Jsoup.connect("https://slicelife.com/pizza-delivery/ak-anchorage").timeout(30 * 1000).get();
		//	Elements body2 = dc.select("div.f1l2u390 h3.f1ptf8hk > a");
		//	System.out.println(body.toString());
		//	for (Element step : body) {
		//		String url = step.select("div.cd > a").attr("href");
	     //       System.out.println(url);
//				driver.close();
//				driver = new ChromeDriver();
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//	}
//		}
		
		
		
		//Used to extract all cities from uber eats.
				/*	
		 PrintStream out = null;
			try {
				out = new PrintStream(new FileOutputStream("uberEatsCities.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	
			}
			
		
		dc =  Jsoup.connect("https://www.ubereats.com/en-CA/cities/").timeout(30 * 1000).get();
		Elements body = dc.select("a.bz.cd");
		
		for (Element more : body) {
			System.out.println(more.text());
			out.println(more.text());
		}
		*/
			
	//	dc = Jsoup.connect("ubereats.com/en-US");
	//	FileInputStream fstream = new FileInputStream(allCities1[0] + ".txt");
	//	BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
	//	String strLine;
		//compare ubercity with slicecity
	/*	String str5;
		File slice = new File("C:\\Users\\ahmed\\eclipse-workspace\\Uber Eats - Slice Life\\sliceLife.txt");
		List<String> list5 = new ArrayList<String>();
		BufferedReader in5 = new BufferedReader(new FileReader(slice));
		while((str5 = in5.readLine()) != null){
		    list5.add(str5);
		}
		String [] sliceALL = list5.toArray(new String[0]);
		int nextCity = 0;
		for (int i = 0; i < pizzaLocationsHref.length; i++) {
		//	if(pizzaLocationsHref[i].equals("")) {
		//		nextCity++;
		//		continue;
		//	}
			driver.get(pizzaLocationsHref[i]);
			for (int j = 0; j < sliceALL.length; j++) {
				if(driver.getPageSource().contains(sliceALL[i]))
					{
					    //Click xyz
						System.out.println("hit " + sliceALL[i]);
						out.println(sliceALL[i]);
						break;
					}
		
					else
					{
					    //Click abc
						System.out.println(j + "working");
					}
			}
			driver.close();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	*/
		
		 PrintStream out2 = null;
			try {
				out2 = new PrintStream(new FileOutputStream("hits3.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	
			}
		
		
		File oliver = new File("C:\\Users\\ahmed\\eclipse-workspace\\Uber Eats - Slice Life\\oliver.txt");
		String str6;
		List<String> list6 = new ArrayList<String>();
		BufferedReader in6 = new BufferedReader(new FileReader(oliver));
		while((str6 = in6.readLine()) != null){
		    list6.add(str6);
		}
		String [] sliceALL = list6.toArray(new String[0]);
		
		File uberHref = new File("C:\\Users\\ahmed\\eclipse-workspace\\Uber Eats - Slice Life\\uberEatsPizzaLocationsHref.txt");
		String str7;
		List<String> list7 = new ArrayList<String>();
		BufferedReader in7 = new BufferedReader(new FileReader(uberHref));
		while((str7 = in7.readLine()) != null){
		    list7.add(str7);
		}
		String [] uberALL = list7.toArray(new String[0]);
		int match = 0;
		int next = 0;
		int sentinel = 0;
		boolean allLetters = false;
		for (int i = 883; i < uberALL.length; i++) {
			System.out.println(i + "i loop");
			driver.get(uberALL[i]);
			for (int j = 0; j < sliceALL.length; j++) {
				System.out.println(j + "j loop");
				if(driver.getPageSource().contains(sliceALL[j])) {
					System.out.println(sliceALL[j] + " city match");	//match a city
					match = j;
					
					for (int k = j + 1; k < sliceALL.length; k++) {
						System.out.println(k + " k loop");
						allLetters = sliceALL[k].chars().allMatch(Character::isLetter);
						if (allLetters) {
							System.out.println("out of city range");
							match = 0;
							sentinel = 12345;
								break;
						}
						if(driver.getPageSource().contains(sliceALL[k])) {
							match = 0;
							sentinel = 12345;
							System.out.println(sliceALL[k] + " address match");
							out2.println(sliceALL[k]);
							break;
						}
						if (sentinel == 12345) {
							sentinel = 0;
							break;
						}
					//	driver.close();
					//	driver = new ChromeDriver();
					//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					//	driver.get(uberALL[k+1]);
					}
					
					if (sentinel == 12345) {
						sentinel = 0;
						break;
					}
					//break;
					//loop from match until out of city range
	/*				do {
						for (int x = i; x < uberALL.length; x++) {
							for (int y = match + 1; y < sliceALL.length; y++) {
								if(driver.getPageSource().contains(sliceALL[y])) {
									System.out.println(sliceALL[y] + " matcHH");
									out2.println(sliceALL[y]);
								}
								System.out.println(y);
								if (!(driver.getPageSource().contains(sliceALL[match])))
									break;
							}
							
							driver.close();
							driver = new ChromeDriver();
							driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							driver.get(uberALL[x]);
						}
					}while(driver.getPageSource().contains(sliceALL[match]));
			*/		
				
				}
				
				
			//	System.out.println(i);
			}
			driver.close();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}
	
	
		
		
	public static void abileneUberEats(String [] city) {
		
	}
	
}
