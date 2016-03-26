
import sbt.Keys._
import sbt._
import sbt.plugins.JvmPlugin

object JavaStandardPlugin extends AutoPlugin {

  override def requires = JvmPlugin


  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    javacOptions in(Compile, compile) ++= Seq("-encoding", "utf8"),
    // Enables publishing to maven repo
    publishMavenStyle := true,
    // Do not append Scala versions to the generated artifacts
    crossPaths := false,
    // This forbids including Scala related libraries into the dependency
    autoScalaLibrary := false,
    //  exportJars := true,
    // You can use junit-interface plugin to run JUnit tests in sbt. First, add junit interface to the library dependency.
    libraryDependencies += "com.novocode" % "junit-interface" % "0.10" % "test"
  )


}