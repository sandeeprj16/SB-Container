package papa;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TastA {
	public static void main(String[] args) {
		ConfigurableApplicationContext cmc=new ClassPathXmlApplicationContext("configA.xml");
		
		Student student=(Student) cmc.getBean("studentBeanid");
		student.study();
	}
}
