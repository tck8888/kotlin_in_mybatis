package com.tck.domain

/**
 * Created by tck on 2018/1/25.
 */
class User {
    var id: Int = 0
    var user_name: String = ""
    var user_password: String = ""
    var mobile: String = ""
    override fun toString(): String {
        return "User(id=$id, user_name='$user_name', user_password='$user_password', mobile='$mobile')"
    }


}