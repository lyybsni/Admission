package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javafx.util.*;

//import com.csvreader.*;

public class IntakePlan {

	public IntakePlan() {

	}

	public static void main(String[] args) {
		List<Pair<String, String>> general = null;
		try {
			general = readFile(new File("data/province_name.txt"));
			System.out.println(general);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Pair<String, String> temp: general) {
//			System.out.println(temp.getKey());
			if (temp.getKey().equals("XJ")) {
				System.out.println(temp.getValue());
			}
		}
	}

	/**
	 * Add predefined content to the format
	 */
	public void initialize() {
//		format = null;
	}

	/**
	 * Add new criteria to be put in the output
	 */
	public void match() {

	}

	/**
	 * Read from file of the new criteria
	 * @return A list of pairs with key: Provinces, value: Requirements
	 * @throws IOException 
	 */
	public static List<Pair<String, String>> readFile(File file) throws IOException{
		List<Pair<String, String>> list = new ArrayList<Pair<String, String>>();

		FileInputStream myscanner = new FileInputStream(file);
		BufferedReader buf = new BufferedReader(new InputStreamReader(myscanner,"UTF-16"));
		while(buf.ready()) {
			String line = buf.readLine().trim();
			
			String[] temp = line.split("\\s");
//			System.out.println(temp.length);
			Pair<String, String> tempPair = new Pair<String, String>(temp[0], temp[1]);
			list.add(tempPair);
//			System.out.println(list);
		}
		myscanner.close();
		return list;
	}
}
