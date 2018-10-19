package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CongifReader {
	Properties pro;
	
	public CongifReader(){
		
		try {
			
			File src=new File("./Config/config.prop"); 
			
			FileInputStream fis=new FileInputStream(src);
			
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			
		System.out.println("Exception is =="+e.getMessage());
		}
	}

	public String getChromeDriver(){
		String path=pro.getProperty("ChromeDriver");
		return path;
	}
	
	public String getUrl(){
		String url=pro.getProperty("URL");
		return url;
	}
	
	public String Username(){
		String name=pro.getProperty("Username");
		return name;
	}
	public String Password(){
		String pw=pro.getProperty("password");
		return pw;
	}
}
