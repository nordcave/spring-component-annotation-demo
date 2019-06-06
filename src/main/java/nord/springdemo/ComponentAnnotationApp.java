package nord.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import nord.springdemo.domain.Organization;
import nord.springdemo.domain.promotion.TradeFair;

public class ComponentAnnotationApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		TradeFair tradeFair = (TradeFair) ctx.getBean("myfair");
		System.out.println(tradeFair.specialPromotionalPricing());
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
