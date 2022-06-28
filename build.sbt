ThisBuild / scalaVersion := "3.1.3"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "MagicalMonsters",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.0.0-RC6",
      "dev.zio" %% "zio-test" % "2.0.0-RC6" % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
val AkkaVersion = "2.6.19"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
