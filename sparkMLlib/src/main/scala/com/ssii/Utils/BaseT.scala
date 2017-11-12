package com.ssii.Utils

import org.apache.spark.sql.SparkSession

trait BaseT {
  val spark=SparkSession.builder().master("local").appName(s"${this.getClass.getName}")getOrCreate()
  import spark.implicits._
}
