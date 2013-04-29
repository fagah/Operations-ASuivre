package org.os;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OSSpring {

	public OSSpring() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("osprojectApplicationContext.xml");
		
		DossierService service = (DossierService) appContext.getBean("dossierService");
		service.findDossiersSpring();
		
		
		System.out.println("DONE");
	
	}

}
