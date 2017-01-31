import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	def main(args: Array[String]){
 
	// ---------- ARRAYS ----------
	// You'll use arrays when the size is fixed, or an ArrayBuffer for a
	// variable size
 
	// Create an array of Ints with a max size of 20
	val favNums = new Array[Int](20)
 
	// Create and initialize array in 1 line
	val friends = Array("Bob", "Tom")
	
	// Change the value in an array
	friends(0) = "Sue"
	
	println("Best Friend " + friends(0))
	
	// Create an ArrayBuffer
	val friends2 = ArrayBuffer[String]()
	
	// Add an item to the 1st index
	friends2.insert(0, "Phil")
	
	// Add item to the next available slot
	friends2 += "Mark"
	
	// Add multiple values to the next available slot
	friends2 ++= Array("Susy", "Paul")
	
	// Add items starting at 2nd slot
	friends2.insert(1, "Mike", "Sally", "Sam", "Mary", "Sue")
	
	// Remove the 2nd element
	friends2.remove(1)
	
	// Remove 2 elements starting at the 2nd index
	friends2.remove(1, 2)
	
	// Cycle through and print ArrayList or Array
	var friend : String = " "
	for(friend <- friends2)
		println(friend)
 
	for(j <- 0 to (favNums.length-1)){
		favNums(j) = j
		println(favNums(j))
	} 
	
	val favNumsTimes2 = for(num <-favNums) yield 2 * num
	
	favNumsTimes2.foreach(println)
	
	var favNumsDiv4 = for(num <- favNums if num % 4 ==0) yield num
	
	favNumsDiv4.foreach(println)
	
	var multTable = Array.ofDim[Int](10,10)
	
	for (i <- 0 to 9){
	 for (j <- 0 to 9){
	 multTable(i)(j) = i*j
	 }
	}
	for (i <- 0 to 9){
	 for (j <- 0 to 9){
	 printf("%d : %d = %d\n", i, j, multTable(i)(j))
	 }
	}	
	
	println("Sum :" + favNums.sum)
	println("Min :" + favNums.min)
	println("Max :" + favNums.max)
	
	val sortedNums = favNums.sortWith(_>_) // (_>_) I am thinking this is anonymous nomenclature for i and j
	println(sortedNums.deep.mkString(", "))
	
	
	
	
	}
}
