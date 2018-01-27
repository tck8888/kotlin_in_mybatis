package com.tck.mapper;

import com.tck.domain.User;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 * @Author: tck
 * @Description:
 * @Date: Created in 10:45 2018/1/27
 */
public interface TestMapper {
  @SelectProvider(type = TestProvider.class, method = "findUserById")
  List<User> findUserByNames(String name);

  class TestProvider {
    public String findUserById(String name) {
      return new SQL() {
        {
          SELECT("*");
          FROM("user_info");
          if (name != null && name != "") {
            WHERE("user_name like #{name}");
          }
        }
      }.toString();
    }
  }
}
