object ScalaTutorial {
	def main(args: Array[String]){
		var i=0

    // Function print primes
	// There is no break or continue in Scala
    def printPrimes() {
 
      val primeList = List(1,2,3,5,7,11)
      for (i <- primeList){
 
        // Works like break if you return from a function
        if(i == 11){
          return
        }
 
        // Works like continue
        if (i != 1){
          println(i)
        }
 
      }
 
    }
 
    printPrimes
		
	}
}
