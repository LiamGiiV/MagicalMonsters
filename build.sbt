ThisBuild / name := "Magical Monsters"
ThisBuild / version := "0.0.0.1"
ThisBuild / scalaVersion := "3.1.3"
//ThisBuild / version := "0.1.0-SNAPSHOT"
//ThisBuild / organization := "com.scenario_world"
//ThisBuild / organizationName := "Scenario World"

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
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.12"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.12" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.12" % "test"
