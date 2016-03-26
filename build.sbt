import Dependency._

name := "sbt-proj-start-templates"
version := "0.1.0"
scalaVersion := "2.11.8"
description := ""


lazy val root = project in file(".")



lazy val proj1 = project
  .settings(
    javacOptions in(Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8", "-encoding", "utf8"),
    libraryDependencies ++= Seq(enumeratum, scalactic, scalatest % Test)
  )