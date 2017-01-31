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
	
	def getSum(num1 : Int=1, num2 : Int=1) : Int ={
		//return num1+num2
		num1+num2
	}

	println("5 + 4 = " + getSum(5,4))
	
	}
}
