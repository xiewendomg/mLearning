package com.ssii.day02

import breeze.linalg.DenseVector
import breeze.numerics._

/**
  * Created by xiewendomg on 2017/11/14.
  */
object test07 {
  def main(args: Array[String]): Unit = {
    val a_7=DenseVector(1.2,0.6,-2.3)
    println(round(a_7))
    println(ceil(a_7))
    println(floor(a_7))
    println(signum(a_7))
    println(abs(a_7))

  }
}
