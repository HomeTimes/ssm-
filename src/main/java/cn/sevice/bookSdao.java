package cn.sevice;

import cn.domain.book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface bookSdao {
    public book findID(book book);
    public List<book> AllBook();
    public book findbookID(int id);
    public void  updatebook ( book bookname);
    public void  updatebook1book2 (int id1,int id2,int count);
//    public void test();

}
