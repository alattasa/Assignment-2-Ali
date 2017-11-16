import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Data 
{
	public ArrayList<Resistor> readData(String file)
	{
		System.out.println("Reading filename: data.txt");
		ArrayList<Resistor> resistor = new ArrayList<Resistor>();// create array
		BufferedReader br = null;// buffer reader
		FileReader fr = null;// file reader

		try {
			fr = new FileReader(file);// read file
			br = new BufferedReader(fr);// get file in buffer

			String values;

			while ((values = br.readLine()) != null) // read file line by line
			{
				String temp[] = values.split("\t");// split line
				// store data into arraylist
				resistor.add(new Resistor(Double.parseDouble(temp[0]),Double.parseDouble(temp[1]),
						Double.parseDouble(temp[2]),Double.parseDouble(temp[3]),Double.parseDouble(temp[4]),Double.parseDouble(temp[5])));
			}

		} catch (IOException e) {

			e.printStackTrace();

		}
		return resistor;// return data
	}
	

}
