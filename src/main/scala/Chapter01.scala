/**
 * - main 을 선언
 *    - 실행 예 (using sbt): sbt "runMain main windbird other1 other2"
 *    - 실행 예 (using scala-cli): scala-cli Chapter01.scala -- windbird other1 other2
 */

@main def main(first: String, others: String*): Unit =
  println(s"Hello $first")
  println(s"Hi ${others.mkString(",")}")
