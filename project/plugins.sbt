addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")
//addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.4")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2")

//resolvers += "sbt Bintray" at "http://dl.bintray.com/sbt/sbt-plugin-releases/"

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

