import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	def main(args: Array[String]){
 
	// ---------- MAPS ----------
	// Maps are collections of key value pairs
	
	// Create a Map that can't be changed (Immutable)
	val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "Sue Brown")
	
	// Get value using the key after checking that it exists
	if(employees.contains("Manager"))
	printf("Manager : %s\n", employees("Manager"))
	
	// Create a Mutable map
	val customers = collection.mutable.Map(100 -> "Paul Smith",
	101 -> "Sally Smith")
	
	printf("Cust 1 : %s\n", customers(100))
	
	// Change a value using the key
	customers(100) = "Tom Marks"
	
	// Add an item
	customers(102) = "Megan Swift"	
	
	// Output a Map
	for((k,v) <- customers)
	printf("%d : %s\n", k, v)
			
		
	}
}
