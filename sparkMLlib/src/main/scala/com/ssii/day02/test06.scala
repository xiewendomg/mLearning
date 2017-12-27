package com.ssii.day02

import breeze.linalg.{DenseMatrix, det, inv, svd}

/**
  * Created by xiewendomg on 2017/11/13.
  */
object test06 {
  def main(args: Array[String]): Unit = {
    val a_6=DenseMatrix((1.0,2.0,3.0),(4.0,5.0,6.0),(7.0,8.0,9.0))
    val b_6=DenseMatrix((1.0,1.0,1.0),(1.0,1.0,1.0),(1.0,1.0,1.0))
    println(a_6\b_6)
    println(a_6.t)
    println(det(a_6))
    println(inv(a_6))
    val svd.SVD(u,s,v) =svd(a_6)
    println(a_6.rows)
    println(a_6.cols)

  }
}
