object ScalaTutorial {
	def main(args: Array[String]){
		var i=0

    // This loop assigns a value to the 1st variable and it retains
    // that value until the 2nd finishes its cycle and then it iterates
    for (i <- 1 to 5; j <- 6 to 10){
      println("i: " + i)
      println("j: " + j)
    }
		
	}
}
