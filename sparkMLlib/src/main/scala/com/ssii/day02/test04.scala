package com.ssii.day02

import breeze.linalg.{Axis, DenseMatrix, DenseVector, accumulate, sum, trace}

/**
  * Created by xiewendomg on 2017/11/13.
  */
object test04 {

  def main(args: Array[String]): Unit = {
    val a_4=DenseMatrix((1.0,2.0,3.0),(4.0,5.0,6.0),(7.0,8.0,9.0))
    println(sum(a_4))
    println(sum(a_4,Axis._0))
    println(sum(a_4,Axis._1))
    println(trace(a_4))
    println(accumulate(DenseVector(1,2,3,4)))

  }
}
