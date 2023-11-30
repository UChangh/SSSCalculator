package com.example.ssscalculatoractivity

class ModOperation:AbstractOperation() {
    override fun ans(number1: Double, number2: Int): Double = number1 % number2
}