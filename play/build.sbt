name := "playframework-leak-prevention"

organization := "com.github.dwickern"

crossScalaVersions := Seq("2.11.8")
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play" % "2.5.3" % "provided"
)
