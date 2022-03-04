data class Student(var name:String,val age:Int){

    constructor(_name:String):this(_name,10)
}

fun main() {
    val s=Student("Jack")
    val copyS = s.copy("Rose")
    println(s)
    println(copyS)
}