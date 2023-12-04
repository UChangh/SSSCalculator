package com.example.ssscalculatoractivity

import java.lang.NumberFormatException

fun main() {
    var ans = 0.0
    var clear = 0
    var num = listOf<String>()

    val add = AddOperation()
    val sub = SubstractOperation()
    val mul = MultiplyOperation()
    val div = DivideOperation()
    val mod = ModOperation()

    while(true) {
        try {
            when (clear) {
                0 -> {
                    println("수식을 입력해 주세요. 형식 : 1 + 1")
                    num = readln().split(" ")
                }
                1 -> {
                    println("수식을 완성해 주세요. $ans + 1")
                    num = (num[0] + " " + readln()).split(" ")
                }
            }
            ans = when {
                num[1] == "/" && num[2].toDouble() == 0.0 -> {
                    println("0으로 나눌 수 없습니다.")
                    0.0
                }
                else -> when (num[1]) {
                    "+" -> add.ans(num[0].toDouble(), num[2].toDouble())
                    "-" -> sub.ans(num[0].toDouble(), num[2].toDouble())
                    "*" -> mul.ans(num[0].toDouble(), num[2].toDouble())
                    "/" -> div.ans(num[0].toDouble(), num[2].toDouble())
                    "%" -> mod.ans(num[0].toDouble(), num[2].toDouble())
                    else -> break
                }
            }
            println(String.format("%.3f",ans))
            println("추가 계산 : 1, 초기화 : 0")
            clear = readln().toInt()
        } catch (e:NumberFormatException) {
            println("Error! : 숫자를 다시 입력해 주세요")
            break
        }
    }
}