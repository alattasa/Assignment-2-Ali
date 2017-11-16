import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TestApp 
{
	public static void main(String args[]) throws IOException
	{
		String filename = null;
		if(args.length < 1)
		{
			System.out.println("Usage <filename.txt>");
			System.exit(0);
		}
	    else filename = args[0];
		
		Data d = new Data();// create instance
		ArrayList<Resistor> resistors = d.readData(filename);// read data
		

		BufferedWriter bw = null;// buffer write
		FileWriter fw = null;// file writer

			fw = new FileWriter("good.txt");// open file
			bw = new BufferedWriter(fw);// get file into buffer
		
		System.out.println("Saving good designs to good.txt");
		System.out.println("The following are bad designs:");
		
		for(int i=0;i<resistors.size();i++)
		{
			if(resistors.get(i).validateDesign()== false)// check bad desgin
			System.out.println(resistors.get(i).toString());
			else// if good desing
				bw.write(resistors.get(i).toString()+"\n");// write into file
			
		}
		bw.close();// close buffer writer
		fw.close();// close file writer
	}

}
