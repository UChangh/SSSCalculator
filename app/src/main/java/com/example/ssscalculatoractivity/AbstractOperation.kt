package com.example.ssscalculatoractivity

abstract class AbstractOperation {
    abstract fun ans(number1: Double, number2: Double): Double
}

class AddOperation:       AbstractOperation() { override fun ans(number1: Double, number2: Double): Double = number1 + number2 }
class SubstractOperation: AbstractOperation() { override fun ans(number1: Double, number2: Double): Double = number1 - number2 }
class MultiplyOperation:  AbstractOperation() { override fun ans(number1: Double, number2: Double): Double = number1 * number2 }
class DivideOperation:    AbstractOperation() { override fun ans(number1: Double, number2: Double): Double = number1 / number2 }
class ModOperation:       AbstractOperation() { override fun ans(number1: Double, number2: Double): Double = number1 % number2 }