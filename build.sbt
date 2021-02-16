name := "spark-basics"

version := "0.1"

scalaVersion := "2.12.0"

ThisBuild / useCoursier := false

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.0"
