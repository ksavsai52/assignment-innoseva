package com.test.util;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Helper {

	private String path = "";
	
	public Helper(String path) {
		this.path = path;
	}
	
	public List<String[]> getTable() {
		List<String[]> table = new ArrayList<String[]>();
		BufferedReader br = null;
		String line = "";
		String splitBy = ",";
//		File file = new File(path);
//		if (!file.exists()) {
//			file.mkdirs();
//			file.mkdir();
//		}
		try {
			br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(splitBy);
				table.add(data);
			}
			return table;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
	
}
