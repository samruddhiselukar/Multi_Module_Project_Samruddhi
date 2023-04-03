ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"


lazy val root = (project in file("."))
  .aggregate(core, module1)
  .settings(
    name := "MultiModule"
  )

lazy val core = project
  .settings(
    name := "core"
  )

lazy val module1 = project
  .dependsOn(core)
  .settings(
    name := "module1"
  )
