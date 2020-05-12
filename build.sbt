name := "IOT-System"
version := "1.0"

scalaVersion := "2.13.1"
libraryDependencies ++= Seq(
     "com.typesafe.akka" %% "akka-actor-typed" % "2.6.5",
     "ch.qos.logback" % "logback-classic" % "1.2.3",
     "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.5" % Test,
     "org.scalatest" %% "scalatest" % "3.1.0" % Test
)
