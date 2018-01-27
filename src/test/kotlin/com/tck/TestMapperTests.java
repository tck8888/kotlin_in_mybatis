package com.tck;

import com.tck.domain.User;
import com.tck.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: tck
 * @Description:
 * @Date: Created in 10:40 2018/1/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapperTests {

  @Resource
  private TestMapper testMapper;

  @Test
  public void testFind() {
    List<User> tck = testMapper.findUserByNames("tck0");
    for (User user :
            tck) {
      System.err.println(user.toString());
    }
  }
}
