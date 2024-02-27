class Person(val name: String = "Unknown"):
  var age: Int = 1

object Humankind:
  val all: Set[Person] = Set.empty[Person]

val p = new Person()
