import Dependency._

name := "sbt-proj-start-templates"

def commonSettings = Seq(
  version := "0.1.0",
  scalaVersion := "2.11.8",
  description := "",
  javacOptions in(Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8", "-encoding", "utf8"),
  libraryDependencies ++= Seq(enumeratum, scalactic, scalatest % Test)
)

lazy val root = project in file(".")

lazy val lab1 = project
  .settings(commonSettings)

lazy val lab2 = project
  .settings(commonSettings)
