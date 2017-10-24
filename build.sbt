name := "google-maps-services-scala"

version := "0.1"

scalaVersion := "2.12.3"

libraryDependencies ++= {

  val AkkaHttp = "10.0.10"
  val ScalaTest = "3.0.4"

  Seq(
    "com.typesafe.akka" %% "akka-http" % AkkaHttp,
    "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttp,
    "org.scalactic" %% "scalactic" % ScalaTest,
    "org.scalatest" %% "scalatest" % ScalaTest % "test"
  )
}