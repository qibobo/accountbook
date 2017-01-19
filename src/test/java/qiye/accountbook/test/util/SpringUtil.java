package qiye.accountbook.test.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {
	private static ApplicationContext context;
	static{
		context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	
	public static Object getBean(String beanName){
		return context.getBean(beanName);
	}
	 
	
}
