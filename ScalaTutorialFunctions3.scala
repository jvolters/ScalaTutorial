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
	
	// variable number of arguments
	def getSum(args : Int*) : Int = {
		var sum : Int = 0
		for(num <- args){
		sum+=num
		}
		sum
	}
	
	println("Get Sum "+ getSum(1,2,3,4,5,6))
	
	}
}
