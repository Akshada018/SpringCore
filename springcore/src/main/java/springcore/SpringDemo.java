package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcore.Student;

public class SpringDemo {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");	
        Object student1 = context.getBean("student1");
        System.out.println(student1);
        //student1.display();
        
	}

}
