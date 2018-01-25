package com.tck

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@MapperScan("com.tck.mapper")
class KotlinInMybatisApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinInMybatisApplication::class.java, *args)
}
