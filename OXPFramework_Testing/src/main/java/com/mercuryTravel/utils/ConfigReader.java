package com.mercuryTravel.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties readConfigProperties(String filename) throws Exception{
		
		filename = filename.trim();
		
		InputStream fileReader= new FileInputStream(filename);
		
		Properties property = new Properties();
		
		property.load(fileReader);
		
		return property;
		
	}

}
