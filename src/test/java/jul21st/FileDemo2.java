package jul21st;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		
		
		File f=new File("D:\\FLM0730PM\\softwares\\xyz.png");
		
		System.out.println( f.createNewFile());
		
		System.out.println("End of Program");

	}

}
