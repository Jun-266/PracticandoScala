case class Add(e1: Expression, e2: Expression) extends Expression{

  def isNumber: Boolean = false
  def isAdd: Boolean = true
  def getNum: Int = throw new Error("Add.getNum")
  def getLeft: Expression = e1
  def getRight: Expression = e2

}
