import cn.controller.controller;
import cn.dao.bookDao;
import cn.domain.book;
import cn.sevice.bookSdao;
import cn.sevice.impl.bookImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class daoTest {
//    ApplicationContext at;
//    @Before
//    public void  pre(){
//        at=new ClassPathXmlApplicationContext("application.xml");
//    }
//     @Test
//    public  void dao(){
//        bookDao book = at.getBean(bookDao.class);
//        cn.domain.book book1 = book.findID(1);
//        System.out.println(book1);
//    }
//    @Test
//    public  void sevice(){
//        bookSdao bookimpl = at.getBean(bookSdao.class);
//        book book2 = bookimpl.findID(1);
//        System.out.println(book2);
//    }
////    @Test
////////    public  void sava(){
////////        bookSdao bookimpl = at.getBean(bookSdao.class);
////////        book book=bookimpl.findID(1);
////////        book.setCount(4);
////////        bookimpl.updatebook(book);
////////    }
//////演示转账事务
//    @Test
//    public  void updatecount(){
//        bookSdao bookimpl = at.getBean(bookSdao.class);
//        bookimpl.updatebook1book2(1,2,2);
//    }
//    @Test
//    public void controller(){
//        controller controller = new controller();
//        book finding = controller.finding("4");
//        System.out.println(finding);
//    }

}