import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	def main(args: Array[String]){
 
	// def funcName (param1:dataType, param2:dataType) : returnType = {
	//     function body
	//     return valueToReturn
	// }
	
	// recursion (function calls itself)
	def factorial(num : BigInt) : BigInt = {
		if(num <=1)
			1
		else
			num * factorial(num-1)
	}
	
	println("Factorial of 4 = " + factorial(4))
	
	// pass 1 : num = 4 * factorial(3) = 4 * 6 = 24
	// pass 2 : num = 3 * factorial(2) = 3 * 2 = 6
	// pass 3 : num = 4 * factorial(1) 1=1, so 2 * 1 = 2
	
	}
}
