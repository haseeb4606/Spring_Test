package spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import poso.School;
import poso.Student;

public class Result {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		StudentService st = (StudentService) ctx.getBean("studentSrv");
		st.doRegister();
		
		Student su = (Student) ctx.getBean("studnt");
		
		System.out.println(su);
		
		
		School sc = (School) ctx.getBean("scs");
		
		System.out.println(sc);

	}

}
