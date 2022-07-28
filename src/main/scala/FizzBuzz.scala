object FizzBuzz{
  def generate(number: Int): String = {
    //imperative solution
//    val resultArr = new Array[String](number)
//    for( current <- 1 to number){
//      if(current % 3 == 0 && current % 5 == 0) {
//        resultArr(current-1) = "FizzBuzz"
//      } else if(current % 3 == 0){
//        resultArr(current-1) = "Fizz"
//      } else if(current % 5 == 0){
//        resultArr(current-1) = "Buzz"
//      } else {
//        resultArr(current-1) = s"$current"
//      }
//    }
//    resultArr.filter(_ != null).mkString(", ")
    //functional solution
//    val arr = Array.range(1, number).map(_.toString)
    (1 to number).map(replaceNumber(_)).mkString(", ")
  }
  def divisibleBy(divisor: Int, current: Int) = current % divisor == 0

  def replaceNumber(x: Int):String = {
    if(divisibleBy(15, x)) "FizzBuzz"
    else if(divisibleBy(3, x)) "Fizz"
    else if(divisibleBy(5, x)) "Buzz"
    else x.toString
  }
}
