package Com.model;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jDemo 
{
static Logger logger = Logger.getLogger(Log4jDemo.class);   
public static void main(String[] args) 
{
PropertyConfigurator.configure("log4j.properties");
logger.info("Info message");
logger.debug("Debug message");
logger.warn("Warning message");
logger.error("Error message");
logger.fatal("Fatal message");
logger.fatal("GitHub Message");

Divisionclass dc = new Divisionclass();
try
{
int num1=90;
int num2=0;
dc.division(num1, num2);
}
catch(ArithmeticException e)
{
	int num1=90;
	int num2=5;
	dc.division(num1, num2);			
	logger.fatal("Catch block is executed successfully");
}	
}
}