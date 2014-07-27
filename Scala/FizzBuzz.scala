object FizzBuzz {
	def main(args: Array[String]) {
      var i = 0;
      for( i <- 1 until 101){
         if(i%15==0){
         	println("FizzBuzz")
         } else if (i%3==0) {
         	println("Fizz")
         } else if (i%5==0) {
         	println("Buzz")
         } else {
         	println( i );
         }         
      }
	}
}