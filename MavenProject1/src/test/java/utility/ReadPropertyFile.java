package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader f= new FileReader("D:\\EclipseMavenProjectWorkspace\\MavenProject1\\src\\test\\resources\\configfiles\\config.properties");
		Properties p = new Properties();
		p.load(f);
		
	}

}
