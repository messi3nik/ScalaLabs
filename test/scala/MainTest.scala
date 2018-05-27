import Laba.{Composited, Prime}
import org.scalatest.FunSuite

import scala.collection.mutable.ArrayBuffer

class MainTest extends FunSuite {

  val list: List[Int] = List(1,2,3,4,5)
  val list1: List[String] = List("D","C++","f#","Scala")
  val arr: ArrayBuffer[Double] = ArrayBuffer()
  /*
  test("first") {
    assert(Laba.nElementRecur(list, 2) === 3)
  }

  test("second"){
    assert(Laba.findSquaresOnTheInterval(1,4)===ArrayBuffer(1,2))
  }

  test("third"){
    assert(Laba.findSquaresOnTheIntervalReq(1,4,arr)===ArrayBuffer(1,2))
  }

  test("4"){
    assert(Laba.nElement(list, 2) === 3)
  }
*/
  /*
  test("secondLab1"){
    assert(Laba.findAverageNum(list)===3)
  }

  test("secondLab2"){
    assert(Laba.foldList(List(1,2,3))===List(1,1,2,2,3,3))
  }

  test("secondLab3"){
    assert(Laba.findCPP(list1)===List("C++"))
  }*/




  test("ThirdLab1"){
    assert(Laba.func(List(Prime(3),Composited(9)))===List(1,3))
  }

  test("ThirdLab2_1") {
    val num = new Laba.complexNumber(-10, 10)
    assert(Laba.module(num) === 14.142135623730951)
  }

  test("ThirdLab2_2"){
    val num = new Laba.scalarNumber(10)
    assert(Laba.module(num)===10)
  }

}