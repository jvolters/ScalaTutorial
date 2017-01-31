import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	def main(args: Array[String]){
 
	// ---------- HIGHER ORDER FUNCTIONS ----------
		
		val log10Func = log10 _
		
		println(log10Func(1000))
		println("|-----------------------------|")
		List(1000.0, 10000.0).map(log10Func).foreach(println)
		println("|-----------------------------|")
		List(1,2,3,4,5).map((x: Int) => x * 50).foreach(println)
		println("|-----------------------------|")
		List(1,2,3,4,5).filter(_ % 2 ==0).foreach(println)
		println("|-----------------------------|")
		
		def times3(num : Int) = num * 3
		def times4(num : Int) = num * 4
		
		def multIt(func : (Int) => Double, num : Int) = {
			func(num)
		}

		printf("3 * 100 = %.1f\n", multIt(times3, 100))
		printf("4 * 100 = %.1f\n", multIt(times4, 100))
		
		// closure depends on variable outside of the function
		val divisorVal = 5 
		
		val divisor5 = (num : Double) => num / divisorVal
		println("|-----------------------------|")
		println("5 / 5 = " + divisor5(5.0))
		
	} // END OF MAIN
	
		
	
} // END OF SCALA
