package com.tck.mapper

import com.tck.domain.User
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

/**
 * Created by tck on 2018/1/25.
 */
interface UserMapper {


    @Insert("insert INTO user_info(user_name,user_password,mobile) values(#{user_name},#{user_password},#{mobile})")
    fun insertUser(user: User)

    @Select("select * from user_info where id = #{id}")
    fun findUserById(@Param("id") id: Int): User
}