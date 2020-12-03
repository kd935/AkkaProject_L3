name := "Hello Test #1"

version := "1.0"

scalaVersion := "2.10.7"

resolvers += ("Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/").withAllowInsecureProtocol(true)

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.10" % "2.2-M1"