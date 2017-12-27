package com.ssii.day02

import breeze.linalg.{DenseVector, all, any}

/**
  * Created by xiewendomg on 2017/11/13.
  */
object test05 {
  def main(args: Array[String]): Unit = {
    val a_5 =DenseVector(true,false,true)
    val b_5 =DenseVector(false,true,true)
    println(a_5:&b_5)
    println(a_5:|b_5)
    println(!a_5)
    val a_5_2=DenseVector(1.0,0.0,-2.0)
    println(any(a_5_2))
    println(all(a_5_2))
  }
}
