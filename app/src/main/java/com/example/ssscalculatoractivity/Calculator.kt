package com.example.ssscalculatoractivity

import java.lang.NumberFormatException

fun main() {
    var ans = 0.0
    var clear = 0
    var num1 = 0
    var num2 = 0
    var op = ""
    var mod = 0.0

    while(true) {
        try {
            when (clear) {
                0 -> {
                    mod = 0.0
                    println("숫자를 입력해 주세요")
                    num1 = readln().toInt()
                }
                1 -> {
                    mod = ans%1.0
                    num1 = ans.toInt()
                }
            }

            println("연산자를 입력해 주세요")
            op = readln()
            println("숫자를 입력해 주세요")
            num2 = readln().toInt()

            ans = when (op) {
                "+" -> AddOperation().ans(num1 + mod,num2)
                "-" -> SubstractOperation().ans(num1 + mod, num2)
                "*" -> MultiplyOperation().ans(num1 + mod, num2)
                "/" -> DivideOperation().ans(num1 + mod, num2)
                "%" -> ModOperation().ans(num1 + mod, num2)
                else -> break
            }
            println(String.format("%.3f",ans))
            println("추가 계산 : 1, 초기화 : 0")
            clear = readln().toInt()
        } catch (e:ArithmeticException) {
            println("Error! : Divide by Zero")
            break
        } catch (e:NumberFormatException) {
            println("Error! : 숫자를 다시 입력해 주세요")
            break
        }
    }
}