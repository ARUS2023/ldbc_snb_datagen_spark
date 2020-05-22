package ldbc.snb.datagen.spark.generators

import ldbc.snb.datagen.hadoop.serializer.HadoopStaticSerializer
import ldbc.snb.datagen.util.LdbcConfiguration
import org.apache.spark.sql.SparkSession

object SparkStaticGraphSerializer {

  def apply(config: LdbcConfiguration, partitions: Some[Int])(implicit spark: SparkSession): Unit = {
    val serializer = new HadoopStaticSerializer(
      config,
      spark.sparkContext.hadoopConfiguration,
      partitions.getOrElse(spark.sparkContext.defaultParallelism)
    )
    serializer.run()
  }
}
