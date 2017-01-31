object ScalaTutorial {
	def main(args: Array[String]){
		var i=0

		// Store even numbers in a list
		var evenList = for { i <- 1 to 20
		// You can put as many conditons here separated with semicolons
		// as you need
		if (i % 2) == 0
		} yield i
			println("Even List")
			for(i <- evenList)
			println(i)
		
	}
}
