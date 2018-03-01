lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.11",
      version      := "1.0.0"
    )),
    name := "Custom Hive Context",
    libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.2.1" % "provided"
  )
