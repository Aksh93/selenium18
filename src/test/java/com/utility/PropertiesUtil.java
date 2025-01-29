package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.constants.Env;

public class PropertiesUtil {
//job of this file is to read property file
	
	public static String readProperty(Env env, String PropertyName) {
		//System.out.println(System.getProperty("user.dir"));
		File propFile = new File(System.getProperty("user.dir") + "\\config\\"+env+".properties");
		Properties properties = new Properties();
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(propFile);
			properties.load(fileReader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String value= properties.getProperty(PropertyName);
		
		return value; 
	}
}
