/**
 * - main 을 선언
 *    - 실행 예 (using sbt): sbt "runMain chapter01 windbird other1 other2"
 *    - 실행 예 (using scala-cli): scala-cli Chapter01.scala -- windbird other1 other2
 */

@main def chapter01(first: String, others: String*): Unit =
  println(s"Hello $first")
  println(s"Hi ${others.mkString(",")}")
