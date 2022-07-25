import org.scalatest.funsuite.AnyFunSuite

class FizzBuzzTest extends AnyFunSuite {
  test("lists the numbers up to one") {
    assert(FizzBuzz.generate(1) === "1")
  }
  test("lists the numbers up to two") {
    assert(FizzBuzz.generate(2) === "1, 2")
  }
  test("replaces Fizz divisible by three") {
    assert(FizzBuzz.generate(3) === "1, 2, Fizz")
  }
  test("replaces Buzz when divisible by five"){
    assert(FizzBuzz.generate(5) === "1, 2, Fizz, 4, Buzz")
  }
  test("replaces FizzBuzz when divisible by five and three") {
    assert(FizzBuzz.generate(15) === "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz")
  }
}