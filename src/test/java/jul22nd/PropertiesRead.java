package jul22nd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis=new FileInputStream("D:\\FLM0730WS\\FrameworkAutomation\\config.properties");
		
		Properties pr=new Properties();
		
		pr.load(fis);
		
		System.out.println(pr.getProperty("browser"));
		System.out.println(pr.getProperty("102"));
		System.out.println(pr.getProperty("url"));
		
		
		System.out.println("End of Program");
		

	}

}
