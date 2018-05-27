import java.awt.Composite

import scala.annotation.tailrec
import scala.collection.mutable.ArrayBuffer

object Laba extends App {
  //first
  def nElementRecur(list: List[Int], index: Int): Int = {
    if (list.length >= index) {
      list(index)
    }
    else 0
  }

  def nElement(list: List[Int], index: Int): Int = {
    @tailrec
    def nEle(list: List[Int], index: Int, nElem: Int): Int = {
      if (nElem == index)
        list(nElem)
      else nEle(list, index, nElem + 1)
    }

    nEle(list, index, 0)
  }

  //second
  def isSquare(i: Int): Int = {
    if (math.round(math.sqrt(i)) * math.round(math.sqrt(i)) == i) 1
    else -1
  }

  def findSquaresOnTheInterval(startValue: Int, endValue: Int): IndexedSeq[Double] = {
    def vector =
      for (i <- startValue to endValue if isSquare(i) == 1) yield math.sqrt(i)

    vector
  }

  @tailrec
  def findSquaresOnTheIntervalReq(startValue: Int, endValue: Int, arr: ArrayBuffer[Double]): ArrayBuffer[Double] = {
    if (startValue > endValue) arr
    else {
      if (isSquare(startValue) == 1) arr += math.sqrt(startValue)
      findSquaresOnTheIntervalReq(startValue + 1, endValue, arr)
    }
  }



  //SecondLab
  //1task
  def findAverageNum(list: List[Int]): Double = {
    @tailrec
    def findAN(list: List[Int], index: Int, sum: Int): Int = {
      if (index == list.length)
        sum
      else {
        findAN(list, index + 1, sum + list(index))
      }
    }
    findAN(list, 0, 0) / list.length
  }

  //2task
  def foldList(list: List[Int]): List[Int] = {
    list.foldRight(List[Int]())((a, z) => z.::(a).::(a))
  }


  //3task
  def findCPP(list: List[String]): List[String] = {
    list.filter(isCPP)
  }

  def isCPP(i: String): Boolean = {
    i.endsWith("++")
  }




  //ThirdLaba
  //1task
  /*def antiMulticate(list: List[Int]): List[Int] = {
    list.map((i: Int) => isPrime(i))
  }

  def isFactor(number: Int, potentialFactor: Int) =
    number % potentialFactor == 0

  def factors(number: Int) =
    (1 to number) filter (isFactor(number, _))

  def sum(factors: Seq[Int]) =
    factors.foldLeft(0)(_ + _)

  def isPrime(number: Int): Int ={
    if (sum(factors(number)) == number + 1)
      number * 2
    else number*3
  }*/

  def func(list: List[num]): List[Double] ={
    list.map((i:num)=>macth(i))
  }

  def macth(elem: num): Double ={
    elem match {
      case Prime(_) => elem.unapply()
      case Composited(_) => elem.unapply()
    }
  }

  abstract class num{
    def unapply():Double{}
  }

  case class Prime(num: Int) extends num{
    def unapply():Double={
      num/2
    }
  }

  case class Composited(num: Int) extends num{
    def unapply():Double={
      num/3
    }
  }

  //2task

  abstract class number{
    def unapply():Double{}
  }
  case class complexNumber(real: Double, imaginary: Double) extends number {
    def unapply():Double={
      math.sqrt(real*real+imaginary*imaginary)
    }
  }
  case class scalarNumber(real:Double) extends number {
    def unapply():Double={
      if(real<0) real*(-1)
      else real
    }
  }

  def module(ourClass: number):Double={
    ourClass match {
      case complexNumber(_,_) => ourClass.unapply()
      case scalarNumber(_)=> ourClass.unapply()
    }
  }
}
