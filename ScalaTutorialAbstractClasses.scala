import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	def main(args: Array[String]){
 
	// ---------- CLASSES ----------
		
		val fang = new Wolf("Fang")
		fang.moveSpeed = 36.0
		println(fang.move)
	
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
	
	// Inheritance *****************************************************************************************
	class Dog(name : String, sound: String, growl: String) extends Animal(name, sound){
		def this(name: String, sound: String){
		this("No Name", sound, "No Growl")
		this.setName(name)
		}
		
		def this(name: String){
		this("No Name", "No Sound", "No Growl")
		this.setName(name)
		}
		
		def this(){
		this("No Name", "No Sound", "No Growl")
		}
		
		override def toString(): String = {
			return "%s with the id %d says %s or %s".format(this.name, this.id, this.sound, this.growl)
		}
		
	}
	
	// Abstract Class ****************************************************************************************
	abstract class Mammal(val name: String) {
		var moveSpeed: Double // abstract field, does not have value assigned to it.
		
		def move : String // abstract method, does not get parameters, only return type (String) i.e., no method body
	}
	
	class Wolf(name : String) extends Mammal(name){
		var moveSpeed = 35.0
		
		def move = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)
		
	}
	
	
	
	
	
} // END OF SCALA
