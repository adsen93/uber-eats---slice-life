package cross;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Cross {
	public static void main (String [] args) throws IOException {
		File file = new File("C:\\Users\\ahmed\\eclipse-workspace\\Uber Eats - Slice Life\\sliceLifeLocationsFINAL.txt");
		File file2 = new File("C:\\Users\\ahmed\\eclipse-workspace\\Uber Eats - Slice Life\\allcity.txt");
		
		
		BufferedReader in = new BufferedReader(new FileReader(file));
		String str;
		
		List<String> list = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    list.add(str);
		}

		String[] slicecity = list.toArray(new String[0]);	
		
	 in = new BufferedReader(new FileReader(file2));
	
		
		List<String> list2 = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    list2.add(str);
		}

		String[] ubercity = list2.toArray(new String[0]);
		
		 PrintStream out = null;
			try {
				out = new PrintStream(new FileOutputStream("uberEats x sliceLife2.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	
			}
			PrintStream yeet = null;
			try {
				yeet = new PrintStream(new FileOutputStream("compare2.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	
			}
		//	System.out.println(("Central Oregon".contains("Oregon")));
			for (int i = 0; i < slicecity.length; i++) {
				for (int j = 0; j < ubercity.length; j++) {
				//	System.out.println( slicecity[i] + " compare " + ubercity[j]);
					if(slicecity[i].contains(ubercity[j])){
						System.out.println( i + " match");
						out.println(slicecity[i]);
					}
						
				}
					
			}
		
			
			for (int i = 0; i < ubercity.length; i++) {
				for (int j = 0; j < slicecity.length; j++) {
				//	System.out.println( slicecity[i] + " compare " + ubercity[j]);
					if(ubercity[i].contains(slicecity[j])){
						System.out.println( j + " match");
						yeet.println(slicecity[j]);
					}
						
				}
					
			}
	}
}
