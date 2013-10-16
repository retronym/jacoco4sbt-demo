resolvers += {
  val base = url("https://dl.dropboxusercontent.com/u/106552/ivy2")
  Resolver.url("retronym dropbox", base)(Resolver.ivyStylePatterns)
}

addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.2-SNAPSHOT")

