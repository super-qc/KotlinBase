fun main() {
    var result= listOf(3,2,1).first().let {
        // it : 前一个匿名函数的返回值
        it*it
    }
    println(result)
}