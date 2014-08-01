package com.example.scalaproject

/**
 * Created by jorjahung on 31/07/2014.
 */
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
      return answer
   }

  def divisibleBy(x: Int, y: Int): Boolean = {
    x % y == 0
  }
 }
