package testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import base.TestBase;


public class LogTest extends TestBase {
	public Logger log = LogManager.getLogger(LogTest.class.getName());
	@Test
	public void Login_01() {
		
		log.debug("i am from debug");
		
		log.error("i am from error");
		
		log.info("i am from info");
		
		log.fatal("i am from fatal===");
		
		System.out.println("we are done");
	}
	
	@Test
	public void Login_02() {
		
		log.debug("i am from debug");
		
		log.error("i am from error");
		
		log.info("i am from info");
		
		log.fatal("i am from fatal===");
		
		System.out.println("we are done");
	}
}

