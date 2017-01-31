import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	def main(args: Array[String]){
 
	// ---------- CLASSES ----------
		
		val rover = new Animal
		rover.setName("Rover")
		rover.setSound("Woof")
		printf("%s says %s\n", rover.getName, rover.getSound)
		
		val bessie = new Animal
		bessie.setName("Bessie")
		bessie.setSound("Mooooooo")
		printf("%s says %s\n", bessie.getName, bessie.getSound)
		
		val madcow = new Animal
		madcow.setName("Oprah")
		madcow.setSound("MoooooooahHaHaHa! Moo! OKAY? MOOOOOOOOOOOOOOOOOOOOO ah hahahhahahahahahaha."+"\nI am the only mad cow in America!")
		printf("%s says %s\n", madcow.getName, madcow.getSound)
		
		val whiskers = new Animal
		whiskers.setName("Cat")
		printf("%s says %s\n", whiskers.getName, whiskers.getSound)
		
		val dunzel = new Animal
		println(s"${dunzel.getName} is name with id of ${dunzel.id} and a sound of ${dunzel.getSound}")
	
	} // END OF MAIN
	
	class Animal(var name: String, var sound: String){
		// protected var name = "No name"
		this.setName(name)
		
		val id = Animal.newIdNum
		
		def getName() : String = name
		def getSound() : String = sound
		
		def setName (name : String){
			if(!(name.matches(".*\\d+.*"))) // if name passed in does NOT contain any numbers, then I will work with it.
				this.name = name
			else
				this.name = "No Name"
		}
		
		def setSound(sound : String){
			this.sound=sound
		}
		
		def this(name : String){  // only passed in name, but no sound
			this("No Name", "No Sound")
			this.setName(name)
		}
		
		def this(){ // did not pass in name, or sound
		this("No Name", "No Sound")
		}
		
		override def toString() : String =  {
			return "%s with the id %d says %s".format(this.name, this.id, this.sound)
		}
	
	}
	
	// regarding val id = Animal.newIdNum
	// how to create static fields in scala
	// this will incrementally create a new id number to identify each instance of Animal
	object Animal{
		private var idNumber=0
		private def newIdNum = { idNumber += 1; idNumber}
		
	}
	
} // END OF SCALA
