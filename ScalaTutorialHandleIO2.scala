import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	def main(args: Array[String]){
		var numberGuess=0

	// You can use string interpolation
	val name = "Randy"
	val age = 61
	val weight = 205.0
	println(s"Hello $name")
 
	println(f"I am ${age + 1} and weigh $weight%.2f")
 
	// printf Style Format Specifiers
	// %c : Characters
	// %d : Integers
	// %f : Floating Point Numbers
	// %s : Strings
	printf("'%5d'\n",5) // Right justify
 
	printf("'%-5d Hi'\n",5) // Left justify
 
	printf("'%05d'\n",5) // Zero Fill
 
	printf("'%.5f'\n",3.14) // 5 decimal minimum & maximum
 
	printf("'%-5s'\n", "Hi") // Left Justify String
 
	// Special Characters : \n, \b, \\, \a

	}
}
