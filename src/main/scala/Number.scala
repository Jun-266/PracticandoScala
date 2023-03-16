case class Number(n: Int) extends Expression {

  def isNumber: Boolean = true
  def isAdd: Boolean = false
  def getNum: Int = n
  def getLeft: Expression = throw new Error("Number.getLeft")
  def getRight: Expression = throw new Error("Number.getRight")

}
