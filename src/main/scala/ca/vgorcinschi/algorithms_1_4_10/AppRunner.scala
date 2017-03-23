package ca.vgorcinschi.algorithms_1_4_10

import scala.io.Source

object AppRunner extends App{
  val strings = Source.fromFile("src/main/resources/tinyW.txt").getLines().toArray
  val ints = for (item <-strings) yield item.toInt
  println(s"this is the intial array - ${ints.mkString("{", ",", "}")}")
  for(int <- ints) println(f"key $int is at ${BinarySearch.indexOf(ints.sorted, int)}")
}