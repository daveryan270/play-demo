name := """example-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

// PLay provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

enablePlugins(DebianPlugin)
maintainer := "David Ryan <davidryan0001@gmail.com>"
packageSummary := "My custom package"
packageDescriptionn := "Package"
