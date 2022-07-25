import org.scalatest.funsuite.AnyFunSuite

class FizzBuzzTest extends AnyFunSuite {
  test("lists the numbers up to one") {
    assert(FizzBuzz.generate(1) === "1")
  }
}