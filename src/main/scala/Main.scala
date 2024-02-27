trait A:
  def child: List[A]

trait B:
  def child: List[B]

class C extends A, B:
  def child: List[A & B] = ???

@main def hello(): Unit =
  val x : A & B = ???
  val ys: List[A] & List[B] = x.child


end hello



