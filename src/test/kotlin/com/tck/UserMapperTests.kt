package com.tck

import com.tck.domain.User
import com.tck.mapper.UserMapper
import org.apache.commons.logging.LogFactory
import org.junit.Test

import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 * Created by tck on 2018/1/25.
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class UserMapperTests {

    @Resource
    lateinit var userMapper: UserMapper

    @Test
    fun testInsert() {
        for (i in 0..9) {
            val user = User()
            user.mobile = "188888888" + i
            user.user_name = "tck" + i
            user.user_password = "123456" + i
            userMapper.insertUser(user)
        }
    }

    @Test
    fun testSelectUser() {
        val user = userMapper.findUserById(8)
        println(user.toString())
    }

    @Test
    fun testFindUserByName() {
        for (user in userMapper.findUserByName("tck0")) {
            println(user.toString())
        }
    }
}