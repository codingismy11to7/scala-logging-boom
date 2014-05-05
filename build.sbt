name := "scala-logging-boom"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
	"com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",
	"ch.qos.logback" % "logback-classic" % "1.1.2"
)

