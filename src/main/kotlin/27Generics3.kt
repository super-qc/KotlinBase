/*
// 泛型 约束
class MagicBox<T:Human>(item:T){
    var avaiable=false
    private var subject:T=item
    fun fetch():T?{
        return subject.takeIf { avaiable }
    }
    fun<R> fetch(subjectModeFunction:(T)->R):R?{
        return subjectModeFunction(subject).takeIf { avaiable }
    }
}
open class Human(val age:Int)
class Boy(var name:String, age:Int):Human(age)
class Man(var name:String, age:Int):Human(age)
class Dog(var weight:Int)

fun main() {
    var box1 : MagicBox<Boy> = MagicBox(Boy("Jack",18))


    //var box2 : MagicBox<Dog> = MagicBox(Dog(20))

    box1.avaiable=true

    box1.fetch()?.run {
        println("you find $name")
    }

    val man=box1.fetch{
        Man(it.name,it.age.plus(15))
    }

}
*/