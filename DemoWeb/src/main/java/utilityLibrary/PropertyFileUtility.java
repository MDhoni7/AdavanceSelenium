package utilityLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility extends WebDriverUtility{

	/**
	 * this method is used to give the data which is stored in the property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public static String propertydata(String key) throws IOException  {
		FileInputStream fis = new FileInputStream(Iconstant.property_path);
		
		p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}
