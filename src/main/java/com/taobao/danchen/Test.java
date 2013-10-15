package com.taobao.danchen;

import java.util.Random;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * ²Î¿¼:
 * http://aishangtao.iteye.com/blog/472478
 * http://docs.spring.io/spring/docs/1.2.x/reference/beans.html
 * http://blog.csdn.net/rj042/article/details/6966547
 * @author danchen
 *
 */
public class Test {

	public static void main(String[] args) {
	   ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
		        new String[] {"beans/sqlMapClientBean.xml", "beans/biz-ao.xml"});
	   BeanFactory factory = (BeanFactory) appContext;
       IPersonDAO iPersonDAO = (IPersonDAO) factory.getBean("iPersonDAO");
       
       for(int i=0;i<10;i++){
    	   Person person = new Person();
    	   Random random = new Random();
    	   person.setId(random.nextLong());
    	   person.setAge(31);
    	   person.setName("zhaolin");
    	   person.setNick("danchen");
    	   try {
			iPersonDAO.insert(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
       }
       
       try {
		Person person = iPersonDAO.getPersonById(1l);
		System.out.println(person);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

}
