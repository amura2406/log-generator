name := "LogGenerator"

version := "1.0"

scalaVersion := "2.12.1"

fork in run := true
parallelExecution in Test := false

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.jcenterRepo,
  "Sonatype OSS Releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2")

lazy val versions = new {
  val logback = "1.2.2"
  val slf4j   = "1.7.25"
}

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.5",

  "org.slf4j" % "slf4j-api" % versions.slf4j,
  "ch.qos.logback" % "logback-classic" % versions.logback,
  "ch.qos.logback" % "logback-core" % versions.logback
)