// 抽象类

abstract class Gun(val range:Int){
    abstract fun pullTrigger():String


}


class AK(val price:Int):Gun(range=500){
    override fun pullTrigger(): String {
        TODO("Not yet implemented")
    }
}