package com.example.scalaproject

/**
 * Created by jorjahung on 31/07/2014.
 */
class FizzBuzz {
  def buzz(x: Int) : Any = {
    if (divisibleBy(x, 3) && divisibleBy(x, 5))
      "FizzBuzz"
    else if (divisibleBy(x, 3))
      "Fizz"
    else if (divisibleBy(x, 5))
      "Buzz"
    else
      x
   }

  def divisibleBy(x: Int, y: Int): Boolean = {
    x % y == 0
  }
 }
