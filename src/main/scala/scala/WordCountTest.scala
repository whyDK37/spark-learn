package scala


import org.apache.spark.{SparkConf, SparkContext}

// 为了测试 spark 内部原理写的一个程序，读者可以忽略之
object WordCountTest {
  def uuid = java.util.UUID.randomUUID.toString

  def main(args: Array[String]): Unit = {


    val sparkConf = new SparkConf().setAppName("WordCountTest")
    val sc = new SparkContext(sparkConf)

    println(sc)

//    // 生成大约 1G 的数据，目的就是让单词不重复，这样 map-reduce 端无法进行 combine
//    // 注意 reduceByKey 是会在 mapper 端进行 merge 的，类似于 mapreduce 中的 combiner 做的事情
//    val wc = sc.parallelize(1 to 30000000, partition).map(_ => (uuid, 1)).reduceByKey(_ + _)
//
//    wc.saveAsTextFile(outputDir)
//
//    sc.stop()
  }
}