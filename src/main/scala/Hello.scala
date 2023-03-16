@main def start():Unit = {

  val fruits: List[String] = "apples" :: ("oranges" :: ("pears" :: Nil))
  val numbers: List[Int] = 1 :: (2 :: (3 :: (4 :: Nil)))

  /*
  println(numbers.tail)
  println(numbers.tail.tail)
  println(numbers.tail.tail.tail)
  println(numbers.tail.tail.tail.tail)
  */

  // Version 1
  /*
  def eval(e: Expression): Int = {
    if (e.isNumber) e.getNum
    else if (e.isAdd) eval(e.getLeft) + eval(e.getRight)
    else throw new Error("Expresion desconocida" + e)
  }
  */

  // Version 2
  def eval(e: Expression): Int = e match
    case Number(n) => n
    case Add(e1, e2) => eval(e1) + eval(e2)


  def calcularSumaElementosLista(lista: List[Int]): Int = lista match
    case Nil => 0
    case x:: Nil => x
    case x:: xs => x + calcularSumaElementosLista(xs)


  def agregarElementoFinal( l: List[Int], number: Int ): List[Int] = l match
    case Nil => number :: l
    // case x :: Nil => l :+ number
    case x :: xs => x :: agregarElementoFinal(xs, number)


  def retornarImpares(lista: List[Int]): List[Int] = lista match
    case Nil => Nil
    case x :: Nil => if (x % 2 != 0) x :: Nil else Nil
    case x :: xs => if (x % 2 != 0) x :: retornarImpares(xs) else retornarImpares(xs)


  def multiplosDeCinco(lista: List[Int]): Int = lista match
    case Nil => 0
    case x :: Nil => if (x % 5 == 0) x else 0
    case x :: xs => if (x % 5 == 0) x + multiplosDeCinco(xs) else multiplosDeCinco(xs)


  def existeCadena(lista: List[String], s: String): Boolean = lista match
    case Nil => false
    case x :: Nil => if (x == s) true else false
    case x :: tail => if (x == s) true else existeCadena(tail, s)


}