// 构造函数
class Player(
    // 临时变量
    _name: String,
    _age: Int,
    _isNormal: Boolean
) {
    var name = _name
    var age = _age
    var isNormal = _isNormal
    // 延迟初始化
    lateinit var subject:String

    // 惰性初始化
    val config by lazy {loadingConfig()}

    private fun loadingConfig():String{
        println("loading")
        return ""
    }
}

fun main() {
    var p = Player("Jack",20,true)
    println(p.subject.chars())
}