package odbc;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Mainapp 
{

		public static void main(String[] args)
		{
				Scanner sc = null;
				Writer wr = null;
				
				try{
					
						sc = new Scanner(new File("File1"));
						File file =new File("File2");
					
						if(file == null)
						{
							file.createNewFile();
						}
					
						wr = new FileWriter(file);
						
						while(sc.hasNext()){
							
							String nextLine= sc.nextLine();
							System.out.println(nextLine);
							wr.write(nextLine+"\n");
							//System.out.println(sc.nextLine());
					}
						sc.close();
						wr.flush();
						wr.close();
				}
				catch(Exception e)
				{
						e.printStackTrace();
				}
				
		}
}
