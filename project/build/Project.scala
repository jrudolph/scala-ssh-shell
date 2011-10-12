import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {
  val sshd = "org.apache.sshd" % "sshd-core" % "0.6.0"
  val bcprov = "org.bouncycastle" % "bcprov-jdk16" % "1.46"
  val slf4s = "com.weiglewilczek.slf4s" %% "slf4s" % "1.0.7"
}
