package cn.test;


import cn.domain.book;
import cn.sevice.impl.bookImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    @Test
   public void testSevice(){
        ApplicationContext  ac=new ClassPathXmlApplicationContext("classpath:application.xml");
        bookImpl bookImpl =(bookImpl) ac.getBean("bookImpl");
//        bookImpl.test();
    }
}
