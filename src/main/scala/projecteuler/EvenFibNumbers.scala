package projecteuler

/**
  * Created by Administrator on 19/07/2017.
  */
object EvenFibNumbers extends  App{
  def fibNumbers(max: Int) : List[Int] = {
    def fibNumbersRec(count : Int): Int = count match {
      case 0 => 0
      case 1 => 1
      case _ => fibNumbersRec(count - 2) + fibNumbersRec(count - 1)
    }

    (1 to max).map(index => fibNumbersRec(index)).toList
  }

  def constrainedFibNumber(num : Int) : Boolean = num < 4000000 && num % 2 == 0
}
