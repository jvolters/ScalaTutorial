import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	def main(args: Array[String]){
		var numberGuess=0

	var randSent = "I saw a dragon fly by"
 
	// Get the 3rd index value
	println("3rd Index : " + randSent(3))
	
	println("String length: " + randSent.length)

	println(randSent.concat(" and explode"))
	
	println("Are strings equal? " +"I saw a dragon".equals(randSent))

	println("'dragon' starts at index: " +
	randSent.indexOf("dragon"))
	
	val randSentArray = randSent.toArray
	
	for(v <- randSentArray)
	println(v)
	

	}
}
