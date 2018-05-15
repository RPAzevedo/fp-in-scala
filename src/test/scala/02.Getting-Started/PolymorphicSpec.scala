import org.scalatest._
import fpinscala.functions.Polymorphic

class PolymorphicSpec extends FunSpec with Matchers {
  describe("Is Sorted?") {
    describe("Numbers") {
      def orderedInt(a: Int, b: Int): Boolean = a <= b

      it("an empty array is sorted") {
        Polymorphic.isSorted(Array(), orderedInt) shouldBe true
      }
      it("an array with a single element is sorted") {
        Polymorphic.isSorted(Array(1), orderedInt) shouldBe true
      }
      it("[1,1,3,3] is sorted") {
        Polymorphic.isSorted(Array(1,2,3,4), orderedInt) shouldBe true
      }
      it("[1,2,3,4] is sorted") {
        Polymorphic.isSorted(Array(1,2,3,4), orderedInt) shouldBe true
      }
      it("[1,3,2,4] is not sorted") {
        Polymorphic.isSorted(Array(1,3,2,4), orderedInt) shouldBe false
      }
    }

    describe("Names") {
      def orderedString(a: String, b: String): Boolean = a <= b

      it("an empty array is sorted") {
        Polymorphic.isSorted(Array(), orderedString) shouldBe true
      }
      it("an array with a single element is sorted") {
        Polymorphic.isSorted(Array("Rafael"), orderedString) shouldBe true
      }
      it("[Gus, Leo, Leo, Raf] is sorted") {
        Polymorphic.isSorted(Array("Gus", "Leo", "Leo", "Raf"), orderedString) shouldBe true
      }
      it("[Gus, Leo, Raf] is sorted") {
        Polymorphic.isSorted(Array("Gus", "Leo", "Raf"), orderedString) shouldBe true
      }
      it("[Raf, Leo, Raf] is not sorted") {
        Polymorphic.isSorted(Array("Raf", "Leo", "Raf"), orderedString) shouldBe false
      }
    }
  }
}
