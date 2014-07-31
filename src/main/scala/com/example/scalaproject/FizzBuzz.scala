package com.example.scalaproject

/**
 * Created by jorjahung on 31/07/2014.
 */
class FizzBuzz {
  def buzz(x: Int) : String = {
    if (x % 15 == 0)
      "FizzBuzz"
    else if (x % 3 == 0)
      "Fizz"
    else
      "Buzz"
   }
 }
