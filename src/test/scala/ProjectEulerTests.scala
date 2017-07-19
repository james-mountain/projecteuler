import projecteuler.SumSquareDiff

/**
  * Created by Administrator on 19/07/2017.
  */
class ProjectEulerTests extends BaseTest {
  "10" should "have a square of the sum and sum of the squares difference of" in {
    SumSquareDiff.diffBetweenSquareAndSum(10) should be(2640)
  }

  "100" should "have a square of the sum and sum of the squares difference of" in {
    SumSquareDiff.diffBetweenSquareAndSum(100) should be(25164150)
  }
}
