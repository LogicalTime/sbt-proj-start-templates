resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
resolvers += Resolver.sonatypeRepo("public")
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
resolvers += "Typesafe Releases" at "http://repo.akka.io/releases/"
resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"



addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.1")
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")
addSbtPlugin("io.spray" % "sbt-revolver" % "0.8.0")