package com.ssii.binomialLogisticRegression

import org.apache.log4j.{Level, Logger}
import org.apache.spark.mllib.classification.{LogisticRegressionModel, LogisticRegressionWithLBFGS, LogisticRegressionWithSGD}
import org.apache.spark.mllib.evaluation.MulticlassMetrics
import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.mllib.util.MLUtils
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xiewendomg on 2017/12/26.
  */
object LogisticRegressionWithLBFGSExample {
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val conf = new SparkConf().setAppName("LogisticRegressionWithLBFGSExample").setMaster("local[1]")
    val sc = new SparkContext(conf)

    // $example on$
    // Load training data in LIBSVM format.
    val data = MLUtils.loadLibSVMFile(sc, "data/mllib/sample_libsvm_data.txt")

    // Split data into training (60%) and test (40%).
    //60%训练集  40%测试集
    val splits = data.randomSplit(Array(0.6, 0.4), seed = 11L)
    val training = splits(0).cache()
    val test = splits(1)

    //参数
    //迭代次数
    val numIterations=100
    //迭代步长
    val stepSize=1
    //每次迭代随机抽取比例
    val miniBatchFraction=0.5
    // Run training algorithm to build the model
    val model = LogisticRegressionWithSGD.train(training,numIterations,stepSize,miniBatchFraction)
    //模型权重
    model.weights

    model.intercept

    // Compute raw scores on the test set.
    val predictionAndLabels = test.map { case LabeledPoint(label, features) =>
      val prediction = model.predict(features)
      //预测值，实际值
      (prediction, label)
    }
    val print_predict=predictionAndLabels.take(20)
    println("predict","\t","lable")
    for(i<-0 to print_predict.length-1){
      println(print_predict(i)._1,"\t",print_predict(i)._2)
    }
    // Get evaluation metrics.
    val metrics = new MulticlassMetrics(predictionAndLabels)
    val accuracy = metrics.accuracy
    println(s"Accuracy = $accuracy")

    // Save and load model
    model.save(sc, "target/tmp/scalaLogisticRegressionWithLBFGSModel")
    val sameModel = LogisticRegressionModel.load(sc,
      "target/tmp/scalaLogisticRegressionWithLBFGSModel")
    // $example off$

    sc.stop()
  }
}
