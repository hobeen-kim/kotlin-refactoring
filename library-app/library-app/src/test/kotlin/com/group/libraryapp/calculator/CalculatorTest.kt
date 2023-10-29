package com.group.libraryapp.calculator

import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

fun main() {
    val calculatorTest = CalculatorTest()

    calculatorTest.addTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideExceptionTest()
}

class CalculatorTest {

    fun addTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.add(3)

        //then
        val expectedCalculator = Calculator(8)
        if(calculator != expectedCalculator) {
            throw IllegalStateException()
        }
    }

    fun multiplyTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.multiply(3)

        //then
        val expectedCalculator = Calculator(15)
        if(calculator != expectedCalculator) {
            throw IllegalStateException()
        }
    }

    fun divideExceptionTest() {
        //given
        val calculator = Calculator(5)

        //when
        try {
            calculator.divide(0)
        } catch (e : IllegalArgumentException) {
            //테스트 성공
            return;
        } catch (e : Exception) {
            throw java.lang.IllegalStateException();
        }

        throw java.lang.IllegalArgumentException("기대하는 예외가 나오지 않았습니다.")
    }
}