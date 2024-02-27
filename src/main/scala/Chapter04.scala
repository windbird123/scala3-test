/**
 * implicit class IntExtension(x: Int)
 */

extension (x: Int)
  def triple(): Int = x * 3

object MyExt:
  extension (x: Int)
    def double(): Int = x * 2

  given Conversion[Int, String] = x => x.toString

@main def chapter04(): Unit = {
  val x = 2.triple()
  println(x)

  import MyExt.double
  val y = 4.double()
  println(y)
}

