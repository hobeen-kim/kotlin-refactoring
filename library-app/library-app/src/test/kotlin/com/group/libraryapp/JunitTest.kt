package com.group.libraryapp

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JunitTest {

    companion object {
        @BeforeAll
        @JvmStatic
        fun beforeAll() {
            println("before all test")
        }

        @AfterAll
        @JvmStatic
        fun afterAll() {
            println("after all test")
        }
    }

    @BeforeEach
    fun beforeEach() {
        println("before each test")
    }

    @AfterEach
    fun afterEach() {
        println("after each test")
    }



    @Test
    fun test1() {
        println("test 1")
    }

    @Test
    fun test2() {
        println("test 2")
    }


}