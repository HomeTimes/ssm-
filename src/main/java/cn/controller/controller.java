package cn.controller;

import cn.domain.book;
import cn.sevice.bookSdao;
import cn.sevice.impl.bookImpl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/demo1")
@CrossOrigin
public class controller {
    @Autowired
    private  bookSdao bookSdao;
    @PostMapping("/findbook")
    public  book find(@RequestBody book book){
//        book bookid = bookSdao.findID(id);
//        System.out.println(bookid);
        cn.domain.book bookSdaoID = bookSdao.findID(book);
        System.out.println(bookSdaoID);
        return  bookSdaoID;
    }
    @GetMapping("/findallBook")
    public List<book> AllBook(){
       return bookSdao.AllBook();
    };
    @GetMapping("/findbookID")
    public book findbookID(int id) {
        return bookSdao.findbookID(id);
    }

     @PostMapping("/updatebook")
     public  void updatebook(@RequestBody book book){
               bookSdao.updatebook(book);
     }
     @PostMapping("/insert")
     public  void  insert(@RequestBody book book){
          bookSdao.insert(book);
     }
         @GetMapping("/delete")
        public  void delete(@RequestParam("id")int id){
                 bookSdao.delete(id);
        }
}
