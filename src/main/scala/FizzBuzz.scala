object FizzBuzz{
  def generate(number: Int): String = {
    val resultArr = new Array[String](number)
    for( current <- 1 to number){
      if(current % 3 == 0 && current % 5 == 0) {
        resultArr(current-1) = "FizzBuzz"
      } else if(current % 3 == 0){
        resultArr(current-1) = "Fizz"
      } else if(current % 5 == 0){
        resultArr(current-1) = "Buzz"
      } else {
        resultArr(current-1) = s"$current"
      }
    }
    resultArr.filter(_ != null).mkString(", ")
  }
}
