// 泛型 约束 多个参数
class MagicBox<T:Human>(vararg item:T){
    var avaiable=false
    private var subject:Array<out T> = item
    fun fetch(index:Int):T?{
        return subject[index].takeIf { avaiable }
    }
    fun<R> fetch(index: Int,subjectModeFunction:(T)->R):R?{
        return subjectModeFunction(subject[index]).takeIf { avaiable }
    }
}
open class Human(val age:Int)
class Boy(var name:String, age:Int):Human(age)
class Man(var name:String, age:Int):Human(age)
class Dog(var weight:Int)

fun main() {
    var box1 : MagicBox<Boy> = MagicBox(Boy("Jack",18),
        Boy("John",18),
        Boy("Jacky",18))

    //var box2 : MagicBox<Dog> = MagicBox(Dog(20))

    box1.avaiable=true


    box1.fetch(1)?.run {
        println("you find $name")
    }

    val man=box1.fetch(2){
        Man(it.name,it.age.plus(15))
    }

}
