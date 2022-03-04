fun main(){
    println(doSomething(1))
    println(fix())

    // 1.具名函数参数 如果使用命名值参，就可以不管值参的顺序
    println(fix(age=10))

    // 中止代码运行 ，抛出异常 内置函数TODO
    TODO("Nothing")
    println("after nothing")

}


private fun doSomething(age:Int=2):String{
    return "result"
}
// 2.设置参数缺省值
fun fix(age:Int=2){
    println("age:$age")
}

/**
 * Unit 函数
 *    没有返回值的函数交Unit函数
 *    输出：
 *        fix2
 *        Kotlin.unit
 */
fun fix2(age:Int=2){
    println("fix2")
}









/**
 * 三台服务器：
 * v1o
 * 3ui
 * 6mr
 *
 *
 *
 *
 *
 */
