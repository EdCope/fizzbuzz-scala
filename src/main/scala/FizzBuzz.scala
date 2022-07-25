object FizzBuzz{
  def generate(number: Int): String = {
    val resultArr = new Array[String](number)
    for( current <- 1 to number){
      if(current % 3 == 0){
        resultArr(current-1) = "Fizz"
      }else {
        resultArr(current-1) = s"$current"
      }
    }
    resultArr.filter(_ != null).mkString(", ")
  }
}
