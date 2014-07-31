package com.example.scalaproject.unit

import com.example.scalaproject.FizzBuzz
import org.scalatest.{Matchers, FunSpec}

/**
 * Created by jorjahung on 31/07/2014.
 */
class FizzBuzzTest extends FunSpec with Matchers {

  describe("FizzBuzz"){
    val fizz = new FizzBuzz
    it("returns 'Fizz' when the number is divisible by 3"){
      fizz.buzz(3) shouldBe "Fizz"
    }

    it("returns 'Buzz' when the number is divisible by 5"){
      fizz.buzz(5) shouldBe "Buzz"
    }

    it("returns 'FizzBuzz' when the number is divisible by 3 and 5"){
      fizz.buzz(15) shouldBe "FizzBuzz"
    }

    it("returns the number when the number is neither divisible by 3 or by 5"){
      fizz.buzz(4) shouldBe 4
    }
  }
}
