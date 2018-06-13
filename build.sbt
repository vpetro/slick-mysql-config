
name := "slick-mysql"

scalaVersion := "2.12.1"

val slickVersion = "3.2.3"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.46",
  "com.typesafe.slick" %% "slick" % slickVersion,
  "com.typesafe.slick" %% "slick-hikaricp" % slickVersion
)

