/**
 * - Syntax
 */

// sbt "runMain chapter02 a b c"
@main def chapter02(others: String*): Unit = {
    for
      x <- others
    do println(x)

    for x <- others do println(x)

    val xs = for x <- others yield x.capitalize
    println(xs)

    val z = for
      x <- List("a", "b")
      y <- List(1, 2)
    yield s"$x $y"
    println(z)

    val k = 3
    val a : Int = if k % 2 == 0 then 0 else 1

    val b : Int =
      if k % 2 == 0 then
        0
      else
        1
    println(b)
}
