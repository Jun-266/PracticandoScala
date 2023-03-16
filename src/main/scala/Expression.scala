trait Expression {

  def isNumber: Boolean
  def isAdd: Boolean
  def getNum: Int
  def getLeft: Expression
  def getRight: Expression

}
