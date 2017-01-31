object ScalaTutorial {
	def main(args: Array[String]){
		var i=0
		
		val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		
		for(i <- 0 until randLetters.length)
		println(randLetters(i))
	}
}