package CommonUtils;

import java.util.Properties;
import java.util.ResourceBundle;

public class ConfigReader {

	//private ResourceBundle prop;
	
	public static ResourceBundle init_Prop()
	{
		ResourceBundle prop = ResourceBundle.getBundle("config");
   	 	return prop;		
	}
	
	   
}
