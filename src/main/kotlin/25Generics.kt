// 泛型
/*
class MagicBox<T>(item:T){
    var avaiable=false
    private var subject:T=item
    fun fetch():T?{
        return subject.takeIf { avaiable }
    }
}

class Boy(var name:String,val age:Int)
class Dog(var weight:Int)

fun main() {
    var box1 : MagicBox<Boy> = MagicBox(Boy("Jack",18))


    var box2 : MagicBox<Dog> = MagicBox(Dog(20))

    box1.avaiable=true

    box1.fetch()?.run {
        println("you find $name")
    }

}
*/