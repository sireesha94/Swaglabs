package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass extends BaseClass{
	

	public static String rddata(String key) throws IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//Config.properties");
		Properties prop = new Properties();
		prop.load(file);
		String value = prop.get(key).toString();
		return value;
	}

}
