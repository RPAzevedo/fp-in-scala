import org.scalatest._
import fpinscala.functions.Recursive

class RecursiveSpec extends FunSpec with Matchers {
  describe("Fibonacci") {
    it("calculates for 0") {
      Recursive.fibonacci(0) shouldBe 0
    }
    it("calculates for 1") {
      Recursive.fibonacci(1) shouldBe 1
    }
    it("calculates for 2") {
      Recursive.fibonacci(2) shouldBe 1
    }
    it("calculates for 3") {
      Recursive.fibonacci(3) shouldBe 2
    }
    it("calculates for 4") {
      Recursive.fibonacci(4) shouldBe 3
    }
    it("calculates for 5") {
      Recursive.fibonacci(5) shouldBe 5
    }
    it("calculates for 6") {
      Recursive.fibonacci(6) shouldBe 8
    }
    it("calculates for 7") {
      Recursive.fibonacci(7) shouldBe 13
    }
  }

  describe("Factorial") {
    it("calculates for 1") {
      Recursive.factorial(1) shouldBe 1
    }
    it("calculates for 2") {
      Recursive.factorial(2) shouldBe 2
    }
    it("calculates for 3") {
      Recursive.factorial(3) shouldBe 6
    }
    it("calculates for 4") {
      Recursive.factorial(4) shouldBe 24
    }
  }
}
