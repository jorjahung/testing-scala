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

  }
}
