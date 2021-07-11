package cn.test;

import cn.dao.bookDao;
import cn.domain.book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class testMapping {
    @Test
  public void run() throws Exception {
//       加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMaperConfig.xml");
//        创建SqlSessionFactory对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
//        获取sqlSession对象
        SqlSession sqlSession = build.openSession();
//        获取接口的代理对象
        bookDao mapper = sqlSession.getMapper(bookDao.class);
//        调用方法
        book bookid = mapper.findID("111",222);
//        关闭资源
        sqlSession.close();
        in.close();
        System.out.println(bookid);
//        注意：增删改，要提交事务 sqlSession.commit();

    }
}
