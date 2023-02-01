package OrangeBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Dataclass {
	public String fromPropertiesfile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\note\\orange.properties");
		Properties p=new Properties();
		p.load(fis);
	    String Url=	p.getProperty(key);
	    return Url;	
	}
	void m1() throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\note\\orange.properties");
		Properties p=new Properties();
		p.load(fis);
		String name=p.getProperty("Url");
		System.out.println(name);
	}

}
