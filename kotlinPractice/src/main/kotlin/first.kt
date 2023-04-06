lateinit var f: String
//Late initialisation

val numbers = arrayOf(1, 2, 3, 4)
val name = arrayOf("1", "2", "3", "4")
val nameString = arrayOf<String>("1", "2", "3", "4")

val num = Array(5, { i -> i * 1 })
// 0 1 2 3 4 5

val numArray = intArrayOf(1, 2)

//Lists or collections
var listOfNames = listOf<String>("Hello", "World", "Suraj")
var mutableListOfNames = mutableListOf<String>("Hello", "World", "Suraj")
val hasMapOfNames = hashMapOf("name" to "Suraj","Nationality" to "Indian")


fun main() {
    println("Hello World")
    val a: Int = 10
    val b: Float = 20.3f
    val c: Boolean = true
    val d: Double = 23.333346
    print(c)
    f = "Suraj"
    println("\n" + "My name is $f and the name length is " + f.length)
    print(num.get(4))
    //nameString.set(7, "7")
    mutableListOfNames.add("Jagtap")
    hasMapOfNames.set("Work", "Job")
}