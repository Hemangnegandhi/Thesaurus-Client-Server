/* Code taken from
 * http://www.avajava.com/tutorials/lessons/how-do-i-read-a-string-from-a-file-line-by-line.html?page=2
 */
package com.client.server;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class ReadFile
{
	public String Word = "abc"; 
	
	
	
	public String getSynonyms(String selectedWord)
	{ 
			
	    {
			
			
	    
		File file = new File("D:\\Java\\Thesaurus Client Server\\src\\com\\client\\server\\Database.txt");
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();
			/*System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());*/
			
			/* code another */
			final Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) 
			{
			   final String lineFromFile = scanner.nextLine();
			   String name = selectedWord;
			   int i = 1 ;
			   if(lineFromFile.contains(name)) 
			{ 
			       // a match!
				   i++;
			       /*System.out.println("I found " +name+ " in file " +file.getName()+" at line "+i);*/
				   selectedWord = scanner.nextLine();/* fetching data line by line*/
				   String str1 = scanner.nextLine();
			       System.out.println("This is the selected word value return: "+str1);
			       System.out.println("OUTPUT of the selected word value is THIS "+selectedWord);
			       
			       
			}
			   else
			   {
				// not a match!
			       System.out.println("Not found " +name+ " in file " +file.getName());
			       i++;
			   }
			}
			/* code another */
			
		} 
		
		catch (IOException e) /* catch part */
		{
			e.printStackTrace();/* code to detach string */
		}
		
		
}

	    System.out.println("OUTPUT of the selected word value is THIS AFTER return to the SERVER FILE"+selectedWord); /*checking the stages at which value of string is fetched */
		return selectedWord ;/*Stroing the string that has to be displayed to the client*/
		}
	}
