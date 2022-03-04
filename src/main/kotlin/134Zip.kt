/**
 * zip
 * 合并两个集合，返回一个包含键值对的新集合
 */
fun main() {
    val employees = listOf("Jack","Rose","Chris","Coraline")
    val clothestSize= listOf("X","XL","XXL","M","")

    employees.zip(clothestSize).easyPrint()

}

fun fun1(){
    println("fun1")
}