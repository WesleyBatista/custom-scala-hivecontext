package example

import org.apache.spark.sql.hive.{HiveContext}


class MyCustomHiveContext(hiveContext: HiveContext)  extends Serializable {
    
    def sayHi(name: String): Unit = {
        println(name)
    }

}
