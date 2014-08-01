package com.example.scalaproject

class FizzBuzz {
  def buzz(x: Int) : Any = {
    var answer = ""
    if (divisibleBy(x, 3))
      answer = "Fizz"
    if (divisibleBy(x, 5))
      answer += "Buzz"
    if (answer == "")
      x
    else
      answer
   }

  def divisibleBy(x: Int, y: Int): Boolean = {
    x % y == 0
  }
 }
