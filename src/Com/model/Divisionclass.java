package Com.model;

import org.apache.log4j.Logger;

public class Divisionclass 
{

	static  Logger logger = Logger.getLogger(Divisionclass.class);
	
	public int division(int a,int b)
	{
		int c=a/b;
		logger.info("Info message under Divisionclass");
		return c;
		
	}
}
