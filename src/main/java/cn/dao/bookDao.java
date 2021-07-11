package cn.dao;

import cn.domain.book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface bookDao {
   @Select("select * from book where name = #{name} and password=#{password}")
   public book findID(@Param("name") String  name,@Param("password") int password);
   @Select( "select * from book")
   public List<book> AllBook();
   @Select("select * from book where id = #{id}")
   public book findbookID(int id);
//   public void  updatebook ( book bookname);
}
