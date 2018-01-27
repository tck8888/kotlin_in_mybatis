package com.tck.mapper

import com.tck.domain.User
import org.apache.ibatis.annotations.*
import org.apache.ibatis.jdbc.SQL


/**
 * Created by tck on 2018/1/25.
 */
@Mapper
interface UserMapper {


    @Insert("insert INTO user_info(user_name,user_password,mobile) values(#{user_name},#{user_password},#{mobile})")
    fun insertUser(user: User)

    @Select("select * from user_info where id = #{id}")
    fun findUserById(@Param("id") id: Int): User

    @SelectProvider(type = UserMapperProvider::class, method = "findUserById")
    fun findUserByName(name: String): List<User>

    class UserMapperProvider {
        fun findUserById(name: String): String {

            return SQL()
                    .SELECT("*")
                    .FROM("user_info")
                    .WHERE("user_name=${name}")
                    .toString()
        }
    }
}