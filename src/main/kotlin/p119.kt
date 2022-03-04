/**
 * 泛型扩展函数

// 为字符串增加感叹号
fun String.addExt(amount: Int = 1): String {
    return this + "!".repeat(amount)
}

fun <T>T.easyPrint(): T {
    println(this)
    return this
}

fun main() {
    //println("add".addExt(2))
    "add".easyPrint().addExt(2).easyPrint()

}
 */