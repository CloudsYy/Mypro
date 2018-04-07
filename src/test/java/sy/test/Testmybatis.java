package sy.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sy.model.User;
import sy.service.UserServiceI;

public class Testmybatis {
	private UserServiceI userservice;
	private ApplicationContext ac;
	
	@Before
	public void before() {
		ac=new ClassPathXmlApplicationContext(new String[] {"spring.xml","spring-mybatis.xml"});
	    userservice=(UserServiceI) ac.getBean("userService");
	}
	
	@Test
	public void test1() {
		User user=userservice.getUserById("3");
	    System.out.println(user.getName());
	}

}
