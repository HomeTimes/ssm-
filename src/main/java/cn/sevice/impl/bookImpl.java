package cn.sevice.impl;

import cn.dao.bookDao;
import cn.domain.book;
import cn.sevice.bookSdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookImpl")
public class bookImpl implements bookSdao {
    @Autowired
    private bookDao bookDao;
    public book findID(book book) {
              try{
                  return bookDao.findID(book.getName(),book.getPassword());
              }catch (Exception e){
                  return null;
              }

    }

    public List<book> AllBook() {
        return bookDao.AllBook();
    }
//    找指定的那本书
    public book findbookID(int id) {
        return bookDao.findbookID(id);
    }

    public void updatebook(book bookname) {
//        bookDao.updatebook(bookname);
        System.out.println("111");
    }

    public void updatebook1book2(int id1, int id2, int count) {
//            book  book1 = this.findID(id1);
//            book  book2 = this.findID(id2);
//            book1.setCount(book1.getCount()-count);
//            book2.setCount(book2.getCount()+count);
//            this.updatebook(book1);
////            int i=10 / 0;
//            this.updatebook(book2);
    }
//    public void test() {
//        System.out.println("ssssssss");
//    }
}
