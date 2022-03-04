
// 单例对象
object ApplicationConfig{

    init {
        println("ApplicationConfig loading")
    }
    fun doSomething(){
        println("doSomething")
    }

}

fun main() {
    ApplicationConfig.doSomething()

}