package informaticaaplicata2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Aplicatie {
	
	public static void main(java.lang.String[] args) throws IOException {
		
		FileWriter fileWriter = new FileWriter("dataOut.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		System.out.println("Introduceti cuvintele: ");
		Scanner s = new Scanner(System.in);
		String cuvinte = s.next();
		
	try{
		while(!"end".equals(cuvinte))
		{
			printWriter.println(cuvinte);
			cuvinte = s.next();
		}
		fileWriter.close();
		s.close();
		
	    }
	catch(IOException e)
		{
		    e.printStackTrace();
		}
		
	}

}