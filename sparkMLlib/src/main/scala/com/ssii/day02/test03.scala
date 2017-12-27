package com.ssii.day02

import breeze.linalg.{DenseMatrix, DenseVector, argmax, max}

/**
  * Created by xiewendomg on 2017/11/13.
  */
object test03 {

  def main(args: Array[String]): Unit = {
    val a_3=DenseMatrix((1.0,2.0,3.0),(4.0,5.0,6.0))
    val b_3=DenseMatrix((1.0,1.0,1.0),(2.0,2.0,2.0))
//    println(a_3+b_3)
//    println(a_3 :* b_3)
//    println(a_3,"======0======")
//    println(a_3 :/ b_3)
//    println(a_3,"======1=")
//    println(a_3:<b_3)
//    println(a_3,"======2=")
//    println(a_3:==b_3)
    println(a_3:+=b_3)//带有符号=等于给a_3赋值
    println(a_3,"=============")
    println(a_3:*=b_3)
    println(a_3)
    println(max(a_3))
    println(argmax(a_3))
    println(DenseVector(1,2,3,4) dot DenseVector(1,1,1,1))
  }
}
