lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "net.symprise",
      scalaVersion := "2.12.6"
    )),
    name := "fp-in-scala"
  )

libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test"
