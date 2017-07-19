package projecteuler

/**
  * Created by Administrator on 19/07/2017.
  */
object SumSquareDiff{
  def sumOfSquares(max : Int): Double = (1 to max).map(math.pow(_, 2)).sum
  def squareOfSums(max : Int): Double = math.pow((1 to max).sum, 2)
  def diffBetweenSquareAndSum(max : Int): Double = squareOfSums(max) - sumOfSquares(max)
}
