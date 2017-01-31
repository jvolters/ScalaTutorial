import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	def main(args: Array[String]){
		var numberGuess=0

	// Handle I/O
	do{
		print("Guess a number ")
		numberGuess = readLine.toInt
		
	} while (numberGuess != 15)
	printf("you guessed the secret number %d\n", 15)
		
	}
}
