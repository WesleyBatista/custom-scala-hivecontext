package example

import org.apache.spark.sql.hive.{HiveContext}

object env {
      implicit def makeContext(hiveContext: HiveContext): MyCustomHiveContext = 
      new MyCustomHiveContext(hiveContext)
}