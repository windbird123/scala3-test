import scala.concurrent.{Await, ExecutionContext, Future}

case class Nami(x: Int)

object ContextFunction {
  def f()(using executionContext: ExecutionContext): Future[Int] = Future {
    1 * 2
  }

  def g(y: Int)(using nami:Nami, executionContext: ExecutionContext): Future[Int] = Future { nami.x + y }


  def main(args: Array[String]): Unit = {

    val r: (ExecutionContext, Nami) ?=> Future[Int] = for {
      a <- f()
      b <- g(a)
    } yield b


    given ExecutionContext = scala.concurrent.ExecutionContext.global
    given Nami = Nami(10)

    val y = Await.result(r, scala.concurrent.duration.Duration.Inf)
    println(y)
  }
}
