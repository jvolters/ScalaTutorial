import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter // read & write to a file
import scala.io.Source     // read & write to a file

object ScalaTutorial {
	def main(args: Array[String]){
 
	// ---------- FILE I/O ----------

		val writer = new PrintWriter("c:\\Users\\npdjvolters\\text.txt")
		writer.write("Just some text\n And some more text.")
		writer.close()
		
		val textFromFile=Source.fromFile("c:\\Users\\npdjvolters\\text.txt", "UTF-8")
		
		val lineIterator = textFromFile.getLines
		for(line <- lineIterator)
		println(line)
		
		textFromFile.close()
		
	} // END OF MAIN
	
		
	
} // END OF SCALA
