package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javafx.util.*;

public class IntakePlan {
	
	private List<List<String>> format = new ArrayList<List<String>>();
	
	public IntakePlan() {
		
	}
	
	/**
	 * Add predefined content to the format
	 */
	public void initialize() {
		format = null;
	}
	
	/**
	 * Add new criteria to be put in the output
	 */
	public void match() {
		
	}
	
	/**
	 * Read from file of the new criteria
	 * @return A list of pairs with key: Provinces, value: Requirements
	 */
	public List<Pair<String, String>> readFile(File file){
		return null;
	}
}
