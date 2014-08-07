package com.example.scalaproject

class FizzBuzz {
//  def buzz(x: Int) : Any = {
//    var answer = ""
//    if (divisibleBy(x, 3))
//      answer = "Fizz"
//    if (divisibleBy(x, 5))
//      answer += "Buzz"
//    if (answer == "")
//      x
//    else
//      answer
//   }


  def buzz(number: Int) : Any = number match {
    case x if x divisibleBy 15 => "FizzBuzz"
    case x if x divisibleBy 3 => "Fizz"
    case x if x divisibleBy 5 => "Buzz"
    case _ => number
  }

  implicit class RichInt(val self: Int) {
    def divisibleBy(y: Int): Boolean = self % y == 0
  }
 }

