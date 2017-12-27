package com.ssii.day02

import breeze.linalg.{DenseMatrix, DenseVector}
import breeze.linalg._
import breeze.numerics._
/**
  * Breeze 元素访问
  * Created by xiewendomg on 2017/11/12.
  */
object test02 {

  def main(args: Array[String]): Unit = {
    val a=DenseVector(1,2,3,4,5,6,7,8,9,10)
    //val b=a(0)
    // println(a(1))
    /*println("a(1 to 4)=",a(1 to 4))
    println("a(5 to 0 by -1)=",a(5 to 0 by -1))
    println("a(1 to -1)=",a(1 to -1))
    println("a(-1)=",a(-1))*/
//    val m=DenseMatrix((1.0,2.0,3.0),(4.0,5.0,6.0))
//    println(m(0,1))
//    println(m(::,1))//向量
//    val m_1=DenseMatrix((1.0,2.0,3.0),(3.0,4.0,5.0))//从列开始数
//    println(m_1.reshape(3,2))
//    println(m_1.toDenseVector)
//
//    val m_3=DenseMatrix((1.0,2.0,3.0),(4.0,5.0,6.0),(7.0,8.0,9.0))
//    println(lowerTriangular(m_3))
    //println(upperTriangular(m_3))
//    println(diag(m_3))
//    m_3(::,2) :=6.0
    //println(m_3)
//    m_3(1 to 2 ,1 to 2) :=5.0
//    println(m_3)
//    val a_1=DenseVector(1,2,3,4,5,6,7,8,9,10)
//    a_1(1 to 4 ) :=DenseVector(2,2,2,2)
//    println(a_1)
     val a1=DenseMatrix((1.0,2.0,3.0),(4.0,5.0,6.0))
    val a2=DenseMatrix((1.0,1.0,1.0),(2.0,2.0,2.0))
    println(DenseMatrix.vertcat(a1,a2))
    println(DenseMatrix.horzcat(a1,a2))
    val b1=DenseVector(1,2,3,4)
    val b2=DenseVector(1,1,1,1)
    println(DenseVector.horzcat(b1,b2))
    println(DenseVector.vertcat(b1,b2))
    val b3=DenseVector.horzcat(b1,b2)
    println(b3(0 to 1,0 to 1))

  }
}
